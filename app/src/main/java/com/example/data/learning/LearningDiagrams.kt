package com.example.data.learning

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LearningDiagramViewer(
    diagramId: String,
    modifier: Modifier = Modifier
) {
    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp)),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.5f),
        tonalElevation = 2.dp
    ) {
        when (diagramId) {
            "cell_organelles_overview" -> CellStructureInteractiveDiagram()
            "supply_demand_chart" -> SupplyDemandInteractiveDiagram()
            "electric_circuit" -> ElectricCircuitDiagram()
            else -> DefaultScientificDiagram(diagramId)
        }
    }
}

@Composable
fun CellStructureInteractiveDiagram() {
    var selectedOrganelle by remember { mutableStateOf<Pair<String, String>?>(null) }

    val organelles = listOf(
        Triple("Nucleus", "Directs cell activities; contains DNA and genetic instructions.", Offset(0.5f, 0.45f)),
        Triple("Mitochondria", "Powerhouse generating ATP via aerobic cellular respiration.", Offset(0.25f, 0.3f)),
        Triple("Ribosomes", "Smallest dense granules that synthesize polypeptide chains.", Offset(0.75f, 0.28f)),
        Triple("Endoplasmic Reticulum", "Rough (protein transport) and Smooth (lipid synthesis).", Offset(0.35f, 0.7f)),
        Triple("Golgi Body", "Modifies, packages, and exports cellular proteins and enzymes.", Offset(0.7f, 0.65f))
    )

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Interactive Cell Map",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "Tap any organelle tag to inspect its function",
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )

        Spacer(modifier = Modifier.height(12.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(
                    Brush.radialGradient(
                        colors = listOf(
                            MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.6f),
                            MaterialTheme.colorScheme.surfaceContainerHigh
                        )
                    )
                )
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val w = size.width
                val h = size.height

                // Draw outer plasma membrane
                drawRoundRect(
                    color = Color(0xFF10B981).copy(alpha = 0.4f),
                    topLeft = Offset(w * 0.05f, h * 0.08f),
                    size = Size(w * 0.9f, h * 0.84f),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(40f, 40f),
                    style = Stroke(width = 4f)
                )

                // Draw nucleus
                drawCircle(
                    brush = Brush.radialGradient(
                        colors = listOf(Color(0xFF6366F1), Color(0xFF4338CA))
                    ),
                    radius = w * 0.16f,
                    center = Offset(w * 0.5f, h * 0.48f)
                )

                // Draw nucleolus inside
                drawCircle(
                    color = Color(0xFFC7D2FE),
                    radius = w * 0.05f,
                    center = Offset(w * 0.5f, h * 0.48f)
                )
            }

            // Interactive tags on the cell canvas
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OrganelleChip(organelles[1].first) { selectedOrganelle = organelles[1].first to organelles[1].second }
                    OrganelleChip(organelles[2].first) { selectedOrganelle = organelles[2].first to organelles[2].second }
                }

                Box(
                    modifier = Modifier.fillMaxWidth(),
                    contentAlignment = Alignment.Center
                ) {
                    OrganelleChip(organelles[0].first, isPrimary = true) { selectedOrganelle = organelles[0].first to organelles[0].second }
                }

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OrganelleChip(organelles[3].first) { selectedOrganelle = organelles[3].first to organelles[3].second }
                    OrganelleChip(organelles[4].first) { selectedOrganelle = organelles[4].first to organelles[4].second }
                }
            }
        }

        AnimatedVisibility(visible = selectedOrganelle != null) {
            selectedOrganelle?.let { (name, desc) ->
                Surface(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 10.dp),
                    shape = RoundedCornerShape(10.dp),
                    color = MaterialTheme.colorScheme.primaryContainer.copy(alpha = 0.8f)
                ) {
                    Column(modifier = Modifier.padding(10.dp)) {
                        Text(
                            text = name,
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                        Text(
                            text = desc,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onPrimaryContainer
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun OrganelleChip(
    label: String,
    isPrimary: Boolean = false,
    onClick: () -> Unit
) {
    Surface(
        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        color = if (isPrimary) MaterialTheme.colorScheme.primary else MaterialTheme.colorScheme.surface.copy(alpha = 0.9f),
        tonalElevation = 3.dp,
        modifier = Modifier.height(28.dp)
    ) {
        Row(
            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Box(
                modifier = Modifier
                    .size(6.dp)
                    .clip(CircleShape)
                    .background(if (isPrimary) Color.White else MaterialTheme.colorScheme.primary)
            )
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = label,
                fontSize = 11.sp,
                fontWeight = FontWeight.SemiBold,
                color = if (isPrimary) Color.White else MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Composable
fun SupplyDemandInteractiveDiagram() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Market Equilibrium Curve",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(160.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val w = size.width
                val h = size.height
                val pad = 30f

                // Axes
                drawLine(
                    color = Color.Gray,
                    start = Offset(pad, pad),
                    end = Offset(pad, h - pad),
                    strokeWidth = 3f
                )
                drawLine(
                    color = Color.Gray,
                    start = Offset(pad, h - pad),
                    end = Offset(w - pad, h - pad),
                    strokeWidth = 3f
                )

                // Demand curve (downward sloping)
                drawLine(
                    color = Color(0xFFEF4444),
                    start = Offset(pad + 20f, pad + 15f),
                    end = Offset(w - pad - 20f, h - pad - 15f),
                    strokeWidth = 4f
                )

                // Supply curve (upward sloping)
                drawLine(
                    color = Color(0xFF10B981),
                    start = Offset(pad + 20f, h - pad - 15f),
                    end = Offset(w - pad - 20f, pad + 15f),
                    strokeWidth = 4f
                )

                // Equilibrium point
                val eqX = w / 2f
                val eqY = h / 2f
                drawCircle(
                    color = Color(0xFF3B82F6),
                    radius = 8f,
                    center = Offset(eqX, eqY)
                )
            }
        }

        Spacer(modifier = Modifier.height(8.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text("🔴 Demand (D)", fontSize = 11.sp, color = Color(0xFFEF4444), fontWeight = FontWeight.Bold)
            Text("🔵 Equilibrium (E)", fontSize = 11.sp, color = Color(0xFF3B82F6), fontWeight = FontWeight.Bold)
            Text("🟢 Supply (S)", fontSize = 11.sp, color = Color(0xFF10B981), fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ElectricCircuitDiagram() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Basic Series Circuit Schematic",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(8.dp))

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(140.dp)
                .clip(RoundedCornerShape(12.dp))
                .background(MaterialTheme.colorScheme.surface)
        ) {
            Canvas(modifier = Modifier.fillMaxSize()) {
                val w = size.width
                val h = size.height
                val padX = 40f
                val padY = 30f

                val wireColor = Color(0xFF0284C7)
                // Draw closed loop wire
                drawRoundRect(
                    color = wireColor,
                    topLeft = Offset(padX, padY),
                    size = Size(w - 2 * padX, h - 2 * padY),
                    cornerRadius = androidx.compose.ui.geometry.CornerRadius(16f, 16f),
                    style = Stroke(width = 3f)
                )

                // Battery on top wire
                val topMid = Offset(w / 2f, padY)
                drawCircle(color = Color(0xFF10B981), radius = 10f, center = topMid)

                // Resistor on bottom wire
                val botMid = Offset(w / 2f, h - padY)
                drawRect(
                    color = Color(0xFFF59E0B),
                    topLeft = Offset(botMid.x - 24f, botMid.y - 8f),
                    size = Size(48f, 16f)
                )
            }
        }
    }
}

@Composable
fun DefaultScientificDiagram(title: String) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Scientific Visual Model",
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = title.replace('_', ' ').replaceFirstChar { it.uppercase() },
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
    }
}
