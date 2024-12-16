package com.example.pokemonapp.network

import kotlinx.serialization.Serializable

@Serializable
data class NetworkResponse(
    val count: Int,
    val next: String?,
    val previous: String?,
    val results: List<Pokemon>
)