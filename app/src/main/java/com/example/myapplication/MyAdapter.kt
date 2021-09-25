package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val responseList:List<ResponseDTO>): RecyclerView.Adapter<MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_layout,parent,false)
        return (MyHolder(view))
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val responseDTO=responseList[position]
        holder.setData(responseDTO)
    }

    override fun getItemCount(): Int {
        return responseList.size
    }
}