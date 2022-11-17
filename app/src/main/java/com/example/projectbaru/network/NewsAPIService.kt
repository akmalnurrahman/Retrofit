package com.example.projectbaru.network

import com.example.projectbaru.model.NewsData
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

private val BASE_URL = "https://newsapi.org/v2/"
private val retrofit = Retrofit.Builder()
    .addConverterFactory(GsonConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsAPIService {
    @GET ("top-headlines?country=id&apiKey=717d974527ae4a02b50d1a1dc0c3f2ab")
    suspend fun getTopHeadline(): NewsData
}

object Api {
    val newsAPIService: NewsAPIService by lazy {
        retrofit.create(NewsAPIService::class.java)
    }
}