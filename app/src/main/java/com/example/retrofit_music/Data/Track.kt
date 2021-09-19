package com.example.retrofit_music.Data

import com.google.gson.annotations.SerializedName

data class Track(
    val artist: Artist,

    val duration: String,
    val image: List<Image>,
    val listeners: String,
    val mbid: String,

    @SerializedName("name")
    val name: String,

    val playcount: String,
    val streamable: Streamable,
    val url: String
)