package com.example.ytube



//Adicionar todos data models aqui
data class Video(
    val id: String,
    val thumbnailUrl: String,
    val title: String,
    val viewsCount: Long,
    val videoUrl: String,
    val Publisher: Publisher //publicador que youtube (Definindo object o publisher)
)

data class Publisher(
    val id: String,
    val name: String,
    val pictureProfileUrl: String
)

data class ListVideo(
    val status: Int,
    val data: List<Video>
)