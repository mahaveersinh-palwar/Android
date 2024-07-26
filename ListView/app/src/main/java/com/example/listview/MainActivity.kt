package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview : ListView = findViewById(R.id.listview)

        var ary = arrayOf("Ahemdabad","Amreli","Junagadh","Gandhinagar","Surat")
        var adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ary)

        listview.adapter = adapter

        listview.setOnItemClickListener { adapterView, view, i, l ->
            var value = listview.getItemAtPosition(i).toString()
            Toast.makeText(applicationContext,value,Toast.LENGTH_SHORT).show()

             var i = Intent(this,Ahemdabad::class.java)
             i.putExtra("Text",value.toString())
             startActivity(i)
        }



    }
}