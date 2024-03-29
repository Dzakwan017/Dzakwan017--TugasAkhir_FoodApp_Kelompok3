package com.example.tugasakhir_foodapp_kelompok3

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.toolbox.Volley

class Sender : Application(){
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    val requestQueue: RequestQueue?=null
        get(){
            if (field == null){
                return Volley.newRequestQueue(applicationContext)
            }
            return field
        }

    fun <T> addToRequestQueue(request: Request<T>){
        request.tag = TAG
        requestQueue?.add(request)
    }

    companion object{
        private val TAG = Sender::class.java.simpleName
        @get:Synchronized var instance:Sender?=null
            private set
    }
}