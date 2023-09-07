package com.example.fooder


import android.animation.ObjectAnimator
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
        setContentView(R.layout.layout)


        val password = findViewById<EditText>(R.id.password)
        val username = findViewById<EditText>(R.id.username)
        val button =  findViewById<Button>(R.id.Submit)

        button.setOnClickListener(){
            val username_Input =  username.text.toString()
            val password = password.text.toString()

            if(username.equals("Ekam") && password == "1234"){
                print(" Welcome to Fooder! ")

            }
        }

    }}