package com.ead.commons.lib.views

import android.content.Context
import android.util.TypedValue

fun Context.dpConvertToPixels(dp: Float): Int =
    TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, resources.displayMetrics).toInt()
