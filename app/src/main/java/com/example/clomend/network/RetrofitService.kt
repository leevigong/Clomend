package com.example.clomend.network

import retrofit2.Call
import retrofit2.http.*

interface RetrofitService {
    @GET("/")
    fun getUser(@Query("request") name:String): Call<User>

    @GET("/login")
    fun login(@Query("request") id: String): Call<User>



    @POST("/")
    fun post_user(
        @Field("id")id: String,
        @Field("password")password: String
    ):Call<User>


}