package com.example.tugasakhir_foodapp_kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Sushi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sushi)

        val bar = supportActionBar
        bar!!.title = "Americano"
        bar.setDisplayHomeAsUpEnabled(true)

        val button_keranjang = findViewById<Button>(R.id.button_keranjang)
        val total_harga = findViewById<TextView>(R.id.total_harga)
        val jumlah = findViewById<EditText>(R.id.kuantitas)

        fun main(args: Array<String>){
            val jumlah: Int=0
            val harga: Int = 20000
            val total_harga: Int = jumlah.times(harga)
        }

        total_harga.text = " $total_harga"

        button_keranjang.setOnClickListener {
            val inten = Intent( this,Keranjang::class.java)
            startActivity(inten)
            Toast.makeText(this, "Pesanan Anda akan di proses", Toast.LENGTH_LONG).show()
        }
    }
}