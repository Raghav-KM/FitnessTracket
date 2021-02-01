package com.example.fitness

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        login_btn.setOnClickListener {
            val username = username_et.text.toString()
            val password = password_et.text.toString()

            when {
                username.isEmpty() -> {
                    Toast.makeText(this, "Enter username", Toast.LENGTH_SHORT).show()
                }
                password.isEmpty() -> {
                    Toast.makeText(this, "Enter password", Toast.LENGTH_SHORT).show()
                }
                password == "1" -> {
                    val intent : Intent = Intent(this@MainActivity, SecondActivity::class.java)
                    intent.putExtra("username", username)
                    startActivity(intent)
                }
                else -> {
                    Toast.makeText(this, "Incorrect Password", Toast.LENGTH_SHORT).show()
                }
            }

        }

    }
}