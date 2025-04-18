package com.example.fragment

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextName = findViewById<EditText>(R.id.editTextName)
        val editTextAge = findViewById<EditText>(R.id.editTextAge)
        val button = findViewById<Button>(R.id.buttonSubmit)

        button.setOnClickListener {
            val name = editTextName.text.toString()
            val age = editTextAge.text.toString()

            if (name.isNotBlank() && age.isNotBlank()) {
                val fragment = MyFragment.newInstance(name, age)
                supportFragmentManager.beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .commit()
            } else {
                Toast.makeText(this, "Please fill in the complete information!", Toast.LENGTH_SHORT).show()
            }
        }
        val buttonShowFragment2 = findViewById<Button>(R.id.buttonShowFragment2)

        buttonShowFragment2.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, Fragment2())
                .commit()
        }

    }
}
