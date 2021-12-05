package com.example.pizzaunomomento.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.pizzaunomomento.R

class Registration : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_registration, container, false)

        val button = view.findViewById<AppCompatButton>(R.id.next)
        button.setOnClickListener {
            findNavController().navigate(R.id.action_registration3_to_nextReg2)


        }
        return view
    }

}