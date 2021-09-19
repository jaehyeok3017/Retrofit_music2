package com.example.retrofit_music.Data

import com.google.gson.annotations.SerializedName

data class Attr(
    val page: String,
    @SerializedName("perpage")
    val perPage: String,
    val total: String,
    val totalPages: String
)