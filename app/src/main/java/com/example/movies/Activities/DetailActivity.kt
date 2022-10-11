package com.example.movies.Activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.movies.Models.Movie
import com.example.movies.R
import kotlinx.android.synthetic.main.activity_detail.*
import kotlinx.android.synthetic.main.movie_item.*
import kotlinx.android.synthetic.main.movie_item.view.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val movie = intent.getParcelableExtra<Movie>(MainActivity.INTENT_PARCELABLE)

        val title = findViewById<TextView>(R.id.mTitle)
        val poster = findViewById<ImageView>(R.id.poster_image)
        val release = findViewById<TextView>(R.id.release)
        val overview = findViewById<TextView>(R.id.movervie_tv)
        val votes=findViewById<TextView>(R.id.movie_votes)
        val popularity=findViewById<TextView>(R.id.popularity)

        val IMAGE_BASE = "https://image.tmdb.org/t/p/w500/"

        Glide.with(this).load(IMAGE_BASE + movie!!.poster).into(poster_image)

        title.text = movie?.title
        release.text = movie.release
        overview.text = movie?.overview
        votes.text=movie?.vote_count
        popularity.text=movie?.popularity


    }

}