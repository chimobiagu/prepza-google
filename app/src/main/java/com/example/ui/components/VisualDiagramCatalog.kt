package com.example.ui.components

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.PathEffect
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.graphics.drawscope.Stroke

/**
 * Extended authentic canvas drawing primitives for Nigerian UTME/JAMB Scientific Diagrams.
 */
object VisualDiagramCatalog {

    fun drawRectangleGeometry(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val stroke = Stroke(3.5f)
            val color = Color(0xFF0F766E)
            val diagColor = Color(0xFFDC2626)
            val left = w * 0.2f
            val top = h * 0.25f
            val rectW = w * 0.6f
            val rectH = h * 0.5f

            // Rectangle
            drawRect(
                color = color,
                topLeft = Offset(left, top),
                size = Size(rectW, rectH),
                style = stroke
            )

            // Diagonal
            drawLine(
                color = diagColor,
                start = Offset(left, top + rectH),
                end = Offset(left + rectW, top),
                strokeWidth = 2.5f,
                pathEffect = PathEffect.dashPathEffect(floatArrayOf(12f, 8f), 0f)
            )

            // Right angle symbol at bottom-left
            val s = 14f
            drawLine(color, Offset(left + s, top + rectH), Offset(left + s, top + rectH - s), strokeWidth = 2f)
            drawLine(color, Offset(left + s, top + rectH - s), Offset(left, top + rectH - s), strokeWidth = 2f)
        }
    }

    fun drawSquareGeometry(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val stroke = Stroke(3.5f)
            val color = Color(0xFF2563EB)
            val size = h * 0.6f
            val left = (w - size) / 2f
            val top = (h - size) / 2f

            drawRect(
                color = color,
                topLeft = Offset(left, top),
                size = Size(size, size),
                style = stroke
            )

            // Equal side tick marks
            val midY = top + size / 2f
            val midX = left + size / 2f
            val tick = 10f
            // Left & Right
            drawLine(color, Offset(left - tick, midY), Offset(left + tick, midY), strokeWidth = 2.5f)
            drawLine(color, Offset(left + size - tick, midY), Offset(left + size + tick, midY), strokeWidth = 2.5f)
            // Top & Bottom
            drawLine(color, Offset(midX, top - tick), Offset(midX, top + tick), strokeWidth = 2.5f)
            drawLine(color, Offset(midX, top + size - tick), Offset(midX, top + size + tick), strokeWidth = 2.5f)
        }
    }

    fun drawNumberLine(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val axisColor = Color(0xFF334155)
            val rayColor = Color(0xFFDC2626)
            val midY = h * 0.5f
            val startX = w * 0.1f
            val endX = w * 0.9f

            // Main line with arrows
            drawLine(axisColor, Offset(startX, midY), Offset(endX, midY), strokeWidth = 3f)
            drawLine(axisColor, Offset(startX + 12f, midY - 8f), Offset(startX, midY), strokeWidth = 3f)
            drawLine(axisColor, Offset(startX + 12f, midY + 8f), Offset(startX, midY), strokeWidth = 3f)
            drawLine(axisColor, Offset(endX - 12f, midY - 8f), Offset(endX, midY), strokeWidth = 3f)
            drawLine(axisColor, Offset(endX - 12f, midY + 8f), Offset(endX, midY), strokeWidth = 3f)

            // Tick marks (-3 to +3)
            val count = 6
            val step = (endX - startX - 40f) / count
            for (i in 0..count) {
                val tx = (startX + 20f) + (i * step)
                drawLine(axisColor, Offset(tx, midY - 12f), Offset(tx, midY + 12f), strokeWidth = 2.5f)
            }

            // Inequality ray (e.g. x >= 0)
            val originX = (startX + 20f) + (3 * step)
            drawLine(rayColor, Offset(originX, midY - 24f), Offset(endX - 20f, midY - 24f), strokeWidth = 4f)
            drawCircle(rayColor, radius = 6f, center = Offset(originX, midY - 24f))
            drawLine(rayColor, Offset(originX, midY), Offset(originX, midY - 24f), strokeWidth = 2f)
        }
    }

    fun drawSpringMassSystem(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val supportColor = Color(0xFF475569)
            val springColor = Color(0xFF0284C7)
            val massColor = Color(0xFFD97706)
            val midX = w * 0.5f

            // Ceiling
            drawLine(supportColor, Offset(midX - 50f, h * 0.15f), Offset(midX + 50f, h * 0.15f), strokeWidth = 5f)

            // Coiled Spring
            val path = Path()
            path.moveTo(midX, h * 0.15f)
            var currentY = h * 0.15f
            val coils = 6
            val coilHeight = (h * 0.45f) / coils
            for (i in 0 until coils) {
                val dir = if (i % 2 == 0) 1 else -1
                path.lineTo(midX + (dir * 25f), currentY + (coilHeight * 0.5f))
                path.lineTo(midX, currentY + coilHeight)
                currentY += coilHeight
            }
            drawPath(path, springColor, style = Stroke(width = 3.5f))

            // Suspended mass box
            drawRoundRect(
                color = massColor,
                topLeft = Offset(midX - 30f, currentY),
                size = Size(60f, 40f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(6f, 6f)
            )

            // Gravity force vector arrow downwards
            val arrowStartY = currentY + 45f
            val arrowEndY = currentY + 80f
            drawLine(Color(0xFFDC2626), Offset(midX, arrowStartY), Offset(midX, arrowEndY), strokeWidth = 3f)
            drawLine(Color(0xFFDC2626), Offset(midX - 6f, arrowEndY - 8f), Offset(midX, arrowEndY), strokeWidth = 3f)
            drawLine(Color(0xFFDC2626), Offset(midX + 6f, arrowEndY - 8f), Offset(midX, arrowEndY), strokeWidth = 3f)
        }
    }

    fun drawInclinedPlane(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val planeColor = Color(0xFF334155)
            val blockColor = Color(0xFF10B981)
            val vectorColor = Color(0xFFEF4444)

            val a = Offset(w * 0.15f, h * 0.75f)
            val b = Offset(w * 0.85f, h * 0.75f)
            val c = Offset(w * 0.85f, h * 0.25f)

            // Wedge triangle
            val path = Path().apply {
                moveTo(a.x, a.y)
                lineTo(b.x, b.y)
                lineTo(c.x, c.y)
                close()
            }
            drawPath(path, planeColor.copy(alpha = 0.12f))
            drawPath(path, planeColor, style = Stroke(3.5f))

            // Block on slope (midpoint of slope)
            val midSlope = Offset((a.x + c.x) / 2f, (a.y + c.y) / 2f)
            drawRoundRect(
                color = blockColor,
                topLeft = Offset(midSlope.x - 24f, midSlope.y - 24f),
                size = Size(48f, 32f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(4f, 4f)
            )

            // Weight vector downwards
            drawLine(vectorColor, midSlope, Offset(midSlope.x, midSlope.y + 50f), strokeWidth = 3f)
            // Normal reaction R perpendicular to slope
            drawLine(Color(0xFF2563EB), midSlope, Offset(midSlope.x - 25f, midSlope.y - 35f), strokeWidth = 3f)
        }
    }

    fun drawTitrationApparatus(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val standColor = Color(0xFF475569)
            val glassColor = Color(0xFF0284C7)
            val liquidColor = Color(0xFFF43F5E)
            val midX = w * 0.5f

            // Retort stand base & rod
            drawLine(standColor, Offset(midX - 70f, h * 0.88f), Offset(midX + 70f, h * 0.88f), strokeWidth = 6f)
            drawLine(standColor, Offset(midX - 45f, h * 0.12f), Offset(midX - 45f, h * 0.88f), strokeWidth = 4f)

            // Clamp holding burette
            drawLine(standColor, Offset(midX - 45f, h * 0.35f), Offset(midX, h * 0.35f), strokeWidth = 3f)

            // Burette tube
            val bWidth = 16f
            drawRoundRect(
                color = glassColor,
                topLeft = Offset(midX - bWidth / 2f, h * 0.15f),
                size = Size(bWidth, h * 0.42f),
                cornerRadius = androidx.compose.ui.geometry.CornerRadius(3f, 3f),
                style = Stroke(2.5f)
            )

            // Liquid in burette
            drawRect(
                color = liquidColor.copy(alpha = 0.5f),
                topLeft = Offset(midX - bWidth / 2f + 2f, h * 0.22f),
                size = Size(bWidth - 4f, h * 0.35f)
            )

            // Conical flask below burette
            val fTop = h * 0.65f
            val flaskPath = Path().apply {
                moveTo(midX - 8f, fTop)
                lineTo(midX + 8f, fTop)
                lineTo(midX + 8f, fTop + 15f)
                lineTo(midX + 35f, fTop + 70f)
                lineTo(midX - 35f, fTop + 70f)
                lineTo(midX - 8f, fTop + 15f)
                close()
            }
            drawPath(flaskPath, glassColor, style = Stroke(2.5f))
            // Liquid in flask
            val flaskLiquid = Path().apply {
                moveTo(midX - 25f, fTop + 55f)
                lineTo(midX + 25f, fTop + 55f)
                lineTo(midX + 33f, fTop + 68f)
                lineTo(midX - 33f, fTop + 68f)
                close()
            }
            drawPath(flaskLiquid, Color(0xFFFBBF24).copy(alpha = 0.5f))
        }
    }

    fun drawDaniellElectrochemicalCell(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val glass = Color(0xFF0284C7)
            val znColor = Color(0xFF64748B)
            val cuColor = Color(0xFFB45309)
            val bridgeColor = Color(0xFF10B981)

            val beakerW = w * 0.32f
            val beakerH = h * 0.45f
            val topY = h * 0.4f
            val left1 = w * 0.15f
            val left2 = w * 0.53f

            // Left Beaker (ZnSO4)
            drawRoundRect(glass, Offset(left1, topY), Size(beakerW, beakerH), androidx.compose.ui.geometry.CornerRadius(8f, 8f), Stroke(3f))
            drawRect(Color(0xFF38BDF8).copy(alpha = 0.2f), Offset(left1 + 3f, topY + 20f), Size(beakerW - 6f, beakerH - 23f))
            // Zinc Electrode
            drawRect(znColor, Offset(left1 + beakerW * 0.35f, topY - 20f), Size(18f, beakerH * 0.8f))

            // Right Beaker (CuSO4)
            drawRoundRect(glass, Offset(left2, topY), Size(beakerW, beakerH), androidx.compose.ui.geometry.CornerRadius(8f, 8f), Stroke(3f))
            drawRect(Color(0xFF0284C7).copy(alpha = 0.35f), Offset(left2 + 3f, topY + 20f), Size(beakerW - 6f, beakerH - 23f))
            // Copper Electrode
            drawRect(cuColor, Offset(left2 + beakerW * 0.45f, topY - 20f), Size(18f, beakerH * 0.8f))

            // Salt Bridge U-tube
            val bridgePath = Path().apply {
                moveTo(left1 + beakerW * 0.7f, topY + 40f)
                lineTo(left1 + beakerW * 0.7f, topY - 10f)
                lineTo(left2 + beakerW * 0.25f, topY - 10f)
                lineTo(left2 + beakerW * 0.25f, topY + 40f)
            }
            drawPath(bridgePath, bridgeColor, style = Stroke(width = 8f))

            // External circuit wire & Voltmeter
            val wirePath = Path().apply {
                moveTo(left1 + beakerW * 0.35f + 9f, topY - 20f)
                lineTo(left1 + beakerW * 0.35f + 9f, topY - 45f)
                lineTo(w * 0.5f - 18f, topY - 45f)
            }
            drawPath(wirePath, Color(0xFF1E293B), style = Stroke(2.5f))
            val wirePath2 = Path().apply {
                moveTo(w * 0.5f + 18f, topY - 45f)
                lineTo(left2 + beakerW * 0.45f + 9f, topY - 45f)
                lineTo(left2 + beakerW * 0.45f + 9f, topY - 20f)
            }
            drawPath(wirePath2, Color(0xFF1E293B), style = Stroke(2.5f))

            // Voltmeter circle
            drawCircle(Color(0xFFDC2626), radius = 18f, center = Offset(w * 0.5f, topY - 45f), style = Stroke(2.5f))
        }
    }

    fun drawMammalianHeart(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val muscle = Color(0xFF991B1B)
            val o2Color = Color(0xFFEF4444)
            val deO2Color = Color(0xFF2563EB)
            val center = Offset(w * 0.5f, h * 0.52f)

            // Heart Outline (rounded triangular cardiac muscle)
            val path = Path().apply {
                moveTo(center.x, center.y - 70f)
                cubicTo(center.x + 90f, center.y - 90f, center.x + 110f, center.y + 20f, center.x, center.y + 90f)
                cubicTo(center.x - 110f, center.y + 20f, center.x - 90f, center.y - 90f, center.x, center.y - 70f)
                close()
            }
            drawPath(path, muscle.copy(alpha = 0.2f))
            drawPath(path, muscle, style = Stroke(4f))

            // Septum dividing ventricles
            drawLine(muscle, Offset(center.x, center.y - 40f), Offset(center.x, center.y + 85f), strokeWidth = 6f)

            // Left & Right Atria/Ventricle cavity tints
            drawOval(deO2Color.copy(alpha = 0.3f), topLeft = Offset(center.x - 65f, center.y - 20f), size = Size(50f, 60f))
            drawOval(o2Color.copy(alpha = 0.3f), topLeft = Offset(center.x + 15f, center.y - 20f), size = Size(50f, 60f))

            // Aorta arch coming out top
            val aorta = Path().apply {
                moveTo(center.x + 10f, center.y - 70f)
                cubicTo(center.x + 15f, center.y - 110f, center.x - 45f, center.y - 110f, center.x - 45f, center.y - 70f)
            }
            drawPath(aorta, o2Color, style = Stroke(width = 12f))
        }
    }

    fun drawFoodTrophicPyramid(drawScope: DrawScope, w: Float, h: Float) {
        with(drawScope) {
            val baseColor = Color(0xFF15803D)
            val priColor = Color(0xFF84CC16)
            val secColor = Color(0xFFF59E0B)
            val apexColor = Color(0xFFEF4444)

            val midX = w * 0.5f
            val topY = h * 0.18f
            val bottomY = h * 0.82f
            val totalH = bottomY - topY
            val layerH = totalH / 4f

            // 4 stepped trapezoids
            val widths = listOf(w * 0.15f, w * 0.35f, w * 0.55f, w * 0.75f)
            val colors = listOf(apexColor, secColor, priColor, baseColor)

            for (i in 0..3) {
                val curTop = topY + (i * layerH)
                val curBottom = curTop + layerH
                val halfWTop = widths[i] / 2f
                val halfWBottom = (if (i < 3) widths[i + 1] else w * 0.85f) / 2f

                val trap = Path().apply {
                    moveTo(midX - halfWTop, curTop)
                    lineTo(midX + halfWTop, curTop)
                    lineTo(midX + halfWBottom, curBottom)
                    lineTo(midX - halfWBottom, curBottom)
                    close()
                }
                drawPath(trap, colors[i].copy(alpha = 0.35f))
                drawPath(trap, colors[i], style = Stroke(2.5f))
            }
        }
    }
}
