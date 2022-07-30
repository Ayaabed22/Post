package com.example.postretrofit


import com.google.gson.annotations.SerializedName

data class User(
    @SerializedName("email")
    val email: String? = null,
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("name")
    val name: String? = null
)