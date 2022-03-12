package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.imageview.ShapeableImageView

class adapter(private val menulist : ArrayList<menu>): RecyclerView.Adapter<adapter.ViewHolder>() {



    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.list_view,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentitem =   menulist[position]
        holder.titleimage.setImageResource(currentitem.titleimage)
        holder.heading.text = currentitem.heading
    }

    override fun getItemCount(): Int {
        return menulist.size
    }
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val titleimage : ShapeableImageView = itemView.findViewById(R.id.titleimage)
        val heading : TextView = itemView.findViewById(R.id.heading)
    }



}