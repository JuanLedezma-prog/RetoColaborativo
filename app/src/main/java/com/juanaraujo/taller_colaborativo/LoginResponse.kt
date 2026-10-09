package com.juanaraujo.taller_colaborativo

data class LoginResponse(
    val id: Int,
    val username: String,
    val email: String,
    val firstName: String,
    val accessToken: String,
    val refreshToken: String
)
