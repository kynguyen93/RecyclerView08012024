package com.example.recyclerview08012024

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private var cinemaAdapter: CinemaAdapter? = null
    private var listCinema: MutableList<Cinema>? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        recyclerView = findViewById(R.id.recyclerview_cinema)
        listCinema = Cinema.getDataMock().toMutableList()
        cinemaAdapter = CinemaAdapter(this, listCinema ?: mutableListOf())
        recyclerView?.adapter = cinemaAdapter
    }
}