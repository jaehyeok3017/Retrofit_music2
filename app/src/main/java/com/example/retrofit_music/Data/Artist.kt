package com.example.retrofit_music.Data

import com.google.gson.annotations.SerializedName

data class Artist(
    val mbid: String,

    @SerializedName("artistName")
    val name: String,

    val url: String
)