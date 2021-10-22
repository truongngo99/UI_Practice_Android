package com.example.practiceuiinvision

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class NotificationAdapter:RecyclerView.Adapter<ItemViewHolder>() {
    private  var list = mutableListOf<Int>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return  ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.layout_item_notification,parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.index =list[position]
        holder.updateView()
    }

    override fun getItemCount(): Int {
        return list.size
    }
    fun reload(list:List<Int>){
        this.list.clear()
        this.list.addAll(list)
        notifyDataSetChanged()
    }
    fun removeItem(viewHolder:ItemViewHolder){
        list.removeAt(viewHolder.adapterPosition)
        notifyItemRemoved(viewHolder.adapterPosition)
    }
}