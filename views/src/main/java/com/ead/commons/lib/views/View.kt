package com.ead.commons.lib.views

import android.os.Build
import android.util.TypedValue
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat


fun View.setVisibility(isVisible : Boolean) =
    if (isVisible) visibility = View.VISIBLE
    else visibility = View.GONE

fun View.setVisibilityReverse(isVisible : Boolean) =
    if (isVisible) visibility = View.VISIBLE
    else visibility = View.INVISIBLE


fun View.addSelectableItemEffect() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M)
        foreground  = with(TypedValue()) {
            context.theme.resolveAttribute(
                androidx.appcompat.R.attr.selectableItemBackground, this, true)
            ContextCompat.getDrawable(context, resourceId)
        }
}

fun View.margin(
    dpInLeft: Float? = null,
    dpInTop: Float? = null,
    dpInRight: Float? = null,
    dpInBottom: Float? = null) {
    layoutParams<ViewGroup.MarginLayoutParams> {
        dpInLeft?.run { leftMargin = dpConvertToPixels(this) }
        dpInTop?.run { topMargin = dpConvertToPixels(this) }
        dpInRight?.run { rightMargin = dpConvertToPixels(this) }
        dpInBottom?.run { bottomMargin = dpConvertToPixels(this) }
    }
}

private inline fun <reified T : ViewGroup.LayoutParams> View.layoutParams(block: T.() -> Unit)
{ if (layoutParams is T) block(layoutParams as T) }

private fun View.dpConvertToPixels(dp: Float): Int = context.dpConvertToPixels(dp)
