package com.example.pizzaunomomento.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class nextReg : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_next_reg, container, false)

            val button = view.findViewById<AppCompatButton>(R.id.go_to_next)
        button.setOnClickListener{
            findNavController().navigate(R.id.action_nextReg2_to_mainScreen)
        }
        return view
    }

}