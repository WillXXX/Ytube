package com.example.ytube

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//Add adapter no recyvlerview para a lista começar a ser renderizada
        rv_main.layoutManager = LinearLayoutManager(this)

//Instaciando video adapter para ele aparecer na tela
        rv_main.adapter = VideoAdapter()
    }


}
