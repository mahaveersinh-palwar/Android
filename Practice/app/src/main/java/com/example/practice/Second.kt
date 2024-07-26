package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Second : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var b1 : Button = findViewById(R.id.button2)
        var b2 : Button = findViewById(R.id.button3)
        var b3 : Button = findViewById(R.id.button4)
        var b4 : Button = findViewById(R.id.button5)

        b1.setOnClickListener {
            var i = Intent(this,Third::class.java)
            startActivity(i)
        }

        b2.setOnClickListener {
            var i = Intent(this,Fourth::class.java)
            startActivity(i)
        }

        b3.setOnClickListener {
            var i = Intent(this,Fifth::class.java)
            startActivity(i)
        }

        b4.setOnClickListener {
            var i = Intent(this,Sixth::class.java)
            startActivity(i)
        }

    }
}