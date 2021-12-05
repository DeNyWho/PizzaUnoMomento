package com.example.pizzaunomomento

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import androidx.core.os.postDelayed
import com.example.pizzaunomomento.fragments.Reg_next
import com.example.pizzaunomomento.fragments.Registration

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler()

        handler.postDelayed(1500){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }
}