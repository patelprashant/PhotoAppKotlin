package com.example.android.photoappkotlin.api

import com.example.android.photoappkotlin.models.PhotoList
import retrofit2.Call
import retrofit2.http.GET

interface PhotoAPI {

    //https://pixabay.com/api/?key=5241542-28977176fbcc7636f0d8a9655&q=android&image_type=photo
    @GET("?key=5241542-28977176fbcc7636f0d8a9655&q=android&image_type=photo")
    fun getPhotos() : Call<PhotoList>
}