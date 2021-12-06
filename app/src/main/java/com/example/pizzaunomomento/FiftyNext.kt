package com.example.pizzaunomomento

import android.annotation.SuppressLint
import android.content.Intent
import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.widget.AppCompatButton
import androidx.core.content.ContentProviderCompat.requireContext
import com.example.pizzaunomomento.fragments.Cart
import com.example.pizzaunomomento.fragments.MainScreenNextMenu

class FiftyNext : AppCompatActivity() {
    @SuppressLint("WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifty_next2)
        val cart = findViewById<ImageView>(R.id.cart)
        cart.setOnClickListener {
            val intent = Intent(this, Cart::class.java)
            startActivity(intent)
        }
        val back = findViewById<ImageView>(R.id.back)
        back.setOnClickListener {
            val intent = Intent(this, Fifty::class.java)
            startActivity(intent)
        }
    }
}