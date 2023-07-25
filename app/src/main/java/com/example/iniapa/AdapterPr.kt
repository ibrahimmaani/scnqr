package com.example.iniapa

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class AdapterPr(private val list: ArrayList<PostResponse>): RecyclerView.Adapter<AdapterPr.PostViewHolder>() {
    inner class PostViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
    fun bind(postResponse: PostResponse){
        with(itemView){
            val text = "id ${postResponse.id}\n" +
                    "title ${postResponse.title}\n"+
                    "text ${postResponse.text}\n"
            tvName.text

        }
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.item_promo, parent, false)
        return PostViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostViewHolder, position: Int) {

    }

    override fun getItemCount(): Int = list.size
}