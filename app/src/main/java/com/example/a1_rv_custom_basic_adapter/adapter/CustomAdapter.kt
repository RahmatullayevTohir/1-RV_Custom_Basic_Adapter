package com.example.a1_rv_custom_basic_adapter.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.a1_rv_custom_basic_adapter.R
import com.example.a1_rv_custom_basic_adapter.model.User
import com.google.android.material.bottomnavigation.BottomNavigationItemView

class CustomAdapter(val users: List<User>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_custom_layout,parent,false)
        return CustomViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val user = users.get(position)
        if (holder is CustomViewHolder){
            holder.name.setText(user.name)
        }
    }

    override fun getItemCount(): Int {
        return users.size
    }

    class CustomViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val name = itemView.findViewById<TextView>(R.id.name)
    }

}