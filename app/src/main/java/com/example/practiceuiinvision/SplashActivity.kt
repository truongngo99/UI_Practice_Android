package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_acivity)

       val  textViewSplash: TextView = findViewById(R.id.text_view_splash);
        textViewSplash.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        });
    }
}