package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView

class SuccessOderActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_success_oder)
        val btnArrowBack:ImageView=findViewById(R.id.btn_arrow_back_layout_bitcoin)
        btnArrowBack.setOnClickListener(View.OnClickListener {
            val intent:Intent = Intent(this,BitCoinActivity::class.java)
            startActivity(intent)
        })
    }
}