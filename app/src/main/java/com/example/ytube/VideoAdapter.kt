package com.example.ytube

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.list_item_video.view.*

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
        @SuppressLint("StringFormatMatches")
        fun bind(video: Video) {
//Usar a tag with para pegar todos itens view (buscar - list_item_video.xml)
            with(itemView){setOnClickListener {
                onClick.invoke(video)         //12:48
                }

/*Utilizar a biblioteca Picasso para fazer o download assinclono das imagens utilizadas, aqui dar um load e passar as urls a serem
 utilizadas*/
                Picasso.get().load(video.thumbnailUrl).into(video_thumbnail)
                Picasso.get().load(video.Publisher.pictureProfileUrl).into(video_author)
                video_title.text = video.title
//concatenando propiedades 'string.info' para formatar propiedades (%1$s-%2$s views)
                video_infor.text = context.getString(R.string.info,
                    video.Publisher.name, video.viewsCount)
            }
        }

    }

}