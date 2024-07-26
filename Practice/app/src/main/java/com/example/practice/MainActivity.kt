package com.example.practice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.ProgressBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        var imgview : ImageView = findViewById(R.id.imageView2)
        var pb : ProgressBar = findViewById(R.id.progressBar)

        Thread(Runnable {
            var count = 0

            while (count <= 100)
            {
                Thread.sleep(50)
                count++
                pb.setProgress(count)
            }

            if (count >= 100)
            {
                var i = Intent(this,Second::class.java)
                startActivity(i)
            }
        }).start()
    }
}