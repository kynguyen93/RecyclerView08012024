package com.example.recyclerview08012024

import android.annotation.SuppressLint
import kotlin.math.pow
import kotlin.math.round

object TextUtils {

    @SuppressLint("SuspiciousIndentation")
    fun formatDistance(distance: Int): String{
        return if (distance < 1000) {
            "$distance m"
        } else {
            val result = (distance.toFloat() / 1000.toFloat())
            var digitZero = ((result * 100) % 100).toInt() == 0
            if (result % 1 != 0f && !digitZero) {
                val cifras = 10.0.pow(2.0)
                val finalResultString = String.format("%.1f", round(result * cifras) / cifras)
                val finalResultFloat = finalResultString.toFloat()
                if (finalResultFloat % 1.0f == 0f) {
                    "${finalResultFloat.toInt()} km"
                } else {
                    "$finalResultString km"
                }
                } else {
                    "${result.toInt()} km"

            }
        }
    }
}
