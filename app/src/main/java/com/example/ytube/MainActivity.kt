package com.example.ytube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val videos:MutableList<Video> = mutableListOf<Video>()

//Add adapter no recyvlerview para a lista começar a ser renderizada
        rv_main.layoutManager = LinearLayoutManager(this)


//Instaciando video adapter para ele aparecer na tela
//Criar lista de videos no adapter
        rv_main.adapter = VideoAdapter(videos)   //08:46 no video
    }


}

 //Endereço:    https://tiagoaguiar.co/api/youtube-videos