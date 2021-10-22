package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView

class TrendsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_trends)
        val imgArrowBack:ImageView= findViewById(R.id.btn_arrow_back)
                imgArrowBack.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,HomeActivity::class.java)
            startActivity(intent)
        })
    }
}