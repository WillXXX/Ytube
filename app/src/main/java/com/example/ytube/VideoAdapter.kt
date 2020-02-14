package com.example.ytube

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

//criado o videoholder e inner class

//Criando lista no construtor do VideoAdapter - chamado de videos e recebe uma List<Video>
//Segunda função que vai espera um video e retorna nada(onClick)
class VideoAdapter(private val videos: List<Video>, val onClick:(Video) -> Unit) : RecyclerView.Adapter<VideoAdapter.VideoHolder>(){

//3° Criar lista, inflar layout rcebendo recurso de xml(list_item_video); criação do VideoHolder
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VideoHolder =
        VideoHolder(
            LayoutInflater.from(parent.context).inflate(
                R.layout.list_item_video,
                parent,
                false
            )
        )
//Passando o tamanho da lista de videos ".size"
    override fun getItemCount(): Int = videos.size

//2° Chamando o bind do holder
//Criar no Holder o video position
    override fun onBindViewHolder(holder: VideoHolder, position: Int) {
        holder.bind(videos[position])
//add parameter fuction "bind"
    }

// 1° Metodo bind vai receber um video
    inner class VideoHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(video: Video) {
//Usar a tag with para pegar todos itens view (buscar - list_item_video.xml)
            with(itemView){setOnClickListener {
                onClick.invoke(video)         //10:55
            }

            }
        }

    }


}