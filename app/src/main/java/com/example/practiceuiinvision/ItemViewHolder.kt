package com.example.practiceuiinvision

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import java.lang.ref.WeakReference

class ItemViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
    private val  view=WeakReference(itemView)
    private  lateinit var textView: TextView

    var index =0
    init {
        view.get()?.let {
            textView =it.findViewById(R.id.tv_content_notification)

        }
    }

    fun updateView(){
        textView.text="index $index"
    }
}