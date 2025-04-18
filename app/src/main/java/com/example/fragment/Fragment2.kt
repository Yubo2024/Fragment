package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast


class Fragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment2, container, false)

        val uploadButton = view.findViewById<Button>(R.id.buttonUpload)

        uploadButton.setOnClickListener {
            Toast.makeText(requireContext(), "Upload successful!！", Toast.LENGTH_SHORT).show()
        }

        return view
    }
}