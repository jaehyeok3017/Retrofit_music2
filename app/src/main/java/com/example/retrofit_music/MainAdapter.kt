package com.example.retrofit_music

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.retrofit_music.MainAdapter.*
import com.example.retrofit_music.data.TopTrackData
import com.example.retrofit_music.data.Track
import org.w3c.dom.Text

class MainAdapter(val data: List<Track>) : RecyclerView.Adapter<MainViewHolder>() {
    class MainViewHolder(view : View) : RecyclerView.ViewHolder(view) {
        val rankText = view.findViewById<TextView>(R.id.rankText)
        val musicName = view.findViewById<TextView>(R.id.musicName)
        val artistName = view.findViewById<TextView>(R.id.artistName)

        fun bind(data: Track, position: Int){
            rankText.text = position.plus(1).toString()
            musicName.text = data.name
            artistName.text = data.artist.name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.row_item, parent, false)
        return MainViewHolder(v)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.bind(data[position], position)
    }

    override fun getItemCount(): Int = data.size

}