package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var newRecyclerView: RecyclerView
    private lateinit var newArrayList: ArrayList<menu>
    lateinit var imageId : Array<Int>
    lateinit var heading : Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageId = arrayOf(
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.b,
            R.drawable.b,
            R.drawable.b,
            R.drawable.b,
            R.drawable.b,
            )
        heading = arrayOf(
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",
            "The most popular food items of Indore are Khopra Pattice.",

        )

        newRecyclerView = findViewById(R.id.recyclerview)
        newRecyclerView.layoutManager = LinearLayoutManager(this)
        newRecyclerView.setHasFixedSize(true)

        newArrayList = arrayListOf<menu>()
        getUserdata()

    }

    private fun getUserdata(){

        for(i in imageId.indices) {
            val food = menu(imageId[i], heading[i])
            newArrayList.add(food)

        }

        newRecyclerView.adapter = adapter(newArrayList)

    }
}