package com.example.ytube

import retrofit2.http.Url


//Adicionar todos data models aqui
data class Video(
    val id: String,
    val thumbnail: String,
    val title: String,
    val viewsCount: Long,
    val videoUrl: String
)

data class Publisher(
    val id: String,
    val name: String,
    val pictureProfileUrl: String
)

data class ListVideos(
    val status: Int,
    val data: List<Video>
)