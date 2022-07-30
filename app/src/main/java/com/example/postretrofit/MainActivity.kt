package com.example.postretrofit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

        var buttonlogin: Button = findViewById(R.id.buttonlogin)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonlogin.setOnClickListener {
            startActivity(Intent(this@MainActivity, LoginActivity::class.java))

        }

        }

    }
