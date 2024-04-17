package com.example.recyclerview08012024

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.ViewParent
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.util.zip.Inflater


class CinemaAdapter(
    var context: Context,
    var listCinema: List<Cinema>
): RecyclerView.Adapter<CinemaAdapter.CinemaViewHolder>() {

      class CinemaViewHolder(view: View): RecyclerView.ViewHolder(view) {
          private val img = view.findViewById<ImageView>(R.id.image_view_cinema)
          private val txtName = view.findViewById<TextView>(R.id.text_view_name)
          private val txtAdress = view.findViewById<TextView>(R.id.text_view_address)
          private val txtPhone = view.findViewById<TextView>(R.id.text_view_phone)
          private val txtDistance = view.findViewById<TextView>(R.id.text_view_distance)

          fun bind(cinema: Cinema) {
              img.setImageResource(cinema.image)
              txtName.text = cinema.name
              txtAdress.text = cinema.address
              txtPhone.text = cinema.phone
              txtDistance.text = cinema.distance.toString()
          }
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CinemaViewHolder {
        val layoutInflater = LayoutInflater.from(context)
        val view = layoutInflater.inflate(R.layout.layout_item_cinema, parent, false)
        return CinemaViewHolder(view)
    }

    override fun getItemCount(): Int = listCinema.size

    override fun onBindViewHolder(holder: CinemaViewHolder, position: Int) {

    }

}