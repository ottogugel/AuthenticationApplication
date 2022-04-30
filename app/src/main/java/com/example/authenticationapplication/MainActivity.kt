package com.example.authenticationapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ActivityMain : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val botao = findViewById<Button>(R.id.button_access)
        botao.setOnClickListener {
            Toast.makeText(this, "Login realizado com sucesso", Toast.LENGTH_LONG).show()
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
        }

        val botao2 = findViewById<Button>(R.id.button_register)
        botao2.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
        }

        }

    }

