package com.example.ytube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

class VideoAdapter() : RecyclerView.Adapter<VideoAdapter.VideoHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder =
        VideoHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item_video,
                parent,
                false
            )
        )


    override fun getItemCount(): Int = 10


    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
    }


    inner class VideoHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(){

        }

    }


}