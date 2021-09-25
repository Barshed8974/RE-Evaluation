package com.example.myapplication

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import kotlinx.android.synthetic.main.item_layout.view.*

class MyHolder(private  val  view:View): RecyclerView.ViewHolder(view) {
    fun setData(responseDTO: ResponseDTO) {
        view.apply {
            Glide.with(image).load(responseDTO.media?.imageUrl!!)
            name.text = responseDTO.name
            var price1 = responseDTO.retailPrice
            price.text = "Price  $" + price1
        }
    }
}