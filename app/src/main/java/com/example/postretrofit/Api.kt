package com.example.postretrofit

import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

interface Api {
    @FormUrlEncoded
    @POST("/login?email=appssquare@gmail.org&password=123456789")
    fun createUser(
        @Field("id")id:Int,
        @Field("name")name:String,
        @Field("email") email:String,
        ):Call<User>
    @FormUrlEncoded
    @POST("/login?email=appssquare@gmail.org&password=123456789")
fun userLogin(
        @Field("email") email:String,
        @Field("password") password:String
):Call<LoginResponse>
}