package com.example.ui.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Bolt
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.data.db.UserProfileEntity
import com.example.ui.theme.*

@Composable
fun TrialCountdownBanner(
    profile: UserProfileEntity?,
    onUpgradeClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val isPlus = profile?.isPlusSubscriber == true
    val daysRemaining = profile?.daysRemainingInTrial ?: 20

    Surface(
        shape = RoundedCornerShape(16.dp),
        color = if (isPlus) PaleGreenBg else SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(
            1.dp,
            if (isPlus) PrimaryGreen.copy(alpha = 0.4f) else BorderSubtle
        ),
        modifier = modifier
            .fillMaxWidth()
            .clickable { onUpgradeClick() }
            .testTag("trial_countdown_banner")
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp, vertical = 12.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.weight(1f)
            ) {
                Surface(
                    shape = CircleShape,
                    color = if (isPlus) PrimaryGreen else PrimaryGreenLight.copy(alpha = 0.18f),
                    modifier = Modifier.size(32.dp)
                ) {
                    Box(contentAlignment = Alignment.Center) {
                        Icon(
                            imageVector = if (isPlus) Icons.Default.Star else Icons.Default.Bolt,
                            contentDescription = null,
                            tint = if (isPlus) Color.White else PrimaryGreenDark,
                            modifier = Modifier.size(18.dp)
                        )
                    }
                }

                Spacer(modifier = Modifier.width(12.dp))

                Column {
                    Text(
                        text = if (isPlus) "Prepza Plus" else "Upgrade to Plus",
                        style = MaterialTheme.typography.titleSmall,
                        fontWeight = FontWeight.Bold,
                        color = TextPrimary
                    )
                    Text(
                        text = if (isPlus) "Unlocked" else "₦500 one-time",
                        style = MaterialTheme.typography.bodySmall,
                        color = TextSecondary
                    )
                }
            }

            Surface(
                shape = RoundedCornerShape(8.dp),
                color = if (isPlus) PrimaryGreen.copy(alpha = 0.15f) else PrimaryGreen,
                modifier = Modifier.clickable { onUpgradeClick() }
            ) {
                Text(
                    text = if (isPlus) "Active" else "₦500",
                    color = if (isPlus) PrimaryGreenDark else Color.White,
                    style = MaterialTheme.typography.labelSmall,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(horizontal = 10.dp, vertical = 6.dp)
                )
            }
        }
    }
}
