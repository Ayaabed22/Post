package com.example.postretrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

    object RetrofitClient {

        val instance:Api by lazy  {
            val retrofit = Retrofit.Builder()
                .baseUrl("https://android-training.appssquare.com/api")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
            retrofit.create(Api::class.java)
        }

    }
