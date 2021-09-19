package com.example.retrofit

import com.example.retrofit_music.MainActivity
import com.example.retrofit_music.ServerInterface
import okhttp3.internal.Internal.instance
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServerClient {
    private const val baseUrl = "https://ws.audioscrobbler.com/"

    private val retrofit:Retrofit = Retrofit.Builder()
        .baseUrl(baseUrl)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

}