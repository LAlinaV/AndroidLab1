package com.example.lab1task42

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but = findViewById<Button>(R.id.button)
        val tg = findViewById<TextView>(R.id.tg)

        but.setOnClickListener{
            tg.visibility = View.VISIBLE
        }
    }
}