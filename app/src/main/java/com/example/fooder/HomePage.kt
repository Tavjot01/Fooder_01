package com.example.fooder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)


        val password = findViewById<EditText>(R.id.password)
        val username = findViewById<EditText>(R.id.username)
        val button =  findViewById<Button>(R.id.Submit)

        button.setOnClickListener(){
            val username_Input =  username.text.toString()
            val password = password.text.toString()

            if(username.equals("Ekam") && password == "1234"){
                print(" Welcome to Fooder! ")
                Handler(Looper.getMainLooper()).postDelayed({
                    startActivity(Intent(this,Restaurant_HomePage::class.java))
                },2000)

            }
        }
    }
}