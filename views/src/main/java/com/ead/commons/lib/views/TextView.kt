package com.ead.commons.lib.views

import android.graphics.text.LineBreaker
import android.os.Build
import android.widget.TextView

fun TextView.justifyInterWord() {
    if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) justificationMode = LineBreaker.JUSTIFICATION_MODE_INTER_WORD }