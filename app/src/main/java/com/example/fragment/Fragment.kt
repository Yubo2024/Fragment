package com.example.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    private var name: String? = null
    private var age: String? = null

    companion object {
        fun newInstance(name: String, age: String): MyFragment {
            val fragment = MyFragment()
            val args = Bundle()
            args.putString("name", name)
            args.putString("age", age)
            fragment.arguments = args
            return fragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_my, container, false)

        name = arguments?.getString("name")
        age = arguments?.getString("age")

        val textView = view.findViewById<TextView>(R.id.textViewInfo)
        textView.text = "Hello！$name，Your age is: $age"

        return view
    }
}
