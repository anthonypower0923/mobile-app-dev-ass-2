package com.example.pokemonapp.network

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class NetworkResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Result>

)
@Serializable
data class Result (
    val name: String,
    val url: String
)