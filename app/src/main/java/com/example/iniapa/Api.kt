package com.example.iniapa


import okhttp3.Response
import retrofit2.Call
import retrofit2.http.GET


interface Api {
    @GET("Posts")
    fun getPosts(): Call<Response>
}