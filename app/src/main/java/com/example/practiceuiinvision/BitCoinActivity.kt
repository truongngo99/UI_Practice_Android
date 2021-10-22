package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class BitCoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bit_coin)
        val btnArrowBack: ImageView= findViewById(R.id.btn_arrow_back_layout_bitcoin)
        val btnBuyOder:Button=findViewById(R.id.btn_buy_oder)
        btnArrowBack.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,YourCoinActivity::class.java)
            startActivity(intent)
        })
        btnBuyOder.setOnClickListener(View.OnClickListener {
            val intent: Intent = Intent(this,SuccessOderActivity::class.java)
            startActivity(intent)
        })

    }
}