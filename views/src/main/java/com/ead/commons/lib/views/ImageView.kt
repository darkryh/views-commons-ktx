package com.ead.commons.lib.views

import android.widget.ImageView


fun ImageView.setResourceImageAndColor(resourceId :Int,color : Int) {
    setImageResource(resourceId)
    setResourceColor(color)
}

fun ImageView.setResourceColor(color: Int) =
    setImageDrawable(drawable.getMutated(color,context))



