package com.example.pizzaunomomento.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class OrderBuyTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view =  inflater.inflate(R.layout.fragment_order_buy_two, container, false)

        val order = view.findViewById<AppCompatButton>(R.id.order)

        order.setOnClickListener { findNavController().navigate(R.id.action_orderBuyTwo_to_delivery2) }
        return view
    }

}