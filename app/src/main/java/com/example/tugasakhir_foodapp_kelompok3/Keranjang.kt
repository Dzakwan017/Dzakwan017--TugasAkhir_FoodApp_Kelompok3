package com.example.tugasakhir_foodapp_kelompok3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Keranjang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang)

        val bar = supportActionBar
        bar!!.title = "Keranjang"
        bar.setDisplayHomeAsUpEnabled(true)
    }
}