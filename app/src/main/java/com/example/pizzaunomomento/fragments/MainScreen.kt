package com.example.pizzaunomomento.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.ImageView
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class MainScreen : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_main_screen, container, false)
        val cart = view.findViewById<ImageView>(R.id.cart)
        val frame_pizza = view.findViewById<FrameLayout>(R.id.pizza)
        cart.setOnClickListener { findNavController().navigate(R.id.action_mainScreen_to_cart2) }
        frame_pizza.setOnClickListener { findNavController().navigate(R.id.action_mainScreen_to_mainScreenNextMenu) }


        return view
    }
}