package com.example.pokemonapp.network
import kotlinx.serialization.Serializable

@Serializable
data class Pokemon(
    val name: String,
    val url: String,
)