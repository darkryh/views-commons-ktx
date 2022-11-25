package com.ead.commons.lib.views

import android.content.Context
import android.graphics.drawable.Drawable

fun Drawable.getNewDrawable() : Drawable = constantState?.newDrawable()!!

fun Drawable.getMutated(context: Context,color: Int) : Drawable {
    val newColorDrawable = getNewDrawable()
    newColorDrawable.mutate().colorFilter = context.createColorFilter(color)
    return newColorDrawable
}
