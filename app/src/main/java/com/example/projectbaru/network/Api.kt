package com.example.projectbaru.network

object Api {val newsAPIService: NewsAPIService by lazy {
    retrofit.create(NewsAPIService::class.java)
}
}