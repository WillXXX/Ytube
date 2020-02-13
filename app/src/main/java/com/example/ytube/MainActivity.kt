package com.example.ytube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//"mutableListOf" é uma lista de dados que pode mudar seu estado diferente do listOf que não mudar seu estado
        val videos:MutableList<Video> = mutableListOf<Video>()

//Add adapter no recyvlerview para a lista começar a ser renderizada
        rv_main.layoutManager = LinearLayoutManager(this)

//Instaciando video adapter para ele aparecer na tela
//Criar lista de videos no adapter
//Fechar com {} para receber a reposta do bloco de código, e já imprimir o video "println"
        rv_main.adapter = VideoAdapter(videos){video: Video ->
            println(video)
        }
    }


}

 //Endereço:    https://tiagoaguiar.co/api/youtube-videos