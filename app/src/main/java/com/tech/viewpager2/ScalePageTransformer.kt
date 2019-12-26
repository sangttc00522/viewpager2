package com.tech.viewpager2

import android.view.View
import androidx.viewpager2.widget.ViewPager2

private const val MIN_SCALE = 0.85f
private const val MIN_ALPHA = 0.5f

class ScalePageTransformer : ViewPager2.PageTransformer {

    override fun transformPage(view: View, position: Float) {
        val absPos = Math.abs(position)
        view.apply {
            rotation = position * 360
            translationY = absPos * 500f
            translationX = absPos * 350f
            val scale = if (absPos > 1) 0F else 1 - absPos
            scaleX = scale
            scaleY = scale
        }
    }
}