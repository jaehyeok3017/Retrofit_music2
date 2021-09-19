package com.example.retrofit_music

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit.ServerClient
import com.example.retrofit_music.data.TopTrackData
import com.example.retrofit_music.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.create

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val call = ServerClient.retrofit
            .create(ServerInterface::class.java)
            .getPosts("chart.gettoptracks", "563f17153e9c60240d5e29bb1a508549", "json")

        call.enqueue(object:Callback<TopTrackData>{
            override fun onResponse(call: Call<TopTrackData>, response: Response<TopTrackData>) {
                if(response.isSuccessful){
                    val track = response.body()

                    findViewById<RecyclerView>(R.id.recycler).adapter = MainAdapter(track!!.tracks.track)
                }
            }

            override fun onFailure(call: Call<TopTrackData>, t: Throwable) {
                TODO("Not yet implemented")
            }

        })
    }
}

