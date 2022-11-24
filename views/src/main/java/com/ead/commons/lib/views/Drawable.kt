package com.ead.commons.lib.views

import android.content.Context
import android.graphics.BlendMode
import android.graphics.BlendModeColorFilter
import android.graphics.PorterDuff
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat

fun Drawable.getMutated(color :Int,context : Context) : Drawable {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q)
        mutate().colorFilter = BlendModeColorFilter(color, BlendMode.SRC_ATOP)
    else
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
            mutate().colorFilter = BlendModeColorFilterCompat
                .createBlendModeColorFilterCompat(context.getColor(color), BlendModeCompat.SRC_ATOP)
        else
            @Suppress("DEPRECATION") mutate().setColorFilter(color, PorterDuff.Mode.SRC_ATOP)
    return this
}