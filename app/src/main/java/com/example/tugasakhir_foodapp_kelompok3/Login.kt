package com.example.tugasakhir_foodapp_kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val bar = supportActionBar
        bar!!.title = "Ngopii"
        bar.setDisplayHomeAsUpEnabled(true)

        val username = findViewById<EditText>(R.id.username)
        val password = findViewById<EditText>(R.id.password)
        val button_login = findViewById<Button>(R.id.button_login)
        val to_regis = findViewById<TextView>(R.id.to_regis)

        button_login.setOnClickListener {
            // intent digunakan untuk memanggil / menampilkan activity baru
            val inten = Intent( this,Daftar_Menu::class.java)
            startActivity(inten)
            Toast.makeText(this, "Anda berhasil login", Toast.LENGTH_SHORT).show()
        }

        to_regis.setOnClickListener {
            val inten = Intent( this,Register::class.java)
            startActivity(inten)
        }
    }
}