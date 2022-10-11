package com.example.movies.Services

import com.example.movies.Models.Movie
import com.example.movies.Models.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {

    @GET("/3/discover/movie?api_key=c9856d0cb57c3f14bf75bdc6c063b8f3")
    fun getMovieList(): Call<MovieResponse>

    @GET("/3/movie/{id}?api_key=c9856d0cb57c3f14bf75bdc6c063b8f3")
    fun getMovieDetail(id:String?): Call<Movie>
}