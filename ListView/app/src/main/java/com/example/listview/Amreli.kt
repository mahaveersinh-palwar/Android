package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Amreli : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amreli)
        var fb: FloatingActionButton = findViewById(R.id.fb)

        fb.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
    }
}