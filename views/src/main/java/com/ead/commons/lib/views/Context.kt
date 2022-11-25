package com.ead.commons.lib.views

import android.content.Context
import android.graphics.ColorFilter
import android.util.TypedValue
import androidx.core.content.res.ResourcesCompat
import androidx.core.graphics.BlendModeColorFilterCompat
import androidx.core.graphics.BlendModeCompat


fun Context.getColorById(color : Int) : Int =
    ResourcesCompat.getColor(resources,color,theme)

fun Context.createColorFilter(color: Int) : ColorFilter? =
    BlendModeColorFilterCompat
        .createBlendModeColorFilterCompat(
            getColorById(color), BlendModeCompat.SRC_ATOP)


fun Context.dpConvertToPixels(dp: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
