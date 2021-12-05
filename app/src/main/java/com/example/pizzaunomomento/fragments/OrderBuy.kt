package com.example.pizzaunomomento.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class OrderBuy : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_order_buy, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener { findNavController().navigate(R.id.action_orderBuy2_to_delivery) }
        val add = view.findViewById<AppCompatButton>(R.id.add)
        add.setOnClickListener { findNavController().navigate(R.id.action_orderBuy2_to_orderBuyTwo) }
        return view
    }

}