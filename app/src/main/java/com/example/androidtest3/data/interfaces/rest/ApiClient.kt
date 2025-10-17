package com.example.androidtest3.data.interfaces.rest

import com.example.androidtest3.data.model.CharacterResponse
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {

    @GET("character")
    suspend fun getAllCharacters(): Response<CharacterResponse>
}