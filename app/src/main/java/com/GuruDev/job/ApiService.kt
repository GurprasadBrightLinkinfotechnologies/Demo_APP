package com.GuruDev.job

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("/posts")
    fun getPosts(
        @Query("_start") start: Int,
        @Query("_limit") limit: Int
    ): Call<List<Post>>
}
