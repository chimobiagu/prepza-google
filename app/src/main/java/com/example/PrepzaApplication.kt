package com.example

import android.app.Application
import android.util.Log
import coil.ImageLoader
import coil.ImageLoaderFactory
import coil.disk.DiskCache
import coil.memory.MemoryCache
import coil.util.DebugLogger
import okhttp3.OkHttpClient
import java.io.File
import java.util.concurrent.TimeUnit

class PrepzaApplication : Application(), ImageLoaderFactory {

    override fun onCreate() {
        super.onCreate()
        Log.i("PrepzaApp", "Prepza Application initialized with offline caching and security configs")
    }

    override fun newImageLoader(): ImageLoader {
        val cacheDir = File(cacheDir, "question_image_cache")
        if (!cacheDir.exists()) {
            cacheDir.mkdirs()
        }

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(15, TimeUnit.SECONDS)
            .readTimeout(20, TimeUnit.SECONDS)
            .cache(okhttp3.Cache(File(cacheDir, "http_cache"), 64L * 1024 * 1024))
            .build()

        return ImageLoader.Builder(this)
            .okHttpClient(okHttpClient)
            .memoryCache {
                MemoryCache.Builder(this)
                    .maxSizePercent(0.25)
                    .build()
            }
            .diskCache {
                DiskCache.Builder()
                    .directory(cacheDir)
                    .maxSizeBytes(64L * 1024 * 1024) // 64 MB disk cache for authentic diagrams
                    .build()
            }
            .crossfade(true)
            .respectCacheHeaders(false) // Cache images for offline retrieval even if header varies
            .build()
    }
}
