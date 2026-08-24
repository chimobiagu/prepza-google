package com.example.ui.components

import androidx.compose.animation.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.detectTransformGestures
import androidx.compose.foundation.gestures.detectTapGestures
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.input.pointer.pointerInput
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog
import androidx.compose.ui.window.DialogProperties
import coil.compose.AsyncImagePainter
import coil.compose.SubcomposeAsyncImage
import coil.compose.SubcomposeAsyncImageContent
import coil.request.ImageRequest
import com.example.data.db.QuestionEntity
import com.example.ui.theme.*
import java.util.regex.Pattern

/**
 * Data class representing resolved visual media for a question.
 */
data class QuestionMediaInfo(
    val imageUrl: String? = null,
    val diagramType: String? = null,
    val diagramTitle: String? = null,
    val diagramDescription: String? = null,
    val caption: String? = null
)

/**
 * Helper object to detect and extract image URLs or diagram descriptions from question fields.
 */
object QuestionMediaDetector {

    private val MARKDOWN_IMAGE_PATTERN = Pattern.compile("!\\[(.*?)\\]\\((https?://[^\\s\\)]+)\\)")
    private val HTML_IMAGE_PATTERN = Pattern.compile("<img[^>]+src=[\"'](https?://[^\"']+)[\"'][^>]*>", Pattern.CASE_INSENSITIVE)
    private val BRACKET_IMAGE_PATTERN = Pattern.compile("\\[(?:IMAGE|Image|img|IMG):\\s*(https?://[^\\s\\]]+)\\]")
    private val RAW_URL_PATTERN = Pattern.compile("(https?://[^\\s]+\\.(?:png|jpg|jpeg|webp|svg|gif))", Pattern.CASE_INSENSITIVE)
    private val DIAGRAM_TAG_PATTERN = Pattern.compile("\\[(?:DIAGRAM|Diagram|FIGURE|Figure|CIRCUIT|Circuit|GRAPH|Graph|MAP|Map):\\s*([^\\]]+)\\]")

    /**
     * Resolves all available media info (imageUrl or diagram descriptions) for a given question.
     */
    fun resolveMedia(question: QuestionEntity): QuestionMediaInfo? {
        // 1. Direct imageUrl property on question
        if (!question.imageUrl.isNullOrBlank()) {
            return QuestionMediaInfo(
                imageUrl = question.imageUrl.trim(),
                caption = "${question.subject} • ${question.topic} (${question.year})"
            )
        }

        // 2. Check questionText for markdown image ![alt](url)
        val mdMatcher = MARKDOWN_IMAGE_PATTERN.matcher(question.questionText)
        if (mdMatcher.find()) {
            val alt = mdMatcher.group(1)
            val url = mdMatcher.group(2)
            return QuestionMediaInfo(
                imageUrl = url,
                caption = if (!alt.isNullOrBlank()) alt else "${question.subject} Diagram"
            )
        }

        // 3. Check HTML <img src="...">
        val htmlMatcher = HTML_IMAGE_PATTERN.matcher(question.questionText)
        if (htmlMatcher.find()) {
            return QuestionMediaInfo(
                imageUrl = htmlMatcher.group(1),
                caption = "${question.subject} Diagram"
            )
        }

        // 4. Check [Image: url] tag
        val bracketMatcher = BRACKET_IMAGE_PATTERN.matcher(question.questionText)
        if (bracketMatcher.find()) {
            return QuestionMediaInfo(
                imageUrl = bracketMatcher.group(1),
                caption = "${question.subject} Past Question Diagram"
            )
        }

        // 5. Check raw image URLs in questionText or passageText
        val rawMatcher = RAW_URL_PATTERN.matcher(question.questionText)
        if (rawMatcher.find()) {
            return QuestionMediaInfo(
                imageUrl = rawMatcher.group(1),
                caption = "${question.subject} Figure"
            )
        }

        // 6. Check for diagram tag [DIAGRAM: ...]
        val diagMatcher = DIAGRAM_TAG_PATTERN.matcher(question.questionText)
        if (diagMatcher.find()) {
            val description = diagMatcher.group(1)?.trim() ?: ""
            val type = inferDiagramType(description, question.subject, question.topic)
            return QuestionMediaInfo(
                diagramType = type,
                diagramTitle = "Figure: ${question.topic}",
                diagramDescription = description,
                caption = description
            )
        }

        // 7. Check if passage contains image
        if (!question.passageText.isNullOrBlank()) {
            val passageMdMatcher = MARKDOWN_IMAGE_PATTERN.matcher(question.passageText)
            if (passageMdMatcher.find()) {
                return QuestionMediaInfo(
                    imageUrl = passageMdMatcher.group(2),
                    caption = passageMdMatcher.group(1).ifBlank { "${question.subject} Passage Illustration" }
                )
            }

            val passageBracketMatcher = BRACKET_IMAGE_PATTERN.matcher(question.passageText)
            if (passageBracketMatcher.find()) {
                return QuestionMediaInfo(
                    imageUrl = passageBracketMatcher.group(1),
                    caption = "${question.subject} Passage Illustration"
                )
            }
        }

        // 8. Keyword-based diagram detection for past questions mentioning "in the diagram above", "the figure shows", "from the circuit diagram"
        val lowerText = question.questionText.lowercase()
        if (lowerText.contains("in the diagram") || lowerText.contains("in the circuit") || 
            lowerText.contains("figure above") || lowerText.contains("the diagram below") ||
            lowerText.contains("from the graph") || lowerText.contains("in the illustration")) {
            val type = inferDiagramType(lowerText, question.subject, question.topic)
            return QuestionMediaInfo(
                diagramType = type,
                diagramTitle = "${question.subject} Diagram",
                diagramDescription = "Illustration for ${question.topic}",
                caption = "${question.subject} • ${question.topic}"
            )
        }

        return null
    }

    private fun inferDiagramType(text: String, subject: String, topic: String): String {
        val combined = "$text $subject $topic".lowercase()
        return when {
            combined.contains("circuit") || combined.contains("resistor") || combined.contains("ammeter") || combined.contains("galvanometer") || combined.contains("potentiometer") -> "circuit"
            combined.contains("lens") || combined.contains("mirror") || combined.contains("prism") || combined.contains("ray") || combined.contains("refraction") -> "optics"
            combined.contains("pulley") || combined.contains("inclined plane") || combined.contains("lever") || combined.contains("pendulum") -> "mechanics"
            combined.contains("wave") || combined.contains("sound") || combined.contains("frequency") || combined.contains("resonance") -> "wave"
            combined.contains("cell") || combined.contains("chloroplast") || combined.contains("mitochondria") || combined.contains("nucleus") || combined.contains("membrane") -> "biology_cell"
            combined.contains("flower") || combined.contains("carpel") || combined.contains("stamen") || combined.contains("ovary") -> "biology_flower"
            combined.contains("nephron") || combined.contains("kidney") || combined.contains("glomerulus") || combined.contains("heart") || combined.contains("eye") -> "biology_anatomy"
            combined.contains("titration") || combined.contains("apparatus") || combined.contains("distillation") || combined.contains("electrolysis") || combined.contains("beaker") -> "chemistry_apparatus"
            combined.contains("circle") || combined.contains("tangent") || combined.contains("chord") || combined.contains("arc") || combined.contains("cyclic") -> "math_circle"
            combined.contains("triangle") || combined.contains("trigonometry") || combined.contains("elevation") || combined.contains("depression") || combined.contains("bearing") -> "math_triangle"
            combined.contains("venn") || combined.contains("set") || combined.contains("union") || combined.contains("intersection") -> "math_venn"
            combined.contains("graph") || combined.contains("curve") || combined.contains("parabola") || combined.contains("coordinate") -> "math_graph"
            combined.contains("map") || combined.contains("contour") || combined.contains("relief") || combined.contains("climate") || combined.contains("wind") -> "geography_map"
            else -> "generic_diagram"
        }
    }

    /**
     * Cleans display text by removing explicit raw markdown image or diagram tags so question reads cleanly.
     */
    fun cleanQuestionDisplayText(rawText: String): String {
        var text = rawText
        text = MARKDOWN_IMAGE_PATTERN.matcher(text).replaceAll("")
        text = HTML_IMAGE_PATTERN.matcher(text).replaceAll("")
        text = BRACKET_IMAGE_PATTERN.matcher(text).replaceAll("")
        text = DIAGRAM_TAG_PATTERN.matcher(text).replaceAll("")
        return text.trim()
    }
}

/**
 * Main Question Image & Diagram Viewer Component.
 * Automatically displays image or visual diagram with interactive zoom capabilities.
 */
@Composable
fun QuestionImageViewer(
    question: QuestionEntity,
    modifier: Modifier = Modifier,
    enableZoom: Boolean = true
) {
    val mediaInfo = remember(question.id, question.imageUrl, question.questionText) {
        QuestionMediaDetector.resolveMedia(question)
    } ?: return

    var isZoomModalOpen by remember { mutableStateOf(false) }

    if (isZoomModalOpen && enableZoom) {
        QuestionImageZoomDialog(
            mediaInfo = mediaInfo,
            question = question,
            onDismiss = { isZoomModalOpen = false }
        )
    }

    Surface(
        modifier = modifier
            .fillMaxWidth()
            .clip(RoundedCornerShape(16.dp))
            .clickable(enabled = enableZoom) { isZoomModalOpen = true }
            .testTag("question_image_container"),
        shape = RoundedCornerShape(16.dp),
        color = SurfaceWhite,
        border = androidx.compose.foundation.BorderStroke(1.dp, BorderSubtle),
        shadowElevation = 2.dp
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ) {
            // Header: Diagram / Image badge + Tap to Zoom hint
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.spacedBy(6.dp)
                ) {
                    Surface(
                        shape = CircleShape,
                        color = SoftEmeraldBg,
                        modifier = Modifier.size(24.dp)
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = if (!mediaInfo.imageUrl.isNullOrBlank()) Icons.Outlined.Image else Icons.Outlined.Schema,
                                contentDescription = null,
                                tint = PrimaryGreen,
                                modifier = Modifier.size(14.dp)
                            )
                        }
                    }
                    Text(
                        text = if (!mediaInfo.imageUrl.isNullOrBlank()) "Question Image / Figure" else "Interactive Diagram",
                        style = MaterialTheme.typography.labelSmall,
                        fontWeight = FontWeight.Bold,
                        color = PrimaryGreenDark
                    )
                }

                if (enableZoom) {
                    Surface(
                        shape = RoundedCornerShape(12.dp),
                        color = AppBackground,
                        modifier = Modifier.padding(2.dp)
                    ) {
                        Row(
                            verticalAlignment = Alignment.CenterVertically,
                            modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp)
                        ) {
                            Icon(
                                imageVector = Icons.Outlined.ZoomIn,
                                contentDescription = "Zoom In",
                                tint = TextSecondary,
                                modifier = Modifier.size(14.dp)
                            )
                            Spacer(modifier = Modifier.width(4.dp))
                            Text(
                                text = "Tap to zoom",
                                style = MaterialTheme.typography.labelSmall,
                                color = TextSecondary,
                                fontSize = 11.sp
                            )
                        }
                    }
                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            // Main Media Content (Image or Canvas Diagram)
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .heightIn(min = 160.dp, max = 280.dp)
                    .clip(RoundedCornerShape(12.dp))
                    .background(Color(0xFFF8FAF9)),
                contentAlignment = Alignment.Center
            ) {
                if (!mediaInfo.imageUrl.isNullOrBlank()) {
                    // Render Image via Coil
                    SubcomposeAsyncImage(
                        model = ImageRequest.Builder(LocalContext.current)
                            .data(mediaInfo.imageUrl)
                            .crossfade(true)
                            .build(),
                        contentDescription = mediaInfo.caption ?: "Question Figure",
                        contentScale = ContentScale.Fit,
                        modifier = Modifier
                            .fillMaxWidth()
                            .fillMaxHeight()
                            .padding(8.dp),
                        loading = {
                            Box(
                                modifier = Modifier.fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    CircularProgressIndicator(
                                        color = PrimaryGreen,
                                        modifier = Modifier.size(28.dp),
                                        strokeWidth = 2.5.dp
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = "Loading diagram...",
                                        style = MaterialTheme.typography.labelSmall,
                                        color = TextSecondary,
                                        fontSize = 11.sp
                                    )
                                }
                            }
                        },
                        error = {
                            // Fallback if network fails: show diagram placeholder card
                            Box(
                                modifier = Modifier
                                    .fillMaxSize()
                                    .padding(16.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                                    Icon(
                                        imageVector = Icons.Outlined.BrokenImage,
                                        contentDescription = "Image unavailable",
                                        tint = TextMuted,
                                        modifier = Modifier.size(36.dp)
                                    )
                                    Spacer(modifier = Modifier.height(6.dp))
                                    Text(
                                        text = mediaInfo.caption ?: "Question Diagram Reference",
                                        style = MaterialTheme.typography.bodySmall,
                                        fontWeight = FontWeight.Medium,
                                        color = TextSecondary,
                                        textAlign = TextAlign.Center
                                    )
                                }
                            }
                        }
                    )
                } else {
                    // Render Vector/Canvas Scientific Diagram
                    QuestionCanvasDiagram(
                        diagramType = mediaInfo.diagramType ?: "generic_diagram",
                        title = mediaInfo.diagramTitle ?: question.topic,
                        description = mediaInfo.diagramDescription ?: question.topic,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                            .padding(8.dp)
                    )
                }
            }

            // Caption if available
            if (!mediaInfo.caption.isNullOrBlank()) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = mediaInfo.caption,
                    style = MaterialTheme.typography.bodySmall,
                    color = TextSecondary,
                    fontSize = 12.sp,
                    maxLines = 2,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

/**
 * Full-screen Modal Dialog allowing students to pinch, zoom, and pan high-resolution question images and diagrams.
 */
@Composable
fun QuestionImageZoomDialog(
    mediaInfo: QuestionMediaInfo,
    question: QuestionEntity,
    onDismiss: () -> Unit
) {
    var scale by remember { mutableFloatStateOf(1f) }
    var offset by remember { mutableStateOf(Offset.Zero) }

    Dialog(
        onDismissRequest = onDismiss,
        properties = DialogProperties(usePlatformDefaultWidth = false)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(Color.Black.copy(alpha = 0.92f))
                .pointerInput(Unit) {
                    detectTransformGestures { _, pan, zoom, _ ->
                        scale = (scale * zoom).coerceIn(1f, 4f)
                        offset = if (scale > 1f) {
                            Offset(
                                x = offset.x + pan.x,
                                y = offset.y + pan.y
                            )
                        } else {
                            Offset.Zero
                        }
                    }
                }
        ) {
            // Main Pannable/Zoomable Image Content
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .pointerInput(Unit) {
                        detectTapGestures(
                            onDoubleTap = {
                                if (scale > 1.2f) {
                                    scale = 1f
                                    offset = Offset.Zero
                                } else {
                                    scale = 2.5f
                                }
                            }
                        )
                    },
                contentAlignment = Alignment.Center
            ) {
                Box(
                    modifier = Modifier
                        .graphicsLayer(
                            scaleX = scale,
                            scaleY = scale,
                            translationX = offset.x,
                            translationY = offset.y
                        )
                        .padding(24.dp),
                    contentAlignment = Alignment.Center
                ) {
                    if (!mediaInfo.imageUrl.isNullOrBlank()) {
                        SubcomposeAsyncImage(
                            model = ImageRequest.Builder(LocalContext.current)
                                .data(mediaInfo.imageUrl)
                                .crossfade(true)
                                .build(),
                            contentDescription = mediaInfo.caption ?: "Zoomed Diagram",
                            contentScale = ContentScale.Fit,
                            modifier = Modifier
                                .fillMaxWidth()
                                .wrapContentHeight(),
                            loading = {
                                CircularProgressIndicator(color = PrimaryGreenLight)
                            }
                        )
                    } else {
                        Surface(
                            shape = RoundedCornerShape(16.dp),
                            color = SurfaceWhite,
                            modifier = Modifier
                                .fillMaxWidth(0.92f)
                                .wrapContentHeight()
                        ) {
                            QuestionCanvasDiagram(
                                diagramType = mediaInfo.diagramType ?: "generic_diagram",
                                title = mediaInfo.diagramTitle ?: question.topic,
                                description = mediaInfo.diagramDescription ?: question.topic,
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(280.dp)
                                    .padding(16.dp)
                            )
                        }
                    }
                }
            }

            // Top Bar: Info + Close + Reset Zoom
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .statusBarsPadding()
                    .padding(horizontal = 20.dp, vertical = 14.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column(modifier = Modifier.weight(1f)) {
                    Text(
                        text = "${question.subject} • ${question.topic}",
                        style = MaterialTheme.typography.titleMedium,
                        fontWeight = FontWeight.Bold,
                        color = Color.White
                    )
                    Text(
                        text = "Pinch or double tap to zoom (Zoom: ${"%.1f".format(scale)}x)",
                        style = MaterialTheme.typography.bodySmall,
                        color = Color.White.copy(alpha = 0.7f),
                        fontSize = 12.sp
                    )
                }

                Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                    if (scale > 1.1f) {
                        Surface(
                            shape = CircleShape,
                            color = Color.White.copy(alpha = 0.2f),
                            modifier = Modifier
                                .size(40.dp)
                                .clip(CircleShape)
                                .clickable {
                                    scale = 1f
                                    offset = Offset.Zero
                                }
                        ) {
                            Box(contentAlignment = Alignment.Center) {
                                Icon(
                                    imageVector = Icons.Default.ZoomOutMap,
                                    contentDescription = "Reset Zoom",
                                    tint = Color.White,
                                    modifier = Modifier.size(20.dp)
                                )
                            }
                        }
                    }

                    Surface(
                        shape = CircleShape,
                        color = Color.White.copy(alpha = 0.2f),
                        modifier = Modifier
                            .size(40.dp)
                            .clip(CircleShape)
                            .clickable(onClick = onDismiss)
                            .testTag("close_zoom_dialog_btn")
                    ) {
                        Box(contentAlignment = Alignment.Center) {
                            Icon(
                                imageVector = Icons.Default.Close,
                                contentDescription = "Close Diagram",
                                tint = Color.White,
                                modifier = Modifier.size(22.dp)
                            )
                        }
                    }
                }
            }

            // Bottom Caption Bar
            Surface(
                color = Color.Black.copy(alpha = 0.65f),
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomCenter)
                    .navigationBarsPadding()
            ) {
                Text(
                    text = mediaInfo.caption ?: question.questionText.take(120),
                    style = MaterialTheme.typography.bodySmall,
                    color = Color.White.copy(alpha = 0.9f),
                    modifier = Modifier.padding(horizontal = 20.dp, vertical = 12.dp),
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

/**
 * Dedicated Jetpack Compose Canvas renderer for authentic Nigerian UTME/JAMB Scientific Diagrams.
 */
@Composable
fun QuestionCanvasDiagram(
    diagramType: String,
    title: String,
    description: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Canvas(modifier = Modifier.fillMaxWidth().weight(1f)) {
            val w = size.width
            val h = size.height

            when (diagramType) {
                "circuit" -> drawElectricCircuit(w, h)
                "optics" -> drawOpticsRayDiagram(w, h)
                "mechanics" -> drawMechanicsPulley(w, h)
                "wave" -> drawWaveformDiagram(w, h)
                "biology_cell" -> drawBiologyCell(w, h)
                "biology_flower" -> drawBiologyFlower(w, h)
                "biology_anatomy" -> drawBiologyAnatomy(w, h)
                "chemistry_apparatus" -> drawChemistryApparatus(w, h)
                "math_circle" -> drawCircleGeometry(w, h)
                "math_triangle" -> drawTrigTriangle(w, h)
                "math_venn" -> drawVennDiagram(w, h)
                "math_graph" -> drawCoordinateGraph(w, h)
                "geography_map" -> drawGeographyContours(w, h)
                else -> drawGenericScientificFigure(w, h)
            }
        }

        Spacer(modifier = Modifier.height(6.dp))
        Text(
            text = description.ifBlank { title },
            style = MaterialTheme.typography.labelSmall,
            color = TextSecondary,
            fontWeight = FontWeight.Medium,
            textAlign = TextAlign.Center,
            maxLines = 2
        )
    }
}

// ==========================================
// CANVAS DRAWING PRIMITIVES FOR JAMB SUBJECTS
// ==========================================

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawElectricCircuit(w: Float, h: Float) {
    val stroke = Stroke(width = 3.5f)
    val wireColor = Color(0xFF1E293B)
    val componentColor = Color(0xFF0F766E)

    val left = w * 0.15f
    val right = w * 0.85f
    val top = h * 0.2f
    val bottom = h * 0.8f
    val midY = (top + bottom) / 2f
    val midX = (left + right) / 2f

    // Wire rectangle
    drawLine(wireColor, Offset(left, top), Offset(midX - 40f, top), strokeWidth = 3.5f)
    drawLine(wireColor, Offset(midX + 40f, top), Offset(right, top), strokeWidth = 3.5f)

    drawLine(wireColor, Offset(right, top), Offset(right, bottom), strokeWidth = 3.5f)
    drawLine(wireColor, Offset(right, bottom), Offset(midX + 30f, bottom), strokeWidth = 3.5f)
    drawLine(wireColor, Offset(midX - 30f, bottom), Offset(left, bottom), strokeWidth = 3.5f)
    drawLine(wireColor, Offset(left, bottom), Offset(left, top), strokeWidth = 3.5f)

    // Resistor Box R at top
    drawRoundRect(
        color = componentColor,
        topLeft = Offset(midX - 40f, top - 15f),
        size = Size(80f, 30f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(6f, 6f),
        style = stroke
    )

    // Battery cell at bottom
    drawLine(wireColor, Offset(midX - 15f, bottom - 20f), Offset(midX - 15f, bottom + 20f), strokeWidth = 5f)
    drawLine(wireColor, Offset(midX + 15f, bottom - 12f), Offset(midX + 15f, bottom + 12f), strokeWidth = 3f)

    // Ammeter circle on right
    drawCircle(
        color = componentColor,
        radius = 20f,
        center = Offset(right, midY),
        style = stroke
    )
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawOpticsRayDiagram(w: Float, h: Float) {
    val axisColor = Color(0xFF64748B)
    val lensColor = Color(0xFF0284C7)
    val rayColor = Color(0xFFDC2626)

    val midY = h * 0.5f
    val midX = w * 0.5f

    // Principal axis
    drawLine(
        axisColor,
        Offset(w * 0.08f, midY),
        Offset(w * 0.92f, midY),
        strokeWidth = 2.5f,
        pathEffect = PathEffect.dashPathEffect(floatArrayOf(15f, 10f), 0f)
    )

    // Convex Lens ellipse
    drawOval(
        color = lensColor.copy(alpha = 0.25f),
        topLeft = Offset(midX - 18f, h * 0.12f),
        size = Size(36f, h * 0.76f)
    )
    drawOval(
        color = lensColor,
        topLeft = Offset(midX - 18f, h * 0.12f),
        size = Size(36f, h * 0.76f),
        style = Stroke(3f)
    )

    // Object Arrow at left
    val objX = midX - w * 0.28f
    val objTop = midY - h * 0.25f
    drawLine(Color(0xFF0F172A), Offset(objX, midY), Offset(objX, objTop), strokeWidth = 4f)

    // Incident parallel ray to lens and refracted through focus
    val fX = midX + w * 0.2f
    drawLine(rayColor, Offset(objX, objTop), Offset(midX, objTop), strokeWidth = 2.5f)
    drawLine(rayColor, Offset(midX, objTop), Offset(midX + w * 0.38f, midY + h * 0.25f), strokeWidth = 2.5f)

    // Central ray through optical center
    drawLine(rayColor, Offset(objX, objTop), Offset(midX + w * 0.38f, midY + h * 0.25f), strokeWidth = 2.5f)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawMechanicsPulley(w: Float, h: Float) {
    val steel = Color(0xFF334155)
    val rope = Color(0xFFD97706)
    val midX = w * 0.5f

    // Ceiling support
    drawLine(steel, Offset(midX - 60f, h * 0.15f), Offset(midX + 60f, h * 0.15f), strokeWidth = 5f)
    drawLine(steel, Offset(midX, h * 0.15f), Offset(midX, h * 0.3f), strokeWidth = 3f)

    // Pulley wheel
    drawCircle(steel, radius = 28f, center = Offset(midX, h * 0.38f), style = Stroke(4f))
    drawCircle(Color(0xFF94A3B8), radius = 6f, center = Offset(midX, h * 0.38f))

    // Rope over pulley
    drawLine(rope, Offset(midX - 28f, h * 0.38f), Offset(midX - 28f, h * 0.75f), strokeWidth = 3f)
    drawLine(rope, Offset(midX + 28f, h * 0.38f), Offset(midX + 28f, h * 0.65f), strokeWidth = 3f)

    // Load mass box
    drawRoundRect(
        color = Color(0xFF0F766E),
        topLeft = Offset(midX - 44f, h * 0.75f),
        size = Size(32f, 32f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(4f, 4f)
    )
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawWaveformDiagram(w: Float, h: Float) {
    val axisColor = Color(0xFF64748B)
    val waveColor = Color(0xFF2563EB)
    val midY = h * 0.5f

    drawLine(axisColor, Offset(w * 0.08f, midY), Offset(w * 0.92f, midY), strokeWidth = 2.5f)
    drawLine(axisColor, Offset(w * 0.12f, h * 0.15f), Offset(w * 0.12f, h * 0.85f), strokeWidth = 2.5f)

    val path = Path()
    val startX = w * 0.12f
    val amplitude = h * 0.28f
    val wavelength = (w * 0.76f) / 2f

    path.moveTo(startX, midY)
    for (x in 0..(w * 0.76f).toInt() step 4) {
        val currentX = startX + x
        val currentY = midY - (Math.sin((x / wavelength) * 2 * Math.PI) * amplitude).toFloat()
        path.lineTo(currentX, currentY)
    }

    drawPath(path, waveColor, style = Stroke(width = 3.5f))
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawBiologyCell(w: Float, h: Float) {
    val wallColor = Color(0xFF15803D)
    val membraneColor = Color(0xFF86EFAC)
    val nucleusColor = Color(0xFF7C3AED)
    val center = Offset(w * 0.5f, h * 0.5f)

    // Plant Cell Wall (outer rounded rect)
    drawRoundRect(
        color = wallColor,
        topLeft = Offset(w * 0.15f, h * 0.15f),
        size = Size(w * 0.7f, h * 0.7f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(24f, 24f),
        style = Stroke(6f)
    )

    // Inner membrane
    drawRoundRect(
        color = membraneColor.copy(alpha = 0.2f),
        topLeft = Offset(w * 0.18f, h * 0.18f),
        size = Size(w * 0.64f, h * 0.64f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(18f, 18f)
    )

    // Vacuole (large central area)
    drawOval(
        color = Color(0xFFBAE6FD).copy(alpha = 0.5f),
        topLeft = Offset(w * 0.25f, h * 0.25f),
        size = Size(w * 0.35f, h * 0.5f)
    )

    // Nucleus
    drawCircle(
        color = nucleusColor,
        radius = 24f,
        center = Offset(w * 0.68f, h * 0.45f)
    )
    drawCircle(
        color = Color(0xFFDDD6FE),
        radius = 8f,
        center = Offset(w * 0.68f, h * 0.45f)
    )
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawBiologyFlower(w: Float, h: Float) {
    val stemColor = Color(0xFF16A34A)
    val petalColor = Color(0xFFF43F5E)
    val center = Offset(w * 0.5f, h * 0.42f)

    // Stem
    drawLine(stemColor, Offset(center.x, center.y + 40f), Offset(center.x, h * 0.88f), strokeWidth = 5f)

    // Petals (4 cardinal petals)
    drawCircle(petalColor.copy(alpha = 0.3f), radius = 32f, center = Offset(center.x, center.y - 36f))
    drawCircle(petalColor.copy(alpha = 0.3f), radius = 32f, center = Offset(center.x, center.y + 36f))
    drawCircle(petalColor.copy(alpha = 0.3f), radius = 32f, center = Offset(center.x - 36f, center.y))
    drawCircle(petalColor.copy(alpha = 0.3f), radius = 32f, center = Offset(center.x + 36f, center.y))

    // Flower Carpel / Pistil center
    drawCircle(Color(0xFFEAB308), radius = 22f, center = center)
    drawCircle(Color(0xFFCA8A04), radius = 22f, center = center, style = Stroke(2f))
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawBiologyAnatomy(w: Float, h: Float) {
    val kidneyColor = Color(0xFFBE123C)
    val midX = w * 0.5f
    val midY = h * 0.5f

    // Kidney bean shape
    val path = Path().apply {
        moveTo(midX - 40f, midY - 60f)
        cubicTo(midX + 60f, midY - 70f, midX + 70f, midY + 60f, midX - 30f, midY + 60f)
        cubicTo(midX - 10f, midY + 20f, midX - 10f, midY - 20f, midX - 40f, midY - 60f)
        close()
    }

    drawPath(path, kidneyColor.copy(alpha = 0.25f))
    drawPath(path, kidneyColor, style = Stroke(3.5f))

    // Renal artery & vein tubes
    drawLine(Color(0xFFDC2626), Offset(midX - 5f, midY - 10f), Offset(midX - 65f, midY - 10f), strokeWidth = 4f)
    drawLine(Color(0xFF2563EB), Offset(midX - 5f, midY + 10f), Offset(midX - 65f, midY + 10f), strokeWidth = 4f)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawChemistryApparatus(w: Float, h: Float) {
    val glassColor = Color(0xFF0284C7)
    val liquidColor = Color(0xFFF59E0B)
    val midX = w * 0.5f

    // Flask shape
    val path = Path().apply {
        moveTo(midX - 14f, h * 0.2f)
        lineTo(midX + 14f, h * 0.2f)
        lineTo(midX + 14f, h * 0.42f)
        lineTo(midX + 55f, h * 0.78f)
        lineTo(midX - 55f, h * 0.78f)
        lineTo(midX - 14f, h * 0.42f)
        close()
    }

    // Liquid in flask
    val liquidPath = Path().apply {
        moveTo(midX - 40f, h * 0.65f)
        lineTo(midX + 40f, h * 0.65f)
        lineTo(midX + 53f, h * 0.76f)
        lineTo(midX - 53f, h * 0.76f)
        close()
    }

    drawPath(liquidPath, liquidColor.copy(alpha = 0.4f))
    drawPath(path, glassColor, style = Stroke(3.5f))

    // Bunsen burner stand below
    drawLine(Color(0xFF334155), Offset(midX - 60f, h * 0.82f), Offset(midX + 60f, h * 0.82f), strokeWidth = 4f)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawCircleGeometry(w: Float, h: Float) {
    val geomColor = Color(0xFF0F766E)
    val tangentColor = Color(0xFFDC2626)
    val center = Offset(w * 0.5f, h * 0.5f)
    val radius = h * 0.32f

    // Circle
    drawCircle(geomColor, radius = radius, center = center, style = Stroke(3f))
    drawCircle(Color(0xFF0F172A), radius = 4f, center = center)

    // Chord AB
    val a = Offset(center.x - radius * 0.7f, center.y - radius * 0.7f)
    val b = Offset(center.x + radius * 0.9f, center.y - radius * 0.4f)
    drawLine(geomColor, a, b, strokeWidth = 2.5f)

    // Tangent line at bottom point P
    val p = Offset(center.x, center.y + radius)
    drawLine(tangentColor, Offset(center.x - radius * 1.1f, p.y), Offset(center.x + radius * 1.1f, p.y), strokeWidth = 3f)
    drawCircle(tangentColor, radius = 5f, center = p)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawTrigTriangle(w: Float, h: Float) {
    val mathColor = Color(0xFF1D4ED8)
    val angleColor = Color(0xFFD97706)

    val a = Offset(w * 0.2f, h * 0.78f)
    val b = Offset(w * 0.8f, h * 0.78f)
    val c = Offset(w * 0.8f, h * 0.22f)

    // Triangle ABC (Right angle at B)
    drawLine(mathColor, a, b, strokeWidth = 3.5f)
    drawLine(mathColor, b, c, strokeWidth = 3.5f)
    drawLine(mathColor, c, a, strokeWidth = 3.5f)

    // Right angle square at B
    val squareSize = 18f
    drawLine(mathColor, Offset(b.x - squareSize, b.y), Offset(b.x - squareSize, b.y - squareSize), strokeWidth = 2f)
    drawLine(mathColor, Offset(b.x - squareSize, b.y - squareSize), Offset(b.x, b.y - squareSize), strokeWidth = 2f)

    // Theta arc at A
    drawArc(
        color = angleColor,
        startAngle = 0f,
        sweepAngle = -35f,
        useCenter = false,
        topLeft = Offset(a.x - 20f, a.y - 20f),
        size = Size(40f, 40f),
        style = Stroke(2.5f)
    )
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawVennDiagram(w: Float, h: Float) {
    val setAColor = Color(0xFF2563EB)
    val setBColor = Color(0xFFDC2626)
    val stroke = Stroke(3f)

    val radius = h * 0.32f
    val centerA = Offset(w * 0.4f, h * 0.5f)
    val centerB = Offset(w * 0.6f, h * 0.5f)

    // Universal set rectangle
    drawRoundRect(
        color = Color(0xFF64748B),
        topLeft = Offset(w * 0.12f, h * 0.12f),
        size = Size(w * 0.76f, h * 0.76f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(10f, 10f),
        style = stroke
    )

    // Set A
    drawCircle(setAColor.copy(alpha = 0.15f), radius = radius, center = centerA)
    drawCircle(setAColor, radius = radius, center = centerA, style = stroke)

    // Set B
    drawCircle(setBColor.copy(alpha = 0.15f), radius = radius, center = centerB)
    drawCircle(setBColor, radius = radius, center = centerB, style = stroke)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawCoordinateGraph(w: Float, h: Float) {
    val axisColor = Color(0xFF475569)
    val curveColor = Color(0xFF059669)
    val midX = w * 0.5f
    val midY = h * 0.5f

    // X & Y Axes
    drawLine(axisColor, Offset(w * 0.1f, midY), Offset(w * 0.9f, midY), strokeWidth = 2.5f)
    drawLine(axisColor, Offset(midX, h * 0.1f), Offset(midX, h * 0.9f), strokeWidth = 2.5f)

    // Parabola Curve
    val path = Path()
    val span = w * 0.32f
    val startX = midX - span
    path.moveTo(startX, midY + h * 0.3f)

    for (step in 0..(span * 2).toInt() step 4) {
        val cx = startX + step
        val normalizedX = (cx - midX) / span
        val cy = (midY - h * 0.32f) + (normalizedX * normalizedX * (h * 0.62f))
        path.lineTo(cx, cy)
    }

    drawPath(path, curveColor, style = Stroke(3.5f))
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawGeographyContours(w: Float, h: Float) {
    val contourColor = Color(0xFFB45309)
    val center = Offset(w * 0.5f, h * 0.5f)

    // Concentric elevation contour lines
    drawOval(contourColor, topLeft = Offset(center.x - w * 0.38f, center.y - h * 0.32f), size = Size(w * 0.76f, h * 0.64f), style = Stroke(2f))
    drawOval(contourColor, topLeft = Offset(center.x - w * 0.28f, center.y - h * 0.24f), size = Size(w * 0.56f, h * 0.48f), style = Stroke(2.5f))
    drawOval(contourColor, topLeft = Offset(center.x - w * 0.18f, center.y - h * 0.16f), size = Size(w * 0.36f, h * 0.32f), style = Stroke(3f))
    drawOval(contourColor, topLeft = Offset(center.x - w * 0.08f, center.y - h * 0.08f), size = Size(w * 0.16f, h * 0.16f), style = Stroke(3.5f))
    drawCircle(Color(0xFF78350F), radius = 4f, center = center)
}

private fun androidx.compose.ui.graphics.drawscope.DrawScope.drawGenericScientificFigure(w: Float, h: Float) {
    val primary = Color(0xFF0F766E)
    val center = Offset(w * 0.5f, h * 0.5f)

    drawRoundRect(
        color = primary.copy(alpha = 0.15f),
        topLeft = Offset(w * 0.2f, h * 0.2f),
        size = Size(w * 0.6f, h * 0.6f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(16f, 16f)
    )
    drawRoundRect(
        color = primary,
        topLeft = Offset(w * 0.2f, h * 0.2f),
        size = Size(w * 0.6f, h * 0.6f),
        cornerRadius = androidx.compose.ui.geometry.CornerRadius(16f, 16f),
        style = Stroke(3f)
    )

    drawLine(primary, Offset(w * 0.2f, center.y), Offset(w * 0.8f, center.y), strokeWidth = 2.5f)
    drawLine(primary, Offset(center.x, h * 0.2f), Offset(center.x, h * 0.8f), strokeWidth = 2.5f)
    drawCircle(Color(0xFFF59E0B), radius = 16f, center = center)
}
