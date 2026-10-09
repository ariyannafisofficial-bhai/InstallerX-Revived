package com.kx.icons

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.addPathNodes
import androidx.compose.ui.unit.dp

val KxIcons.Settings: ImageVector by lazy {
    ImageVector.Builder(
        name = "KxSettings", defaultWidth = 24.dp, defaultHeight = 24.dp,
        viewportWidth = 24f, viewportHeight = 24f
    ).addPath(
        pathData = addPathNodes("M4 8h10M18 8h2M4 16h2M10 16h10M14,8a2,2 0 1,0 4,0a2,2 0 1,0 -4,0M6,16a2,2 0 1,0 4,0a2,2 0 1,0 -4,0"),
        stroke = SolidColor(Color.Black),
        strokeLineWidth = 1.8f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round
    ).build()
}
