package com.example.pizzaunomomento.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class fifty_next : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fifty_next, container, false)
        findNavController().navigate(R.id.action_fifty_next_to_mainScreen)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener { findNavController().navigate(R.id.action_fifty_next_to_mainScreen) }
        return view
    }

}