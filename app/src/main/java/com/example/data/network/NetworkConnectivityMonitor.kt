package com.example.data.network

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import android.net.NetworkRequest
import android.os.Build
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

/**
 * Real-time network connectivity monitor for Prepza.
 * Emits online/offline state and triggers callbacks when internet connectivity is re-established.
 */
class NetworkConnectivityMonitor(private val context: Context) {

    private val TAG = "PrepzaNetworkMonitor"
    private val connectivityManager =
        context.getSystemService(Context.CONNECTIVITY_SERVICE) as? ConnectivityManager

    private val _isOnline = MutableStateFlow(checkInitialConnectivity())
    val isOnline: StateFlow<Boolean> = _isOnline.asStateFlow()

    private var onNetworkRestoredCallback: (() -> Unit)? = null

    fun setOnNetworkRestoredListener(callback: () -> Unit) {
        onNetworkRestoredCallback = callback
    }

    fun isCurrentlyConnected(): Boolean {
        return checkInitialConnectivity()
    }

    private fun checkInitialConnectivity(): Boolean {
        val cm = connectivityManager ?: return false
        return try {
            val activeNetwork = cm.activeNetwork ?: return false
            val caps = cm.getNetworkCapabilities(activeNetwork) ?: return false
            caps.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
        } catch (e: Exception) {
            Log.w(TAG, "Failed to check network connectivity: ${e.message}")
            false
        }
    }

    fun startMonitoring(scope: CoroutineScope) {
        val cm = connectivityManager ?: return
        val request = NetworkRequest.Builder()
            .addCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
            .build()

        try {
            cm.registerNetworkCallback(request, object : ConnectivityManager.NetworkCallback() {
                override fun onAvailable(network: Network) {
                    val wasOffline = !_isOnline.value
                    _isOnline.value = true
                    Log.d(TAG, "Network is available (wasOffline=$wasOffline)")
                    if (wasOffline) {
                        scope.launch(Dispatchers.IO) {
                            try {
                                onNetworkRestoredCallback?.invoke()
                            } catch (e: Exception) {
                                Log.e(TAG, "Error in network restored callback: ${e.message}")
                            }
                        }
                    }
                }

                override fun onLost(network: Network) {
                    _isOnline.value = false
                    Log.d(TAG, "Network connection lost. Operating in 100% offline mode.")
                }

                override fun onCapabilitiesChanged(
                    network: Network,
                    networkCapabilities: NetworkCapabilities
                ) {
                    val hasInternet = networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
                    _isOnline.value = hasInternet
                }
            })
        } catch (e: Exception) {
            Log.w(TAG, "Error registering network callback: ${e.message}")
        }
    }
}
