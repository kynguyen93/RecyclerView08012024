package com.example.recyclerview08012024

object TextUtils {

    fun exchangeDistance(distance: Int): String{
        return if (distance < 1000) {
            "$distance m"
        }else {
            "${(distance.toInt()/1000)} km"
        }
    }
}