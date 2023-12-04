package com.example.tp3_liste

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tp3_liste.Adapters.NameAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val rclNames = findViewById<RecyclerView>(R.id.rclNames)
        rclNames.setHasFixedSize(true)
        rclNames.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)

        val nameList = getListOfNames()
        val namesAdapter = NameAdapter(nameList)
        rclNames.adapter = namesAdapter
        rclNames.layoutManager = LinearLayoutManager(this)

        val btnUpdateList = findViewById<Button>(R.id.btnUpdateList)
        btnUpdateList.setOnClickListener {
            nameList[nameList.size - 1] = "Hello! I've been updated right now :)"
            namesAdapter.notifyDataSetChanged()
        }
        namesAdapter.itemClickListener = { position, name ->
            Toast.makeText(this, "position: $position - name: $name", Toast.LENGTH_SHORT)
                .show()
        }
    }

    private fun getListOfNames(): MutableList<String> {
        val nameList = mutableListOf<String>()
        nameList.add("ahmed")
        nameList.add("yassine")
        nameList.add("sonia")
        nameList.add("mariem")
        nameList.add("taha")
        nameList.add("oussema")
        nameList.add("fatma")
        nameList.add("haythem")
        nameList.add("ayoub")
        nameList.add("aya")
        nameList.add("houda")
        nameList.add("houda")
        nameList.add("houda")
        nameList.add("houda")
        nameList.add("houda")
        nameList.add("houda")
        nameList.add("houda")

        return nameList
    }
}