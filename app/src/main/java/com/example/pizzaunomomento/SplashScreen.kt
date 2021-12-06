package com.example.pizzaunomomento

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.core.os.postDelayed
import com.example.pizzaunomomento.fragments.Reg_next
import com.example.pizzaunomomento.fragments.Registration
import kotlinx.coroutines.*
import zlc.season.animatorx.animMarginStart
import zlc.season.animatorx.animRight

@SuppressLint("CustomSplashScreen")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        val handler = Handler()
        val image = findViewById<ImageView>(R.id.image)
        CoroutineScope(Dispatchers.Main).launch {
            coroutineScope{
                val anim2 = async{image.animMarginStart(to = 900f, duration = 2500)}
                awaitAll(anim2)

            }
        }
        handler.postDelayed(2000){
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

        }
    }

}