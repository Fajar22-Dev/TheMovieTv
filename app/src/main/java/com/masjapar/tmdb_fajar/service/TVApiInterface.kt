package com.masjapar.tmdb_fajar.service

import com.masjapar.tmdb_fajar.model.TelevisionResponse
import retrofit2.Call
import retrofit2.http.GET

interface TVApiInterface {
    @GET("/3/tv/popular?api_key=1546c64c7898960d2f6491efce519acb")
    fun getTVList(): Call<TelevisionResponse>

}