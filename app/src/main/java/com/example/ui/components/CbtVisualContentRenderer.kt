package com.example.ui.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.ZoomIn
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import coil.compose.SubcomposeAsyncImage
import coil.request.ImageRequest
import com.example.data.db.QuestionEntity
import com.example.data.engine.CbtVisualRegistry
import com.example.data.engine.TableVisualData
import com.example.data.engine.VisualAsset
import com.example.data.engine.VisualType
import com.example.data.supabase.SupabaseConfig
import com.example.ui.theme.*

/**
 * High-performance, first-class CBT Visual Content Renderer.
 * Displays diagrams, geometric figures, apparatus setups, graphs, and tables
 * between the question stem and answer options with interactive pinch/tap-to-zoom.
 */
@Composable
fun CbtVisualContentRenderer(
    question: QuestionEntity,
    modifier: Modifier = Modifier
) {
    val visualAsset = remember(question.id, question.imageUrl) {
        CbtVisualRegistry.getVisualForQuestion(question.id, question.imageUrl)
    }

    if (visualAsset == null && question.imageUrl.isNullOrBlank()) {
        return
    }

    var isZoomModalOpen by remember { mutableStateOf(false) }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .testTag("cbt_visual_container_${question.id}"),
        shape = RoundedCornerShape(14.dp),
        color = MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.45f),
        border = androidx.compose.foundation.BorderStroke(1.dp, MaterialTheme.colorScheme.outlineVariant.copy(alpha = 0.5f))
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Header bar with visual type chip and zoom button
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Surface(
                    shape = RoundedCornerShape(6.dp),
                    color = PrimaryGreen.copy(alpha = 0.12f),
                    border = androidx.compose.foundation.BorderStroke(1.dp, PrimaryGreen.copy(alpha = 0.3f))
                ) {
                    Text(
                        text = visualAsset?.type?.name?.replace('_', ' ') ?: "AUTHENTIC FIGURE",
                        style = MaterialTheme.typography.labelSmall,
                        color = PrimaryGreenDark,
                        fontWeight = FontWeight.Bold,
                        fontSize = 10.sp,
                        modifier = Modifier.padding(horizontal = 6.dp, vertical = 2.dp)
                    )
                }

                IconButton(
                    onClick = { isZoomModalOpen = true },
                    modifier = Modifier.size(28.dp).testTag("cbt_visual_zoom_btn")
                ) {
                    Icon(
                        imageVector = Icons.Default.ZoomIn,
                        contentDescription = "Zoom Diagram",
                        tint = MaterialTheme.colorScheme.primary,
                        modifier = Modifier.size(18.dp)
                    )
                }
            }

            Spacer(modifier = Modifier.height(6.dp))

            // Main Graphic or Table Content
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clickable { isZoomModalOpen = true },
                contentAlignment = Alignment.Center
            ) {
                RenderVisualBody(visualAsset, question)
            }

            if (!visualAsset?.caption.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = visualAsset!!.caption,
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.onSurfaceVariant,
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.Medium
                )
            }
        }
    }

    if (isZoomModalOpen) {
        Dialog(onDismissRequest = { isZoomModalOpen = false }) {
            Surface(
                modifier = Modifier
                    .fillMaxWidth(0.96f)
                    .wrapContentHeight()
                    .padding(16.dp),
                shape = RoundedCornerShape(18.dp),
                color = MaterialTheme.colorScheme.surface,
                shadowElevation = 8.dp
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = visualAsset?.caption ?: "High-Resolution Figure Inspection",
                            style = MaterialTheme.typography.titleSmall,
                            fontWeight = FontWeight.Bold,
                            color = MaterialTheme.colorScheme.onSurface,
                            modifier = Modifier.weight(1f)
                        )
                        IconButton(onClick = { isZoomModalOpen = false }) {
                            Icon(Icons.Default.Close, contentDescription = "Close")
                        }
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .heightIn(min = 280.dp, max = 400.dp),
                        contentAlignment = Alignment.Center
                    ) {
                        RenderVisualBody(visualAsset, question, isExpanded = true)
                    }

                    if (!visualAsset?.altText.isNullOrBlank()) {
                        Spacer(modifier = Modifier.height(10.dp))
                        Text(
                            text = visualAsset!!.altText,
                            style = MaterialTheme.typography.bodySmall,
                            color = MaterialTheme.colorScheme.onSurfaceVariant
                        )
                    }
                }
            }
        }
    }
}

@Composable
private fun RenderVisualBody(
    asset: VisualAsset?,
    question: QuestionEntity,
    isExpanded: Boolean = false
) {
    val rawRef = asset?.diagramKey ?: question.imageUrl ?: ""
    val resolvedUrl = SupabaseConfig.resolveImageUrl(rawRef)
    val height = if (isExpanded) 300.dp else 190.dp

    when {
        asset?.tableData != null -> {
            RenderTableView(asset.tableData, isExpanded)
        }
        !resolvedUrl.isNullOrBlank() -> {
            SubcomposeAsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(resolvedUrl)
                    .crossfade(true)
                    .build(),
                contentDescription = asset?.caption ?: "Question Figure",
                contentScale = ContentScale.Fit,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(height)
                    .padding(4.dp),
                loading = {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        CircularProgressIndicator(
                            color = PrimaryGreen,
                            modifier = Modifier.size(28.dp),
                            strokeWidth = 2.5.dp
                        )
                    }
                },
                error = {
                    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
                        Column(horizontalAlignment = Alignment.CenterHorizontally) {
                            Icon(
                                imageVector = Icons.Default.ZoomIn,
                                contentDescription = null,
                                tint = MaterialTheme.colorScheme.onSurfaceVariant,
                                modifier = Modifier.size(32.dp)
                            )
                            Spacer(modifier = Modifier.height(4.dp))
                            Text(
                                text = asset?.caption ?: "Diagram: ${question.subject} • ${question.topic}",
                                style = MaterialTheme.typography.bodySmall,
                                color = MaterialTheme.colorScheme.onSurfaceVariant,
                                textAlign = TextAlign.Center
                            )
                        }
                    }
                }
            )
        }
        rawRef.startsWith("math_right_triangle") -> {
            MathRightTriangleDiagram(height)
        }
        rawRef.startsWith("math_circle") -> {
            MathCircleTheoremDiagram(height)
        }
        rawRef.startsWith("math_coordinate") || rawRef.startsWith("math_cartesian") -> {
            MathCoordinateGraphDiagram(height)
        }
        rawRef.startsWith("math_venn") -> {
            MathVennDiagram(height)
        }
        rawRef.startsWith("math_parallel") -> {
            MathParallelLinesDiagram(height)
        }
        rawRef.startsWith("math_intersecting") -> {
            MathIntersectingLinesDiagram(height)
        }
        rawRef.startsWith("math_triangle_sine") -> {
            MathTriangleSineDiagram(height)
        }
        rawRef.startsWith("math_pie_chart") -> {
            MathPieChartDiagram(height)
        }
        rawRef.startsWith("phy_vectors_perp") || rawRef.startsWith("phy_vectors") -> {
            PhysicsPerpendicularVectorsDiagram(height)
        }
        rawRef.startsWith("phy_cone") -> {
            PhysicsConeEquilibriumDiagram(height)
        }
        rawRef.startsWith("phy_resistors_parallel") -> {
            PhysicsResistorsParallel3Diagram(height)
        }
        rawRef.startsWith("phy_parallelogram") -> {
            PhysicsParallelogramForcesDiagram(height)
        }
        rawRef.startsWith("phy_force_distance") -> {
            PhysicsForceDistanceGraph(height)
        }
        rawRef.startsWith("phy_inclined_plane") -> {
            PhysicsInclinedPlaneDiagram(height)
        }
        rawRef.startsWith("phy_transverse_wave") -> {
            PhysicsTransverseWaveDiagram(height)
        }
        rawRef.startsWith("phy_refraction") -> {
            PhysicsRefractionDiagram(height)
        }
        rawRef.startsWith("phy_six_cells") -> {
            PhysicsSixCellsDiagram(height)
        }
        rawRef.startsWith("phy_stress_strain") -> {
            PhysicsStressStrainDiagram(height)
        }
        rawRef.startsWith("phy_closed_tube") -> {
            PhysicsClosedTubeDiagram(height)
        }
        rawRef.startsWith("phy_capacitor_network") -> {
            PhysicsCapacitorNetworkDiagram(height)
        }
        rawRef.startsWith("phy_transformer") -> {
            PhysicsTransformerDiagram(height)
        }
        rawRef.startsWith("phy_transistor_iv") -> {
            PhysicsTransistorIvDiagram(height)
        }
        rawRef.startsWith("phy_telescope") -> {
            PhysicsTelescopeLensesDiagram(height)
        }
        rawRef.startsWith("phy_electric_field") -> {
            PhysicsElectricFieldDeflectionDiagram(height)
        }
        rawRef.startsWith("phy_max_min_thermometer") -> {
            PhysicsMaxMinThermometerDiagram(height)
        }
        rawRef.startsWith("phy_circuit") -> {
            PhysicsCircuitDiagram(height)
        }
        rawRef.startsWith("phy_optics") -> {
            PhysicsConvexLensDiagram(height)
        }
        rawRef.startsWith("phy_pulley") -> {
            PhysicsPulleyDiagram(height)
        }
        rawRef.startsWith("phy_velocity") || rawRef.startsWith("phy_vt") -> {
            PhysicsVelocityTimeGraph(height)
        }
        rawRef.startsWith("chem_titration") -> {
            ChemistryTitrationDiagram(height)
        }
        rawRef.startsWith("chem_daniell") -> {
            ChemistryDaniellCellDiagram(height)
        }
        rawRef.startsWith("chem_energy") -> {
            ChemistryEnergyProfileDiagram(height)
        }
        rawRef.startsWith("bio_plant_cell") -> {
            BiologyPlantCellDiagram(height)
        }
        rawRef.startsWith("bio_nephron") -> {
            BiologyNephronDiagram(height)
        }
        rawRef.startsWith("bio_arthropod") -> {
            BiologyArthropodLifecycleDiagram(height)
        }
        rawRef.startsWith("bio_vascular") -> {
            BiologySeedlingVascularDiagram(height)
        }
        else -> {
            DefaultScientificFigure(rawRef.ifBlank { "Scientific Figure" }, height)
        }
    }
}

// --- MATHEMATICS DIAGRAMS ---

@Composable
fun MathRightTriangleDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val w = size.width
            val h = size.height

            val pA = Offset(w * 0.15f, h * 0.85f) // vertex A (acute angle)
            val pB = Offset(w * 0.75f, h * 0.85f) // vertex B (right angle)
            val pC = Offset(w * 0.75f, h * 0.20f) // vertex C (top)

            val path = Path().apply {
                moveTo(pA.x, pA.y)
                lineTo(pB.x, pB.y)
                lineTo(pC.x, pC.y)
                close()
            }

            drawPath(path, color = PrimaryGreenLight.copy(alpha = 0.2f))
            drawPath(path, color = PrimaryGreenDark, style = Stroke(width = 4f))

            // Right angle symbol at B
            val rSize = 20f
            drawLine(PrimaryGreenDark, Offset(pB.x - rSize, pB.y), Offset(pB.x - rSize, pB.y - rSize), strokeWidth = 3f)
            drawLine(PrimaryGreenDark, Offset(pB.x - rSize, pB.y - rSize), Offset(pB.x, pB.y - rSize), strokeWidth = 3f)

            // Theta angle arc at A
            drawArc(
                color = AmberAccent,
                startAngle = -45f,
                sweepAngle = 45f,
                useCenter = false,
                topLeft = Offset(pA.x - 20f, pA.y - 20f),
                size = Size(60f, 60f),
                style = Stroke(width = 3f)
            )
        }

        // Overlay text labels
        Box(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            Text("A (θ)", Modifier.align(Alignment.BottomStart), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 12.sp)
            Text("B (90°)", Modifier.align(Alignment.BottomEnd).padding(end = 40.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 12.sp)
            Text("C", Modifier.align(Alignment.TopEnd).padding(end = 40.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 12.sp)
            Text("Adjacent: 4 cm", Modifier.align(Alignment.BottomCenter).padding(bottom = 4.dp), color = TextSecondary, fontSize = 11.sp)
            Text("Opp: 3 cm", Modifier.align(Alignment.CenterEnd).padding(end = 10.dp), color = TextSecondary, fontSize = 11.sp)
            Text("Hypotenuse (x)", Modifier.align(Alignment.Center).padding(bottom = 30.dp, end = 40.dp), color = BlueAccent, fontWeight = FontWeight.Bold, fontSize = 11.sp)
        }
    }
}

@Composable
fun MathCircleTheoremDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val radius = (size.height / 2f) * 0.85f

            // Circle
            drawCircle(color = PrimaryGreenDark, radius = radius, center = center, style = Stroke(width = 3.5f))
            drawCircle(color = AmberAccent, radius = 6f, center = center)

            // Inscribed quad vertices
            val pA = Offset(center.x - radius * 0.7f, center.y - radius * 0.7f)
            val pB = Offset(center.x + radius * 0.7f, center.y - radius * 0.7f)
            val pC = Offset(center.x + radius * 0.85f, center.y + radius * 0.5f)
            val pD = Offset(center.x - radius * 0.6f, center.y + radius * 0.8f)

            val quad = Path().apply {
                moveTo(pA.x, pA.y)
                lineTo(pB.x, pB.y)
                lineTo(pC.x, pC.y)
                lineTo(pD.x, pD.y)
                close()
            }
            drawPath(quad, color = BlueAccent.copy(alpha = 0.15f))
            drawPath(quad, color = BlueAccent, style = Stroke(width = 3f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("Center O", Modifier.align(Alignment.Center).padding(top = 16.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = AmberAccent)
            Text("A", Modifier.align(Alignment.TopStart).padding(start = 50.dp, top = 20.dp), fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text("B", Modifier.align(Alignment.TopEnd).padding(end = 50.dp, top = 20.dp), fontSize = 12.sp, fontWeight = FontWeight.Bold)
            Text("C (110°)", Modifier.align(Alignment.BottomEnd).padding(end = 35.dp, bottom = 30.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = IncorrectRed)
            Text("D (θ)", Modifier.align(Alignment.BottomStart).padding(start = 50.dp, bottom = 25.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
        }
    }
}

@Composable
fun MathCoordinateGraphDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(18.dp)) {
            val w = size.width
            val h = size.height
            val origin = Offset(w * 0.25f, h * 0.8f)

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 10f), Offset(origin.x, h - 10f), strokeWidth = 3f)
            drawLine(Color.Gray, Offset(10f, origin.y), Offset(w - 10f, origin.y), strokeWidth = 3f)

            // Line L
            val ptY = Offset(origin.x, origin.y - (h * 0.55f))
            val ptX = Offset(origin.x + (w * 0.6f), origin.y)
            drawLine(PrimaryGreenDark, ptY, ptX, strokeWidth = 4f)
            drawCircle(PrimaryGreenDark, 6f, ptY)
            drawCircle(PrimaryGreenDark, 6f, ptX)
        }

        Box(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            Text("y-axis", Modifier.align(Alignment.TopStart).padding(start = 45.dp), fontSize = 11.sp, color = TextSecondary)
            Text("x-axis", Modifier.align(Alignment.BottomEnd).padding(bottom = 15.dp), fontSize = 11.sp, color = TextSecondary)
            Text("(0, 3)", Modifier.align(Alignment.CenterStart).padding(start = 30.dp, bottom = 40.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
            Text("(4, 0)", Modifier.align(Alignment.BottomCenter).padding(start = 90.dp, bottom = 2.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
        }
    }
}

// --- PHYSICS DIAGRAMS ---

@Composable
fun PhysicsCircuitDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val w = size.width
            val h = size.height
            val padX = 40f
            val padY = 25f

            // Main wire loop
            drawRoundRect(
                color = Color(0xFF0369A1),
                topLeft = Offset(padX, padY),
                size = Size(w - 2 * padX, h - 2 * padY),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(14f, 14f),
                style = Stroke(width = 3.5f)
            )

            // Battery (DC) on left vertical branch
            val leftMid = Offset(padX, h / 2f)
            drawLine(Color.White, Offset(padX, leftMid.y - 25f), Offset(padX, leftMid.y + 25f), strokeWidth = 8f)
            drawLine(Color(0xFF0369A1), Offset(padX - 16f, leftMid.y - 12f), Offset(padX + 16f, leftMid.y - 12f), strokeWidth = 5f)
            drawLine(Color(0xFF0369A1), Offset(padX - 8f, leftMid.y + 12f), Offset(padX + 8f, leftMid.y + 12f), strokeWidth = 3f)

            // Parallel split on right side
            val splitX = w * 0.5f
            drawLine(Color(0xFF0369A1), Offset(splitX, padY), Offset(splitX, h - padY), strokeWidth = 3f)

            // Resistor 1 (Top parallel branch)
            drawRect(Color(0xFFF59E0B), Offset(w * 0.65f, padY - 10f), Size(50f, 20f))
            // Resistor 2 (Bottom parallel branch)
            drawRect(Color(0xFFF59E0B), Offset(w * 0.65f, h - padY - 10f), Size(50f, 20f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("12 V", Modifier.align(Alignment.CenterStart).padding(start = 8.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
            Text("R₁ = 4 Ω", Modifier.align(Alignment.TopCenter).padding(start = 90.dp, top = 2.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = OrangeAccent)
            Text("R₂ = 6 Ω", Modifier.align(Alignment.BottomCenter).padding(start = 90.dp, bottom = 2.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = OrangeAccent)
            Text("Total Current (I) = ?", Modifier.align(Alignment.Center).padding(end = 40.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
        }
    }
}

@Composable
fun PhysicsConvexLensDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            val midY = size.height / 2f
            val midX = size.width / 2f

            // Principal axis
            drawLine(Color.Gray, Offset(10f, midY), Offset(size.width - 10f, midY), strokeWidth = 2.5f)

            // Converging lens vertical line with arrows
            drawLine(Color(0xFF0284C7), Offset(midX, 20f), Offset(midX, size.height - 20f), strokeWidth = 4f)
            // Lens arrow heads
            drawLine(Color(0xFF0284C7), Offset(midX - 10f, 30f), Offset(midX, 20f), strokeWidth = 3f)
            drawLine(Color(0xFF0284C7), Offset(midX + 10f, 30f), Offset(midX, 20f), strokeWidth = 3f)

            // Object arrow (upright, beyond 2F)
            val objX = midX - (size.width * 0.35f)
            drawLine(PrimaryGreenDark, Offset(objX, midY), Offset(objX, midY - 50f), strokeWidth = 4f)
            drawLine(PrimaryGreenDark, Offset(objX - 6f, midY - 40f), Offset(objX, midY - 50f), strokeWidth = 3f)
            drawLine(PrimaryGreenDark, Offset(objX + 6f, midY - 40f), Offset(objX, midY - 50f), strokeWidth = 3f)

            // Light rays
            drawLine(Color(0xFFEF4444), Offset(objX, midY - 50f), Offset(midX, midY - 50f), strokeWidth = 2f)
            drawLine(Color(0xFFEF4444), Offset(midX, midY - 50f), Offset(size.width * 0.85f, midY + 50f), strokeWidth = 2f)
            drawLine(Color(0xFF10B981), Offset(objX, midY - 50f), Offset(size.width * 0.85f, midY + 50f), strokeWidth = 2f)

            // Image arrow (inverted, real)
            val imgX = size.width * 0.85f
            drawLine(IncorrectRed, Offset(imgX, midY), Offset(imgX, midY + 50f), strokeWidth = 4f)
        }

        Box(modifier = Modifier.fillMaxSize().padding(6.dp)) {
            Text("Object (u = 20 cm)", Modifier.align(Alignment.CenterStart).padding(start = 14.dp, bottom = 65.dp), fontSize = 10.sp, color = PrimaryGreenDark, fontWeight = FontWeight.Bold)
            Text("Lens (f = 15 cm)", Modifier.align(Alignment.TopCenter), fontSize = 10.sp, color = BlueAccent, fontWeight = FontWeight.Bold)
            Text("Real Image (v = ?)", Modifier.align(Alignment.CenterEnd).padding(end = 10.dp, top = 65.dp), fontSize = 10.sp, color = IncorrectRed, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun PhysicsPulleyDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            // Ceiling bracket
            drawLine(Color.DarkGray, Offset(midX - 50f, 15f), Offset(midX + 50f, 15f), strokeWidth = 6f)

            // Top fixed pulley
            drawCircle(Color(0xFF64748B), radius = 22f, center = Offset(midX, 45f), style = Stroke(width = 4f))

            // Bottom movable pulley
            drawCircle(Color(0xFF0284C7), radius = 22f, center = Offset(midX, 120f), style = Stroke(width = 4f))

            // Ropes
            drawLine(Color.Black, Offset(midX - 22f, 45f), Offset(midX - 22f, 120f), strokeWidth = 2.5f)
            drawLine(Color.Black, Offset(midX + 22f, 45f), Offset(midX + 22f, 120f), strokeWidth = 2.5f)
            // Effort pull
            drawLine(Color(0xFFEF4444), Offset(midX + 22f, 45f), Offset(midX + 60f, 130f), strokeWidth = 2.5f)

            // Suspended load box
            drawRect(Color(0xFFF59E0B), Offset(midX - 25f, 148f), Size(50f, 30f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Fixed Pulley", Modifier.align(Alignment.TopCenter).padding(start = 90.dp, top = 30.dp), fontSize = 10.sp, color = TextSecondary)
            Text("Effort (E)", Modifier.align(Alignment.CenterEnd).padding(end = 15.dp), fontSize = 10.sp, color = IncorrectRed, fontWeight = FontWeight.Bold)
            Text("Load (L)", Modifier.align(Alignment.BottomCenter).padding(bottom = 6.dp), fontSize = 10.sp, color = OrangeAccent, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun PhysicsVelocityTimeGraph(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val origin = Offset(40f, size.height - 30f)
            val w = size.width
            val h = size.height

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 15f), origin, strokeWidth = 3f)
            drawLine(Color.Gray, origin, Offset(w - 15f, origin.y), strokeWidth = 3f)

            // Trapezoid path
            val p0 = origin
            val p1 = Offset(origin.x + (w * 0.25f), 40f)
            val p2 = Offset(origin.x + (w * 0.65f), 40f)
            val p3 = Offset(w - 30f, origin.y)

            val trap = Path().apply {
                moveTo(p0.x, p0.y)
                lineTo(p1.x, p1.y)
                lineTo(p2.x, p2.y)
                lineTo(p3.x, p3.y)
                close()
            }

            drawPath(trap, color = PrimaryGreenLight.copy(alpha = 0.25f))
            drawPath(trap, color = PrimaryGreenDark, style = Stroke(width = 3.5f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("v (m/s)", Modifier.align(Alignment.TopStart).padding(start = 8.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("20 m/s", Modifier.align(Alignment.TopStart).padding(start = 2.dp, top = 25.dp), fontSize = 10.sp, color = PrimaryGreenDark, fontWeight = FontWeight.Bold)
            Text("t (seconds)", Modifier.align(Alignment.BottomEnd).padding(bottom = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Area = Total Distance", Modifier.align(Alignment.Center), fontSize = 11.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
        }
    }
}

// --- CHEMISTRY DIAGRAMS ---

@Composable
fun ChemistryTitrationDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            val midX = size.width / 2f
            val baseH = size.height

            // Retort stand
            drawRect(Color.DarkGray, Offset(midX - 70f, baseH - 20f), Size(140f, 10f))
            drawLine(Color.DarkGray, Offset(midX - 50f, 15f), Offset(midX - 50f, baseH - 20f), strokeWidth = 5f)

            // Clamp arm
            drawLine(Color.Gray, Offset(midX - 50f, 60f), Offset(midX, 60f), strokeWidth = 4f)

            // Burette tube
            drawRect(Color(0xFF38BDF8).copy(alpha = 0.25f), Offset(midX - 10f, 20f), Size(20f, 110f))
            drawRect(Color(0xFF0284C7), Offset(midX - 10f, 20f), Size(20f, 110f), style = Stroke(width = 2.5f))
            // Stopcock tap
            drawCircle(Color(0xFFEF4444), 6f, Offset(midX, 130f))

            // Conical flask
            val fTop = Offset(midX - 10f, 140f)
            val flaskPath = Path().apply {
                moveTo(midX - 10f, 140f)
                lineTo(midX - 35f, baseH - 22f)
                lineTo(midX + 35f, baseH - 22f)
                lineTo(midX + 10f, 140f)
                close()
            }
            drawPath(flaskPath, color = AmberAccent.copy(alpha = 0.3f))
            drawPath(flaskPath, color = Color.DarkGray, style = Stroke(width = 2.5f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("Burette (Acid)", Modifier.align(Alignment.TopCenter).padding(start = 90.dp, top = 30.dp), fontSize = 11.sp, color = BlueAccent, fontWeight = FontWeight.Bold)
            Text("Conical Flask (Base)", Modifier.align(Alignment.BottomCenter).padding(start = 120.dp, bottom = 12.dp), fontSize = 11.sp, color = AmberAccent, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ChemistryDaniellCellDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            val w = size.width
            val h = size.height

            // Left beaker (Zn half-cell)
            drawRect(Color(0xFF94A3B8).copy(alpha = 0.3f), Offset(w * 0.15f, h * 0.35f), Size(w * 0.3f, h * 0.55f))
            drawRect(Color.DarkGray, Offset(w * 0.15f, h * 0.35f), Size(w * 0.3f, h * 0.55f), style = Stroke(width = 3f))
            // Zn electrode
            drawRect(Color.Gray, Offset(w * 0.25f, h * 0.2f), Size(18f, h * 0.55f))

            // Right beaker (Cu half-cell)
            drawRect(Color(0xFF38BDF8).copy(alpha = 0.35f), Offset(w * 0.55f, h * 0.35f), Size(w * 0.3f, h * 0.55f))
            drawRect(Color.DarkGray, Offset(w * 0.55f, h * 0.35f), Size(w * 0.3f, h * 0.55f), style = Stroke(width = 3f))
            // Cu electrode
            drawRect(Color(0xFFB45309), Offset(w * 0.65f, h * 0.2f), Size(18f, h * 0.55f))

            // Salt bridge (inverted U-tube)
            val bridgePath = Path().apply {
                moveTo(w * 0.32f, h * 0.6f)
                lineTo(w * 0.32f, h * 0.32f)
                lineTo(w * 0.68f, h * 0.32f)
                lineTo(w * 0.68f, h * 0.6f)
            }
            drawPath(bridgePath, color = Color(0xFF10B981), style = Stroke(width = 8f))

            // Wire & Voltmeter
            drawLine(Color.Black, Offset(w * 0.26f, h * 0.2f), Offset(w * 0.45f, h * 0.1f), strokeWidth = 2.5f)
            drawLine(Color.Black, Offset(w * 0.66f, h * 0.2f), Offset(w * 0.55f, h * 0.1f), strokeWidth = 2.5f)
            drawCircle(Color.White, 14f, Offset(w * 0.5f, h * 0.1f))
            drawCircle(Color.Black, 14f, Offset(w * 0.5f, h * 0.1f), style = Stroke(width = 2.5f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(6.dp)) {
            Text("Zn / Zn²⁺ (-)", Modifier.align(Alignment.BottomStart).padding(start = 20.dp, bottom = 4.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Salt Bridge (KNO₃)", Modifier.align(Alignment.Center).padding(bottom = 20.dp), fontSize = 10.sp, color = PrimaryGreenDark, fontWeight = FontWeight.Bold)
            Text("Cu²⁺ / Cu (+)", Modifier.align(Alignment.BottomEnd).padding(end = 20.dp, bottom = 4.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = OrangeAccent)
            Text("V", Modifier.align(Alignment.TopCenter).padding(top = 8.dp), fontSize = 11.sp, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
fun ChemistryEnergyProfileDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val origin = Offset(35f, size.height - 25f)
            val w = size.width
            val h = size.height

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 15f), origin, strokeWidth = 3f)
            drawLine(Color.Gray, origin, Offset(w - 15f, origin.y), strokeWidth = 3f)

            // Reactants plateau
            val rY = origin.y - (h * 0.45f)
            drawLine(PrimaryGreenDark, Offset(origin.x, rY), Offset(origin.x + 50f, rY), strokeWidth = 4f)

            // Activation hump
            val peakY = 30f
            val curve = Path().apply {
                moveTo(origin.x + 50f, rY)
                quadraticTo(w * 0.5f, peakY, origin.x + (w * 0.6f), origin.y - (h * 0.25f))
                lineTo(w - 20f, origin.y - (h * 0.25f))
            }
            drawPath(curve, color = IncorrectRed, style = Stroke(width = 3.5f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Potential Energy", Modifier.align(Alignment.TopStart).padding(start = 2.dp), fontSize = 9.sp, fontWeight = FontWeight.Bold)
            Text("Ea (Activation)", Modifier.align(Alignment.TopCenter).padding(top = 4.dp), fontSize = 10.sp, color = IncorrectRed, fontWeight = FontWeight.Bold)
            Text("Reactants", Modifier.align(Alignment.CenterStart).padding(start = 40.dp, bottom = 10.dp), fontSize = 10.sp, color = PrimaryGreenDark, fontWeight = FontWeight.Bold)
            Text("Products (ΔH < 0)", Modifier.align(Alignment.BottomEnd).padding(end = 15.dp, bottom = 25.dp), fontSize = 10.sp, color = BlueAccent, fontWeight = FontWeight.Bold)
            Text("Reaction Progress →", Modifier.align(Alignment.BottomCenter).padding(bottom = 2.dp), fontSize = 9.sp, color = TextSecondary)
        }
    }
}

// --- BIOLOGY DIAGRAMS ---

@Composable
fun BiologyPlantCellDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // Outer cell wall (hexagonal/rectangular)
            drawRoundRect(
                color = Color(0xFF15803D),
                topLeft = Offset(w * 0.08f, h * 0.1f),
                size = Size(w * 0.84f, h * 0.8f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(24f, 24f),
                style = Stroke(width = 6f)
            )

            // Inner cell membrane
            drawRoundRect(
                color = Color(0xFF86EFAC),
                topLeft = Offset(w * 0.12f, h * 0.14f),
                size = Size(w * 0.76f, h * 0.72f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(18f, 18f),
                style = Stroke(width = 2.5f)
            )

            // Large central sap vacuole
            drawRoundRect(
                color = Color(0xFFBAE6FD).copy(alpha = 0.5f),
                topLeft = Offset(w * 0.25f, h * 0.25f),
                size = Size(w * 0.5f, h * 0.5f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(16f, 16f)
            )
            drawRoundRect(
                color = Color(0xFF0284C7),
                topLeft = Offset(w * 0.25f, h * 0.25f),
                size = Size(w * 0.5f, h * 0.5f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(16f, 16f),
                style = Stroke(width = 2.5f)
            )

            // Nucleus (pushed to periphery)
            drawCircle(Color(0xFF6366F1), radius = 20f, center = Offset(w * 0.2f, h * 0.35f))

            // Chloroplasts (green oval discs)
            drawOval(Color(0xFF16A34A), Offset(w * 0.75f, h * 0.22f), Size(24f, 14f))
            drawOval(Color(0xFF16A34A), Offset(w * 0.76f, h * 0.65f), Size(24f, 14f))
            drawOval(Color(0xFF16A34A), Offset(w * 0.22f, h * 0.72f), Size(24f, 14f))
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("I. Cell Wall", Modifier.align(Alignment.TopStart).padding(start = 12.dp, top = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
            Text("II. Vacuole", Modifier.align(Alignment.Center), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
            Text("III. Chloroplast", Modifier.align(Alignment.TopEnd).padding(end = 12.dp, top = 8.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = Color(0xFF16A34A))
            Text("IV. Nucleus", Modifier.align(Alignment.CenterStart).padding(start = 8.dp, bottom = 40.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = PurpleAccent)
        }
    }
}

@Composable
fun BiologyNephronDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // Bowman's Capsule (cup shape)
            val bowmanCenter = Offset(w * 0.2f, h * 0.35f)
            drawArc(
                color = Color(0xFFDC2626),
                startAngle = -120f,
                sweepAngle = 240f,
                useCenter = false,
                topLeft = Offset(bowmanCenter.x - 22f, bowmanCenter.y - 22f),
                size = Size(44f, 44f),
                style = Stroke(width = 4f)
            )
            // Glomerulus knot inside
            drawCircle(Color(0xFFEF4444), 10f, bowmanCenter)

            // Proximal tubule
            val tubule = Path().apply {
                moveTo(bowmanCenter.x + 22f, bowmanCenter.y)
                quadraticTo(w * 0.35f, h * 0.2f, w * 0.42f, h * 0.35f)
                // Loop of Henle descending and ascending
                lineTo(w * 0.42f, h * 0.85f)
                quadraticTo(w * 0.48f, h * 0.95f, w * 0.54f, h * 0.85f)
                lineTo(w * 0.54f, h * 0.35f)
                // Distal convoluted tubule to collecting duct
                quadraticTo(w * 0.65f, h * 0.2f, w * 0.75f, h * 0.35f)
            }
            drawPath(tubule, color = Color(0xFF0284C7), style = Stroke(width = 4f))

            // Collecting duct (vertical trunk)
            drawLine(Color(0xFF0284C7), Offset(w * 0.75f, h * 0.15f), Offset(w * 0.75f, h * 0.95f), strokeWidth = 6f)
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("P: Bowman's Capsule", Modifier.align(Alignment.TopStart).padding(start = 6.dp, top = 16.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = IncorrectRed)
            Text("Q: Proximal Tubule", Modifier.align(Alignment.TopCenter).padding(top = 2.dp), fontSize = 10.sp, color = BlueAccent)
            Text("R: Loop of Henle", Modifier.align(Alignment.BottomCenter).padding(bottom = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
            Text("S: Collecting Duct", Modifier.align(Alignment.TopEnd).padding(end = 4.dp, top = 20.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = PrimaryGreenDark)
        }
    }
}

@Composable
fun BiologyArthropodLifecycleDiagram(height: androidx.compose.ui.unit.Dp) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite)
            .padding(8.dp),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SpecimenBadge("I. Grasshopper", "Adult Insect Pest")
            SpecimenBadge("II. Grain Weevil", "Storage Pest")
        }
        Row(modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceEvenly) {
            SpecimenBadge("III. Housefly Pupa", "Vector Stage")
            SpecimenBadge("IV. Stem-Borer Larva", "Destructive Crop Pest", highlight = true)
        }
    }
}

@Composable
fun BiologySeedlingVascularDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            val groundY = size.height * 0.65f

            // Ground line
            drawLine(Color(0xFF78350F), Offset(20f, groundY), Offset(size.width - 20f, groundY), strokeWidth = 3f)

            // Stem
            drawLine(Color(0xFF15803D), Offset(midX, groundY), Offset(midX, 30f), strokeWidth = 8f)

            // Xylem Arrow I (Upward)
            drawLine(Color(0xFF0284C7), Offset(midX - 16f, groundY), Offset(midX - 16f, 40f), strokeWidth = 3.5f)
            // Phloem Arrow II (Downward/bidirectional)
            drawLine(Color(0xFFF59E0B), Offset(midX + 16f, 40f), Offset(midX + 16f, groundY), strokeWidth = 3.5f)
        }

        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Arrow I: Xylem (Water/Minerals ↑)", Modifier.align(Alignment.CenterStart).padding(start = 14.dp, bottom = 30.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
            Text("Arrow II: Phloem (Sucrose Translocation)", Modifier.align(Alignment.CenterEnd).padding(end = 14.dp, bottom = 30.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = OrangeAccent)
            Text("Line IV: Soil Boundary", Modifier.align(Alignment.BottomCenter).padding(bottom = 2.dp), fontSize = 10.sp, color = TextSecondary)
        }
    }
}

@Composable
private fun SpecimenBadge(title: String, subtitle: String, highlight: Boolean = false) {
    Surface(
        shape = RoundedCornerShape(8.dp),
        color = if (highlight) AmberAccent.copy(alpha = 0.15f) else SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(1.dp, if (highlight) AmberAccent else BorderSubtle),
        modifier = Modifier.width(155.dp).padding(4.dp)
    ) {
        Column(modifier = Modifier.padding(6.dp), horizontalAlignment = Alignment.CenterHorizontally) {
            Text(title, fontWeight = FontWeight.Bold, fontSize = 11.sp, color = if (highlight) AmberAccent else TextPrimary)
            Text(subtitle, fontSize = 9.5.sp, color = TextSecondary)
        }
    }
}

// --- DATA TABLE RENDERER ---

@Composable
fun RenderTableView(tableData: TableVisualData, isExpanded: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(8.dp))
            .background(SurfaceWhite)
            .border(1.dp, BorderSubtle, RoundedCornerShape(8.dp))
            .padding(8.dp)
    ) {
        if (!tableData.title.isNullOrBlank()) {
            Text(
                text = tableData.title,
                style = MaterialTheme.typography.labelMedium,
                fontWeight = FontWeight.Bold,
                color = PrimaryGreenDark,
                modifier = Modifier.padding(bottom = 6.dp)
            )
        }

        // Table Header
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(PrimaryGreen.copy(alpha = 0.15f))
                .padding(vertical = 6.dp, horizontal = 4.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            tableData.headers.forEach { header ->
                Text(
                    text = header,
                    fontWeight = FontWeight.Bold,
                    fontSize = 11.sp,
                    color = PrimaryGreenDark,
                    modifier = Modifier.weight(1f),
                    textAlign = TextAlign.Center
                )
            }
        }

        Divider(color = BorderSubtle, thickness = 1.dp)

        // Table Rows
        tableData.rows.forEachIndexed { index, row ->
            val rowBg = if (index % 2 == 0) SurfaceWhite else MaterialTheme.colorScheme.surfaceVariant.copy(alpha = 0.3f)
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(rowBg)
                    .padding(vertical = 5.dp, horizontal = 4.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                row.forEach { cell ->
                    Text(
                        text = cell,
                        fontSize = 10.5.sp,
                        color = TextPrimary,
                        modifier = Modifier.weight(1f),
                        textAlign = TextAlign.Center
                    )
                }
            }
            if (index < tableData.rows.size - 1) {
                Divider(color = BorderSubtle.copy(alpha = 0.5f), thickness = 0.5.dp)
            }
        }

        if (!tableData.footnote.isNullOrBlank()) {
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = "* ${tableData.footnote}",
                fontSize = 9.sp,
                color = TextSecondary,
                modifier = Modifier.padding(top = 2.dp)
            )
        }
    }
}

@Composable
fun DefaultScientificFigure(name: String, height: androidx.compose.ui.unit.Dp) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
        modifier = Modifier.fillMaxWidth().height(height)
    ) {
        Box(contentAlignment = Alignment.Center) {
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Text("Scientific Figure", fontWeight = FontWeight.Bold, color = PrimaryGreen, fontSize = 13.sp)
                Spacer(modifier = Modifier.height(4.dp))
                Text(name, color = TextSecondary, fontSize = 11.sp)
            }
        }
    }
}

// ==========================================
// AUTHENTIC EXAM COMPOSABLE DIAGRAMS
// ==========================================

@Composable
fun MathVennDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height
            val r = h * 0.28f

            val cP = Offset(w * 0.38f, h * 0.42f)
            val cQ = Offset(w * 0.62f, h * 0.42f)
            val cR = Offset(w * 0.50f, h * 0.68f)

            // Draw shaded intersections (P ∩ Q) and (P ∩ R)
            drawCircle(Color(0xFF38BDF8).copy(alpha = 0.25f), radius = r, center = cP)
            drawCircle(Color(0xFF818CF8).copy(alpha = 0.25f), radius = r, center = cQ)
            drawCircle(Color(0xFF34D399).copy(alpha = 0.25f), radius = r, center = cR)

            // Outline circles
            drawCircle(Color(0xFF0284C7), radius = r, center = cP, style = Stroke(width = 3f))
            drawCircle(Color(0xFF4F46E5), radius = r, center = cQ, style = Stroke(width = 3f))
            drawCircle(Color(0xFF059669), radius = r, center = cR, style = Stroke(width = 3f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("P", Modifier.align(Alignment.TopStart).padding(start = 60.dp, top = 10.dp), fontWeight = FontWeight.Bold, color = Color(0xFF0284C7), fontSize = 14.sp)
            Text("Q", Modifier.align(Alignment.TopEnd).padding(end = 60.dp, top = 10.dp), fontWeight = FontWeight.Bold, color = Color(0xFF4F46E5), fontSize = 14.sp)
            Text("R", Modifier.align(Alignment.BottomCenter).padding(bottom = 8.dp), fontWeight = FontWeight.Bold, color = Color(0xFF059669), fontSize = 14.sp)
            Text("Shaded: (P ∩ Q) ∪ (P ∩ R)", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
        }
    }
}

@Composable
fun MathParallelLinesDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            val k = Offset(w * 0.15f, h * 0.85f)
            val l = Offset(w * 0.35f, h * 0.20f)
            val m = Offset(w * 0.85f, h * 0.20f)
            val n = Offset(w * 0.65f, h * 0.85f)

            // Parallel lines KL and NM
            drawLine(PrimaryGreenDark, k, l, strokeWidth = 3.5f)
            drawLine(PrimaryGreenDark, n, m, strokeWidth = 3.5f)

            // Transversals
            drawLine(Color.DarkGray, k, n, strokeWidth = 2.5f) // KN
            drawLine(Color.DarkGray, l, m, strokeWidth = 2.5f) // LM
            drawLine(Color(0xFF0284C7), l, n, strokeWidth = 2.5f) // LN (bisector)
            drawLine(Color(0xFFEF4444), k, m, strokeWidth = 2.5f) // KM
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("L (54°)", Modifier.align(Alignment.TopStart).padding(start = 70.dp, top = 10.dp), fontWeight = FontWeight.Bold, fontSize = 11.sp)
            Text("M", Modifier.align(Alignment.TopEnd).padding(end = 25.dp, top = 10.dp), fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text("K (35°)", Modifier.align(Alignment.BottomStart).padding(start = 20.dp, bottom = 10.dp), fontWeight = FontWeight.Bold, fontSize = 11.sp)
            Text("N", Modifier.align(Alignment.BottomEnd).padding(end = 70.dp, bottom = 10.dp), fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text("KL // NM, LN bisects ∠KNM", Modifier.align(Alignment.TopCenter), color = TextSecondary, fontSize = 10.sp)
        }
    }
}

@Composable
fun MathIntersectingLinesDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val w = size.width
            val h = size.height

            // Line 1
            drawLine(Color.DarkGray, Offset(w * 0.1f, h * 0.2f), Offset(w * 0.9f, h * 0.8f), strokeWidth = 3f)
            // Line 2
            drawLine(Color.DarkGray, Offset(w * 0.1f, h * 0.8f), Offset(w * 0.9f, h * 0.2f), strokeWidth = 3f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            Text("q°", Modifier.align(Alignment.CenterStart).padding(start = 70.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 13.sp)
            Text("30°", Modifier.align(Alignment.CenterEnd).padding(end = 70.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 13.sp)
            Text("(p + 2q)°", Modifier.align(Alignment.BottomCenter).padding(bottom = 14.dp), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 12.sp)
        }
    }
}

@Composable
fun MathTriangleSineDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            val pA = Offset(w * 0.12f, h * 0.80f)
            val pB = Offset(w * 0.82f, h * 0.80f)
            val pC = Offset(w * 0.55f, h * 0.25f)

            val path = Path().apply {
                moveTo(pA.x, pA.y)
                lineTo(pB.x, pB.y)
                lineTo(pC.x, pC.y)
                close()
            }
            drawPath(path, color = PrimaryGreenLight.copy(alpha = 0.2f))
            drawPath(path, color = PrimaryGreenDark, style = Stroke(width = 3.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("30°", Modifier.align(Alignment.BottomStart).padding(start = 45.dp, bottom = 18.dp), fontWeight = FontWeight.Bold, color = OrangeAccent, fontSize = 11.sp)
            Text("60°", Modifier.align(Alignment.BottomEnd).padding(end = 45.dp, bottom = 18.dp), fontWeight = FontWeight.Bold, color = OrangeAccent, fontSize = 11.sp)
            Text("x", Modifier.align(Alignment.TopStart).padding(start = 70.dp, top = 35.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 13.sp)
            Text("10 cm", Modifier.align(Alignment.TopEnd).padding(end = 60.dp, top = 35.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 12.sp)
        }
    }
}

@Composable
fun MathPieChartDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(12.dp)) {
            val center = Offset(size.width / 2f, size.height / 2f)
            val radius = (size.height / 2f) * 0.85f

            // Gari 70° (from 0 to 70)
            drawArc(Color(0xFF38BDF8), 0f, 70f, true, Offset(center.x - radius, center.y - radius), Size(radius * 2, radius * 2))
            // Rice 80° (from 70 to 150)
            drawArc(Color(0xFF34D399), 70f, 80f, true, Offset(center.x - radius, center.y - radius), Size(radius * 2, radius * 2))
            // Beans 50° (from 150 to 200)
            drawArc(Color(0xFFFBBF24), 150f, 50f, true, Offset(center.x - radius, center.y - radius), Size(radius * 2, radius * 2))
            // Yam 160° (from 200 to 360)
            drawArc(Color(0xFFF87171), 200f, 160f, true, Offset(center.x - radius, center.y - radius), Size(radius * 2, radius * 2))

            drawCircle(Color.White, radius, center, style = Stroke(width = 2.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Gari: 70°", Modifier.align(Alignment.CenterEnd).padding(end = 10.dp), fontWeight = FontWeight.Bold, fontSize = 10.sp, color = Color(0xFF0284C7))
            Text("Rice: 80° (₦8,000)", Modifier.align(Alignment.BottomEnd).padding(end = 15.dp, bottom = 4.dp), fontWeight = FontWeight.Bold, fontSize = 10.sp, color = PrimaryGreenDark)
            Text("Beans: 50°", Modifier.align(Alignment.BottomStart).padding(start = 15.dp, bottom = 4.dp), fontWeight = FontWeight.Bold, fontSize = 10.sp, color = OrangeAccent)
            Text("Yam: 160°", Modifier.align(Alignment.TopStart).padding(start = 20.dp, top = 6.dp), fontWeight = FontWeight.Bold, fontSize = 10.sp, color = IncorrectRed)
        }
    }
}

@Composable
fun PhysicsPerpendicularVectorsDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(18.dp)) {
            val origin = Offset(size.width * 0.35f, size.height * 0.75f)

            // Vertical vector (6.0 N)
            drawLine(PrimaryGreenDark, origin, Offset(origin.x, origin.y - 120f), strokeWidth = 4f)
            // Arrowhead
            drawLine(PrimaryGreenDark, Offset(origin.x - 6f, origin.y - 110f), Offset(origin.x, origin.y - 120f), strokeWidth = 3f)
            drawLine(PrimaryGreenDark, Offset(origin.x + 6f, origin.y - 110f), Offset(origin.x, origin.y - 120f), strokeWidth = 3f)

            // Horizontal vector (8.0 N)
            drawLine(BlueAccent, origin, Offset(origin.x + 140f, origin.y), strokeWidth = 4f)
            drawLine(BlueAccent, Offset(origin.x + 130f, origin.y - 6f), Offset(origin.x + 140f, origin.y), strokeWidth = 3f)
            drawLine(BlueAccent, Offset(origin.x + 130f, origin.y + 6f), Offset(origin.x + 140f, origin.y), strokeWidth = 3f)

            // Right angle symbol
            val r = 16f
            drawLine(Color.DarkGray, Offset(origin.x + r, origin.y), Offset(origin.x + r, origin.y - r), strokeWidth = 2f)
            drawLine(Color.DarkGray, Offset(origin.x + r, origin.y - r), Offset(origin.x, origin.y - r), strokeWidth = 2f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("6.0 N", Modifier.align(Alignment.CenterStart).padding(start = 55.dp, bottom = 40.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 12.sp)
            Text("8.0 N", Modifier.align(Alignment.BottomCenter).padding(start = 60.dp, bottom = 12.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 12.sp)
            Text("Resultant R = √(6² + 8²) = 10.0 N", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 11.sp)
        }
    }
}

@Composable
fun PhysicsConeEquilibriumDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // Cone X (Inverted on apex)
            val xApex = Offset(w * 0.2f, h * 0.75f)
            val pathX = Path().apply {
                moveTo(xApex.x, xApex.y)
                lineTo(xApex.x - 30f, h * 0.25f)
                lineTo(xApex.x + 30f, h * 0.25f)
                close()
            }
            drawPath(pathX, color = Color(0xFFEF4444).copy(alpha = 0.25f))
            drawPath(pathX, color = Color(0xFFEF4444), style = Stroke(width = 3f))

            // Cone Y (Upright on base)
            val yApex = Offset(w * 0.5f, h * 0.25f)
            val pathY = Path().apply {
                moveTo(yApex.x, yApex.y)
                lineTo(yApex.x - 35f, h * 0.75f)
                lineTo(yApex.x + 35f, h * 0.75f)
                close()
            }
            drawPath(pathY, color = Color(0xFF10B981).copy(alpha = 0.25f))
            drawPath(pathY, color = Color(0xFF10B981), style = Stroke(width = 3f))

            // Cone Z (Lying on side - neutral equilibrium)
            val zApex = Offset(w * 0.72f, h * 0.5f)
            val pathZ = Path().apply {
                moveTo(zApex.x, zApex.y)
                lineTo(zApex.x + 55f, h * 0.3f)
                lineTo(zApex.x + 55f, h * 0.7f)
                close()
            }
            drawPath(pathZ, color = Color(0xFF0284C7).copy(alpha = 0.25f))
            drawPath(pathZ, color = Color(0xFF0284C7), style = Stroke(width = 3f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("X (Unstable)", Modifier.align(Alignment.BottomStart).padding(start = 30.dp), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 10.sp)
            Text("Y (Stable)", Modifier.align(Alignment.BottomCenter), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 10.sp)
            Text("Z (Neutral)", Modifier.align(Alignment.BottomEnd).padding(end = 30.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsResistorsParallel3Diagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // Outer loop
            drawLine(Color(0xFF0284C7), Offset(w * 0.2f, h * 0.2f), Offset(w * 0.8f, h * 0.2f), strokeWidth = 3f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.2f, h * 0.5f), Offset(w * 0.8f, h * 0.5f), strokeWidth = 3f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.2f, h * 0.8f), Offset(w * 0.8f, h * 0.8f), strokeWidth = 3f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.2f, h * 0.2f), Offset(w * 0.2f, h * 0.8f), strokeWidth = 3f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.8f, h * 0.2f), Offset(w * 0.8f, h * 0.8f), strokeWidth = 3f)

            // Resistor boxes
            drawRect(OrangeAccent, Offset(w * 0.45f, h * 0.15f), Size(w * 0.15f, h * 0.1f))
            drawRect(OrangeAccent, Offset(w * 0.45f, h * 0.45f), Size(w * 0.15f, h * 0.1f))
            drawRect(OrangeAccent, Offset(w * 0.45f, h * 0.75f), Size(w * 0.15f, h * 0.1f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("2 Ω", Modifier.align(Alignment.TopCenter).padding(top = 8.dp), fontWeight = FontWeight.Bold, fontSize = 11.sp, color = TextPrimary)
            Text("4 Ω", Modifier.align(Alignment.Center), fontWeight = FontWeight.Bold, fontSize = 11.sp, color = TextPrimary)
            Text("12 Ω", Modifier.align(Alignment.BottomCenter).padding(bottom = 8.dp), fontWeight = FontWeight.Bold, fontSize = 11.sp, color = TextPrimary)
            Text("12 V Supply", Modifier.align(Alignment.CenterStart).padding(start = 10.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsParallelogramForcesDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            val origin = Offset(midX, size.height * 0.55f)

            // Upward vertical resultant OR
            drawLine(PrimaryGreenDark, origin, Offset(midX, 20f), strokeWidth = 3.5f)
            // Downward tension OT
            drawLine(IncorrectRed, origin, Offset(midX, size.height - 20f), strokeWidth = 3.5f)

            // Component forces OQ (left) and OS (right)
            drawLine(BlueAccent, origin, Offset(midX - 70f, 60f), strokeWidth = 3f)
            drawLine(BlueAccent, origin, Offset(midX + 70f, 60f), strokeWidth = 3f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("R (Resultant)", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
            Text("Q", Modifier.align(Alignment.TopStart).padding(start = 55.dp, top = 35.dp), fontWeight = FontWeight.Bold, fontSize = 11.sp)
            Text("S (8N)", Modifier.align(Alignment.TopEnd).padding(end = 55.dp, top = 35.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 11.sp)
            Text("O", Modifier.align(Alignment.Center).padding(end = 18.dp), fontWeight = FontWeight.Bold, fontSize = 12.sp)
            Text("T", Modifier.align(Alignment.BottomCenter), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 12.sp)
        }
    }
}

@Composable
fun PhysicsForceDistanceGraph(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val origin = Offset(40f, size.height * 0.6f)
            val w = size.width
            val h = size.height

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 15f), Offset(origin.x, h - 15f), strokeWidth = 2.5f)
            drawLine(Color.Gray, Offset(15f, origin.y), Offset(w - 15f, origin.y), strokeWidth = 2.5f)

            // Force graph curve: triangular to 60N at 30m, down to 0 at 60m, negative to -40N at 80m
            val path = Path().apply {
                moveTo(origin.x, origin.y)
                lineTo(origin.x + (w * 0.3f), origin.y - (h * 0.45f))
                lineTo(origin.x + (w * 0.55f), origin.y)
                lineTo(origin.x + (w * 0.75f), origin.y + (h * 0.25f))
            }
            drawPath(path, color = PrimaryGreenDark, style = Stroke(width = 3.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("Force (N)", Modifier.align(Alignment.TopStart).padding(start = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("+60 N", Modifier.align(Alignment.TopStart).padding(start = 2.dp, top = 18.dp), fontSize = 9.sp, color = PrimaryGreenDark, fontWeight = FontWeight.Bold)
            Text("Distance (m)", Modifier.align(Alignment.BottomEnd).padding(bottom = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Work = Area under F-d curve", Modifier.align(Alignment.TopCenter), fontSize = 10.sp, fontWeight = FontWeight.Bold, color = BlueAccent)
        }
    }
}

@Composable
fun PhysicsInclinedPlaneDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val w = size.width
            val h = size.height

            val baseLeft = Offset(w * 0.15f, h * 0.8f)
            val baseRight = Offset(w * 0.85f, h * 0.8f)
            val apex = Offset(w * 0.85f, h * 0.25f)

            // Incline wedge
            val wedge = Path().apply {
                moveTo(baseLeft.x, baseLeft.y)
                lineTo(baseRight.x, baseRight.y)
                lineTo(apex.x, apex.y)
                close()
            }
            drawPath(wedge, color = Color(0xFFF1F5F9))
            drawPath(wedge, color = Color.DarkGray, style = Stroke(width = 3f))

            // Block on incline
            val blockCenter = Offset(w * 0.55f, h * 0.50f)
            drawRect(OrangeAccent, Offset(blockCenter.x - 20f, blockCenter.y - 15f), Size(40f, 25f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(10.dp)) {
            Text("Block", Modifier.align(Alignment.Center).padding(start = 10.dp, bottom = 10.dp), fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 11.sp)
            Text("Angle α", Modifier.align(Alignment.BottomStart).padding(start = 45.dp, bottom = 25.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
            Text("μ = tan α", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 11.sp)
        }
    }
}

@Composable
fun PhysicsTransverseWaveDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midY = size.height / 2f
            val w = size.width

            // Center axis
            drawLine(Color.Gray, Offset(20f, midY), Offset(w - 20f, midY), strokeWidth = 2f)

            // Sinusoidal wave
            val wavePath = Path().apply {
                moveTo(30f, midY)
                val amp = 40f
                val period = (w - 60f) / 2f
                for (x in 0..(w - 60f).toInt()) {
                    val angle = (x / period) * 2 * Math.PI
                    val y = midY - (Math.sin(angle) * amp).toFloat()
                    lineTo(30f + x, y)
                }
            }
            drawPath(wavePath, color = BlueAccent, style = Stroke(width = 3.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Origin O", Modifier.align(Alignment.CenterStart).padding(start = 12.dp, bottom = 20.dp), fontWeight = FontWeight.Bold, fontSize = 10.sp)
            Text("Particle F (at distance x)", Modifier.align(Alignment.Center).padding(start = 40.dp, bottom = 20.dp), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 10.sp)
            Text("Phase difference φ = 2πx/λ", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
        }
    }
}

@Composable
fun PhysicsRefractionDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midY = size.height / 2f
            val midX = size.width / 2f

            // Boundary
            drawLine(Color.DarkGray, Offset(20f, midY), Offset(size.width - 20f, midY), strokeWidth = 3f)

            // Normal line (dashed)
            drawLine(Color.Gray, Offset(midX, 20f), Offset(midX, size.height - 20f), strokeWidth = 2f)

            // Incident ray in glass
            drawLine(IncorrectRed, Offset(midX - 70f, 30f), Offset(midX, midY), strokeWidth = 3f)
            // Refracted ray in water
            drawLine(PrimaryGreenDark, Offset(midX, midY), Offset(midX + 80f, size.height - 30f), strokeWidth = 3f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Glass (n = 1.52)", Modifier.align(Alignment.TopStart).padding(start = 20.dp, top = 8.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 11.sp)
            Text("Incident ray (angle i)", Modifier.align(Alignment.TopCenter).padding(end = 40.dp), color = IncorrectRed, fontSize = 10.sp)
            Text("Water (n = 1.33)", Modifier.align(Alignment.BottomStart).padding(start = 20.dp, bottom = 8.dp), fontWeight = FontWeight.Bold, color = Color(0xFF0284C7), fontSize = 11.sp)
            Text("Refracted ray", Modifier.align(Alignment.BottomEnd).padding(end = 20.dp, bottom = 8.dp), color = PrimaryGreenDark, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsSixCellsDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midY = size.height / 2f
            val w = size.width

            // Main wire
            drawLine(Color(0xFF0284C7), Offset(20f, midY), Offset(w - 20f, midY), strokeWidth = 3f)

            // 6 cell symbols (long line = positive, short thick = negative)
            val step = (w - 80f) / 6f
            for (i in 0..5) {
                val cx = 40f + (i * step)
                drawLine(PrimaryGreenDark, Offset(cx, midY - 20f), Offset(cx, midY + 20f), strokeWidth = 4f)
                drawLine(PrimaryGreenDark, Offset(cx + 10f, midY - 12f), Offset(cx + 10f, midY + 12f), strokeWidth = 6f)
            }
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Six 2V Cells Connected in Series-Parallel Network", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 11.sp)
            Text("Effective e.m.f. = 4V (opposing polarities cancel)", Modifier.align(Alignment.BottomCenter), color = PrimaryGreenDark, fontWeight = FontWeight.Bold, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsStressStrainDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val origin = Offset(40f, size.height - 30f)
            val w = size.width
            val h = size.height

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 20f), origin, strokeWidth = 2.5f)
            drawLine(Color.Gray, origin, Offset(w - 20f, origin.y), strokeWidth = 2.5f)

            // Load-extension curve
            val ptQ = Offset(origin.x + 50f, origin.y - 45f) // Proportional limit
            val ptR = Offset(origin.x + 85f, origin.y - 65f) // Elastic limit
            val ptS = Offset(origin.x + 150f, origin.y - 85f) // Maximum load
            val ptT = Offset(origin.x + 200f, origin.y - 50f) // Breaking point

            drawLine(PrimaryGreenDark, origin, ptQ, strokeWidth = 3f)
            drawLine(PrimaryGreenDark, ptQ, ptR, strokeWidth = 3f)
            drawLine(OrangeAccent, ptR, ptS, strokeWidth = 3f)
            drawLine(IncorrectRed, ptS, ptT, strokeWidth = 3f)

            drawCircle(PrimaryGreenDark, 4f, ptQ)
            drawCircle(PrimaryGreenDark, 5f, ptR)
            drawCircle(OrangeAccent, 4f, ptS)
            drawCircle(IncorrectRed, 4f, ptT)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Load (N)", Modifier.align(Alignment.TopStart).padding(start = 4.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Extension", Modifier.align(Alignment.BottomEnd).padding(bottom = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("R: Elastic Limit", Modifier.align(Alignment.CenterStart).padding(start = 75.dp, bottom = 30.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
        }
    }
}

@Composable
fun PhysicsClosedTubeDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            val h = size.height

            // Closed tube outline
            drawLine(Color.DarkGray, Offset(midX - 35f, 20f), Offset(midX - 35f, h - 30f), strokeWidth = 3f)
            drawLine(Color.DarkGray, Offset(midX + 35f, 20f), Offset(midX + 35f, h - 30f), strokeWidth = 3f)
            drawLine(Color.DarkGray, Offset(midX - 35f, h - 30f), Offset(midX + 35f, h - 30f), strokeWidth = 5f) // Closed bottom

            // Standing wave envelope (fundamental quarter wave)
            val pTopL = Offset(midX - 30f, 25f)
            val pTopR = Offset(midX + 30f, 25f)
            val pNode = Offset(midX, h - 30f)

            drawLine(BlueAccent, pTopL, pNode, strokeWidth = 2.5f)
            drawLine(BlueAccent, pTopR, pNode, strokeWidth = 2.5f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Antinode (Open)", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
            Text("Length L = λ / 4", Modifier.align(Alignment.CenterEnd).padding(end = 40.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
            Text("Node (Closed)", Modifier.align(Alignment.BottomCenter).padding(bottom = 4.dp), fontWeight = FontWeight.Bold, color = TextSecondary, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsCapacitorNetworkDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // 3 parallel capacitors on left
            drawLine(Color(0xFF0284C7), Offset(w * 0.15f, h * 0.25f), Offset(w * 0.45f, h * 0.25f), strokeWidth = 2.5f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.15f, h * 0.50f), Offset(w * 0.45f, h * 0.50f), strokeWidth = 2.5f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.15f, h * 0.75f), Offset(w * 0.45f, h * 0.75f), strokeWidth = 2.5f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.15f, h * 0.25f), Offset(w * 0.15f, h * 0.75f), strokeWidth = 2.5f)
            drawLine(Color(0xFF0284C7), Offset(w * 0.45f, h * 0.25f), Offset(w * 0.45f, h * 0.75f), strokeWidth = 2.5f)

            // Right branch with 2uF and 3uF
            drawLine(Color(0xFF0284C7), Offset(w * 0.45f, h * 0.50f), Offset(w * 0.85f, h * 0.50f), strokeWidth = 2.5f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("2μF || 2μF || 2μF = 6μF", Modifier.align(Alignment.CenterStart).padding(start = 10.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 10.sp)
            Text("Series branch: 2μF, 3μF", Modifier.align(Alignment.CenterEnd).padding(end = 10.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsTransformerDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            val h = size.height

            // Iron Core (rectangular loop)
            drawRoundRect(Color.DarkGray, Offset(midX - 70f, h * 0.2f), Size(140f, h * 0.6f), androidx.compose.ui.geometry.CornerRadius(10f, 10f), style = Stroke(width = 8f))

            // Primary coil left
            drawRect(Color(0xFF0284C7), Offset(midX - 76f, h * 0.35f), Size(12f, h * 0.3f))
            // Secondary coil right
            drawRect(IncorrectRed, Offset(midX + 64f, h * 0.35f), Size(12f, h * 0.3f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Input (Primary)", Modifier.align(Alignment.CenterStart).padding(start = 12.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
            Text("Iron Core", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = TextSecondary, fontSize = 10.sp)
            Text("Output (Secondary)", Modifier.align(Alignment.CenterEnd).padding(end = 12.dp), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsTransistorIvDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(16.dp)) {
            val origin = Offset(40f, size.height - 30f)
            val w = size.width
            val h = size.height

            // Axes
            drawLine(Color.Gray, Offset(origin.x, 15f), origin, strokeWidth = 2.5f)
            drawLine(Color.Gray, origin, Offset(w - 15f, origin.y), strokeWidth = 2.5f)

            // Characteristic curve rising then saturating flat
            val curve = Path().apply {
                moveTo(origin.x, origin.y)
                quadraticTo(origin.x + 40f, origin.y - (h * 0.55f), w - 30f, origin.y - (h * 0.60f))
            }
            drawPath(curve, color = PrimaryGreenDark, style = Stroke(width = 3.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Collector Current (Ic)", Modifier.align(Alignment.TopStart).padding(start = 4.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Voltage (Vce)", Modifier.align(Alignment.BottomEnd).padding(bottom = 2.dp), fontSize = 10.sp, fontWeight = FontWeight.Bold)
            Text("Saturating I-V Characteristic (Graph D)", Modifier.align(Alignment.TopCenter), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 11.sp)
        }
    }
}

@Composable
fun PhysicsTelescopeLensesDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midY = size.height / 2f
            val w = size.width

            // Optical Axis
            drawLine(Color.Gray, Offset(15f, midY), Offset(w - 15f, midY), strokeWidth = 2f)

            // Large objective lens on left
            drawLine(PrimaryGreenDark, Offset(w * 0.25f, 20f), Offset(w * 0.25f, size.height - 20f), strokeWidth = 4f)
            // Smaller eyepiece lens on right
            drawLine(BlueAccent, Offset(w * 0.75f, 40f), Offset(w * 0.75f, size.height - 40f), strokeWidth = 3f)

            // Rays converging
            drawLine(IncorrectRed, Offset(15f, midY - 30f), Offset(w * 0.25f, midY - 30f), strokeWidth = 2f)
            drawLine(IncorrectRed, Offset(w * 0.25f, midY - 30f), Offset(w * 0.55f, midY), strokeWidth = 2f)
            drawLine(IncorrectRed, Offset(w * 0.55f, midY), Offset(w * 0.75f, midY + 15f), strokeWidth = 2f)
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("Objective (fo)", Modifier.align(Alignment.TopStart).padding(start = 40.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 10.sp)
            Text("Eyepiece (fe)", Modifier.align(Alignment.TopEnd).padding(end = 40.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
            Text("Astronomical Telescope in Normal Adjustment", Modifier.align(Alignment.BottomCenter), fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsElectricFieldDeflectionDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val w = size.width
            val h = size.height

            // Upper (+) plate and lower (-) plate
            drawLine(IncorrectRed, Offset(w * 0.2f, h * 0.2f), Offset(w * 0.8f, h * 0.2f), strokeWidth = 4f)
            drawLine(BlueAccent, Offset(w * 0.2f, h * 0.8f), Offset(w * 0.8f, h * 0.8f), strokeWidth = 4f)

            // Field arrows upward
            for (i in 1..4) {
                val ax = w * (0.25f + i * 0.1f)
                drawLine(Color.Gray, Offset(ax, h * 0.75f), Offset(ax, h * 0.25f), strokeWidth = 1.5f)
            }

            // Electron beam curving downward toward (+) or (-) according to diagram
            val beam = Path().apply {
                moveTo(w * 0.1f, h * 0.45f)
                quadraticTo(w * 0.45f, h * 0.45f, w * 0.8f, h * 0.75f)
            }
            drawPath(beam, color = PrimaryGreenDark, style = Stroke(width = 3.5f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("(+) Plate", Modifier.align(Alignment.TopCenter).padding(top = 4.dp), fontWeight = FontWeight.Bold, color = IncorrectRed, fontSize = 10.sp)
            Text("Beam: Electron (Negative charge)", Modifier.align(Alignment.CenterStart).padding(start = 10.dp), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 10.sp)
            Text("(-) Plate", Modifier.align(Alignment.BottomCenter).padding(bottom = 4.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
        }
    }
}

@Composable
fun PhysicsMaxMinThermometerDiagram(height: androidx.compose.ui.unit.Dp) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(height)
            .clip(RoundedCornerShape(10.dp))
            .background(SurfaceWhite),
        contentAlignment = Alignment.Center
    ) {
        Canvas(modifier = Modifier.fillMaxSize().padding(14.dp)) {
            val midX = size.width / 2f
            val h = size.height

            // U-tube
            val uPath = Path().apply {
                moveTo(midX - 45f, 30f)
                lineTo(midX - 45f, h - 35f)
                quadraticTo(midX, h - 15f, midX + 45f, h - 35f)
                lineTo(midX + 45f, 30f)
            }
            drawPath(uPath, color = Color(0xFF0284C7).copy(alpha = 0.2f), style = Stroke(width = 16f))
            drawPath(uPath, color = Color.DarkGray, style = Stroke(width = 2.5f))

            // Bulb P left, bulb R right
            drawCircle(Color(0xFF38BDF8), 16f, Offset(midX - 45f, 25f))
            drawCircle(Color(0xFF38BDF8), 16f, Offset(midX + 45f, 25f))
        }
        Box(modifier = Modifier.fillMaxSize().padding(8.dp)) {
            Text("P: Alcohol", Modifier.align(Alignment.TopStart).padding(start = 45.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
            Text("Q: Mercury (Bend)", Modifier.align(Alignment.BottomCenter), fontWeight = FontWeight.Bold, color = TextPrimary, fontSize = 10.sp)
            Text("R: Alcohol", Modifier.align(Alignment.TopEnd).padding(end = 45.dp), fontWeight = FontWeight.Bold, color = BlueAccent, fontSize = 10.sp)
            Text("Six's Max/Min Thermometer", Modifier.align(Alignment.Center), fontWeight = FontWeight.Bold, color = PrimaryGreenDark, fontSize = 10.sp)
        }
    }
}
