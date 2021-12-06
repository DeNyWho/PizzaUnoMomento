package com.example.pizzaunomomento.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class stocks : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_stocks, container, false)

        val back = view.findViewById<ImageView>(R.id.back_menu)
        back.setOnClickListener { findNavController().navigate(R.id.action_stocks_to_mainScreen) }
        val cart = view.findViewById<ImageView>(R.id.cart)
        cart.setOnClickListener { findNavController().navigate(R.id.action_stocks_to_cart23) }
        return view
    }


}