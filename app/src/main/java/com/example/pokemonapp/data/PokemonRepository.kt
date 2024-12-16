package com.example.pokemonapp.data
import com.example.pokemonapp.network.Pokemon
import com.example.pokemonapp.network.PokemonAPIService
import com.example.pokemonapp.network.Sprite

interface PokemonRepository {
    suspend fun getPokemon(): List<Pokemon>
    suspend fun getSprite(name: String): Sprite
}

class NetworkPokemonRepository(private val pokemonAPIService: PokemonAPIService) :
    PokemonRepository {
    override suspend fun getPokemon(): List<Pokemon> = pokemonAPIService.getResponse().results
    override suspend fun getSprite(name: String): Sprite {
        return pokemonAPIService.getSprite(name)
    }
}