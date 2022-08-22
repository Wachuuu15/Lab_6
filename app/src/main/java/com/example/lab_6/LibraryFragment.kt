package com.example.lab_6

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import android.widget.Button
import android.widget.TextView


class LibraryFragment : Fragment(R.layout.fragment_library) {
    private lateinit var buttonCount: Button
    private lateinit var Texto : TextView
    private var count: Int = 0



    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        buttonCount = view.findViewById(R.id.button)
        Texto = view.findViewById(R.id.textView4)

        setListeners()
        super.onViewCreated(view, savedInstanceState)
    }


    private fun setListeners() {
        buttonCount.setOnClickListener {
            count++
            Texto.setText(count.toString())
        }
    }


}