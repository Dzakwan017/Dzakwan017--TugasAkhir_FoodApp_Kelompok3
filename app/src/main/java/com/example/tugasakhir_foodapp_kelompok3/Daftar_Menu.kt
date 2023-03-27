package com.example.tugasakhir_foodapp_kelompok3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import android.widget.SearchView
import android.widget.Toast

class Daftar_Menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_menu)

        val bar = supportActionBar
        bar!!.title = "DAFTAR MENU Ngopii"
        bar.setDisplayHomeAsUpEnabled(true)

        var listView = findViewById<ListView>(R.id.listview)
        val cari_menu = findViewById<SearchView>(R.id.cari_menu)
        var list = mutableListOf<List_Menu>()

        list.add(List_Menu("Kopi Susu", "Rp 20.000", R.drawable.kopisusu, 4.0))
        list.add(List_Menu("Kopi Pandan", "Rp 25.000", R.drawable.kopipandan, 3.5))

        listView.adapter = List_MenuAdapter(this, R.layout.activity_listview, list)

//        listView.setOnItemClickListener { adapterView, view, i, l ->
//            when (i) {
//                0 -> Toast.makeText(this, "Kamu memilih Sushi", Toast.LENGTH_LONG).show()
//                1 -> Toast.makeText(this, "Kamu memilih Ramen", Toast.LENGTH_LONG).show()
//            }
//        }

        listView.setOnItemClickListener { adapterView, view, i, l ->
            when (i) {
                0 -> {
                    val inten = Intent( this,Sushi::class.java)
                    startActivity(inten)
                    Toast.makeText(this, "Kamu memilih Sushi", Toast.LENGTH_LONG).show()
                }
                1 -> {
                    val inten = Intent( this,Ramen::class.java)
                    startActivity(inten)
                    Toast.makeText(this, "Kamu memilih Ramen", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
}