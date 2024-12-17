package com.example.pokemonapp.network
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json

@Serializable
data class Pokemon(
//    val name: String,
//    val url: String,
    val id: Int,
    val name: String,
    val base_experience: Int,
    val height: Int,
    val weight: Int,
    val sprites: Sprite
)