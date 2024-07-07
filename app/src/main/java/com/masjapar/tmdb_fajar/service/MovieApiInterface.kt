package com.masjapar.tmdb_fajar.service

import com.masjapar.tmdb_fajar.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=1546c64c7898960d2f6491efce519acb")
    fun getMovieList(): Call<MovieResponse>

}