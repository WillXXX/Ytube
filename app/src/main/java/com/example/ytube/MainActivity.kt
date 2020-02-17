package com.example.ytube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_main.*
import okhttp3.OkHttpClient
import okhttp3.Request
import java.lang.Exception

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
//Fazer requisições web utilizando o retrofit2, utilizando a função que "getVideo" retorna lista pronta ou não por isso a "?"
    private fun getVideo(): ListVideo?{
        val client = OkHttpClient.Builder()
            .build()

        val request = Request.Builder()
            .get()
            .url("https://tiagoaguiar.co/api/youtube-videos")
            .build()

        return try {
            val response = client.newCall(request).execute()

            if (response.isSuccessful){
                GsonBuilder().create()
                    .fromJson(response.body()?.string(), ListVideo::class.java)
            }else{
                null
            }
        }catch (e: Exception){
            null
        }
    }

}

