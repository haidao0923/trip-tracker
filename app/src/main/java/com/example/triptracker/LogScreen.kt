package com.example.triptracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class LogScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_screen)

        val returnButton: Button = findViewById(R.id.returnToMap)
        returnButton.setOnClickListener {
            returnToMap()
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        var items = ArrayList<ItemsViewModel>()

        for (i in 1..4) {
            items.add(ItemsViewModel(R.drawable.ic_launcher_foreground, "Item " + i))
        }

        val adapter = CustomAdapter(items)
        recyclerView.adapter = adapter
    }

    private fun returnToMap() {
        val intent = Intent(this, MapsActivity::class.java)
        startActivity(intent)
    }
}