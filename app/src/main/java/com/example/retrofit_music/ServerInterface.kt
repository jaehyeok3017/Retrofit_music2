package com.example.retrofit_music

import com.example.retrofit_music.Data.TopTrackData
import com.example.retrofit_music.Data.Track
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ServerInterface {
    // 여기서 만들어야 하는 부분 : ?method=chart.gettoptracks&api_key=563f17153e9c60240d5e29bb1a508549&format=json

    @GET("2.0/")
    fun getPosts(@Query("method") method : String,
        @Query("api_key") api_key : String,
        @Query("format") format : String) : Call<TopTrackData>
}

