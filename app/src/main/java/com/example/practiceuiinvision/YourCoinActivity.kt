package com.example.practiceuiinvision

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView

class YourCoinActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_your_coin)
        val txtTitleApp :TextView= findViewById(R.id.txt_title_appbar)
        val cardViewCoin:LinearLayout=findViewById(R.id.cart_your_coin)
        val btnArrowBack:ImageView=findViewById(R.id.btn_arrow_back)
        txtTitleApp.text ="Your Coins"
        btnArrowBack.setOnClickListener(
            View.OnClickListener {
                val intent:Intent= Intent(this,HomeActivity::class.java)
                startActivity(intent)
            }
        )
        cardViewCoin.setOnClickListener(
            View.OnClickListener {
                val intent:Intent= Intent(this,BitCoinActivity::class.java)
                startActivity(intent)
            }
        )

    }
}