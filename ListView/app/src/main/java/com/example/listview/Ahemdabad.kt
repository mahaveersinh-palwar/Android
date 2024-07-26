package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Ahemdabad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ahemdabad)

        var fb : FloatingActionButton = findViewById(R.id.fb)

        var txtView : TextView = findViewById(R.id.textView)
        var img : ImageView = findViewById(R.id.imageView2)

        var i = intent
        var nm = i.getStringExtra("Text")
        txtView.setText(nm)

//        if(nm == "Ahemdabad")
//        {
//            img.setImageResource(R.drawable.a)
//        }
//
//        else if (nm == "Amreli")
//        {
//            img.setImageResource(R.drawable.amreli)
//        }

        when(nm)
        {
            "Ahemdabad"->img.setImageResource(R.drawable.a)
            "Amreli"->img.setImageResource(R.drawable.amreli)
            "Ahemdabad"->img.setImageResource(R.drawable.a)
            "Ahemdabad"->img.setImageResource(R.drawable.a)
        }

        fb.setOnClickListener {
            var i = Intent(this,MainActivity::class.java)
            startActivity(i)
        }
    }
}