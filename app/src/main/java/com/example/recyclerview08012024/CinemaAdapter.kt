package com.example.recyclerview08012024

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater


class CinemaAdapter(
    var context: Context
): RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

      class CinemaViewHolder(view: View): RecyclerView.ViewHolder(view) {

      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.layout_item_cinema, parent, false)
        return CinemaViewHolder(view)
    }

    override fun getItemCount(): Int {

    }

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {

    }

}