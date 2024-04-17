package com.example.recyclerview08012024

object TextUtils {

    fun formatDistance(distance: Int): String{
        return if (distance < 1000) {
            "$distance m"
        }else {
            val result = (distance.toFloat() / 1000.toFloat())
            var digitZero = ((result * 10) % 10).toInt() == 0
            if (result %1 != 0f && !digitZero) {
                "${String.format("%.1f", result)} km"
            } else {
                "${result.toInt()} km"
            }
        }
    }
}