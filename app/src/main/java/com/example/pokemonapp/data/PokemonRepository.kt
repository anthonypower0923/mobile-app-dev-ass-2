package com.example.pokemonapp.data
import com.example.pokemonapp.network.NetworkResponse
import com.example.pokemonapp.network.Pokemon
import com.example.pokemonapp.network.PokemonAPIService
import com.example.pokemonapp.network.Sprite

interface PokemonRepository {
    suspend fun getResponse(): NetworkResponse
    suspend fun getPokemon(): List<Pokemon>
}

class NetworkPokemonRepository(private val pokemonAPIService: PokemonAPIService) :
    PokemonRepository {
    override suspend fun getResponse(): NetworkResponse = pokemonAPIService.getResponse()
    override suspend fun getPokemon(): List<Pokemon> {
        val pokemonList = mutableListOf<Pokemon>()
        // Start at 1 as id is indexed from 1
        for (i in 1..151) {
            val pokemon = pokemonAPIService.getPokemon(i)
            pokemonList.add(pokemon)
    }
        return pokemonList
    }
}