package com.example.pizzaunomomento.fragments

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import com.example.pizzaunomomento.R

class fifty : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fifty, container, false)
        val next = view.findViewById<AppCompatButton>(R.id.next)
        next.setOnClickListener {
            val intent = Intent(requireContext(), fifty_next::class.java)
            startActivity(intent)
        }
        return view
    }

}