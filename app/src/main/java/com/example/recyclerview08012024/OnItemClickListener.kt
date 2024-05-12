package com.example.recyclerview08012024

import android.icu.text.Transliterator.Position
import java.text.ParsePosition

interface OnItemClickListener {
    fun onClick(position: Int)
}