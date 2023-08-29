package com.example.fooder

import android.os.Bundle
import android.animation.ObjectAnimator
import android.view.animation.AccelerateInterpolator;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animatedText: TextView = findViewById(R.id.apploadpage)

        // Create an ObjectAnimator to animate the alpha property
        val fadeInAnimator = ObjectAnimator.ofFloat(animatedText, "text", 0f, 1f)
        fadeInAnimator.duration = 1000 // Duration in milliseconds
        fadeInAnimator.interpolator = AccelerateInterpolator()

        // Start the animation
        fadeInAnimator.start()
    }

}