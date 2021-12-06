package com.example.pizzaunomomento

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.example.pizzaunomomento.fragments.fifty_next

class Fifty : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifty2)
        val next = findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(this, FiftyNext::class.java)
            startActivity(intent)
        }
    }
}