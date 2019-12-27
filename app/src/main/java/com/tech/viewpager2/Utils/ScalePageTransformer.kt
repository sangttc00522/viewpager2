package com.tech.viewpager2.Utils

import android.view.View
import androidx.viewpager2.widget.ViewPager2

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