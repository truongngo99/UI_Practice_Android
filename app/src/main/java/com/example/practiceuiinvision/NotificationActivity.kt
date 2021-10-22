package com.example.practiceuiinvision

import android.content.Context
import android.content.Intent
import android.content.res.Resources
import android.graphics.*
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.internal.ContextUtils.getActivity
import androidx.annotation.NonNull
import androidx.core.content.ContextCompat


class NotificationActivity : AppCompatActivity() {
    private val  recyclerView:RecyclerView by  lazy {
        findViewById(R.id.recyclerView)
    }
    private val layoutManager =LinearLayoutManager(this)
    private  val  adapter = NotificationAdapter()
    var mContext: Context? = null
    private val p: Paint? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
        val btnArrowBack:ImageView = findViewById(R.id.btn_arrow_back)
        val tvTitleNotification:TextView = findViewById(R.id.txt_title_appbar)
        adapter.reload(createDummyData())
        setItemTouchHelper()
        btnArrowBack.setOnClickListener(View.OnClickListener {
            val intent:Intent =Intent(this, HomeActivity::class.java)
            startActivity(intent)
        })
        tvTitleNotification.text ="Notifications"
    }
    private fun setItemTouchHelper(){
        ItemTouchHelper(object :ItemTouchHelper.Callback(){
            override fun getMovementFlags(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder
            ): Int {
                val dragFlag = 0
               val swipeFlags = ItemTouchHelper.LEFT
                return makeMovementFlags(dragFlag,swipeFlags)
            }

            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return true
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
               if(4==direction){
                   adapter.removeItem(viewHolder as ItemViewHolder)
               }
            }

            override fun onChildDraw(
                c: Canvas,
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                dX: Float,
                dY: Float,
                actionState: Int,
                isCurrentlyActive: Boolean
            ) {
                super.onChildDraw(
                    c,
                    recyclerView,
                    viewHolder,
                    dX,
                    dY,
                    actionState,
                    isCurrentlyActive
                )
            }

        }).apply {
            attachToRecyclerView(recyclerView)
        }
    }
    private  fun createDummyData():List<Int>{
        val list = mutableListOf<Int>()
        for (i in 0 until 50){
            list.add(i)
        }
        return  list
    }
}