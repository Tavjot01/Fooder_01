package com.example.fooder


import android.animation.ObjectAnimator
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.view.animation.AccelerateInterpolator
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var timer_count = 0
        var AllowedNext = false
        for (i in 1..50){
            if(i == 50){
                AllowedNext = true

            }

        }
        if(AllowedNext){
            val intent  = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }}