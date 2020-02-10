package com.example.ytube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView

//criado o videoholder e inner class

class VideoAdapter(private val videos: ListVideos) : RecyclerView.Adapter<VideoAdapter.VideoHolder>(){


//3° Criar lista, inflar layout rcebendo recurso de xml(list_item_video); criação do VideoHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder =
        VideoHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item_video,
                parent,
                false
            )
        )

    override fun getItemCount(): Int = 10

//2° Chamando o bind do holder
    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        holder.bind()
    }

// 1° Metodo bind vai receber um video
    inner class VideoHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(){

        }

    }


}