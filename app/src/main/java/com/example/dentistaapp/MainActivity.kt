package com.example.dentistaapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCadastro = findViewById<AppCompatButton>(R.id.btnIrCad)

        buttonCadastro.setOnClickListener {

            val intent = Intent(this,FormCadastro::class.java)
            startActivity(intent)
        }
    }
}