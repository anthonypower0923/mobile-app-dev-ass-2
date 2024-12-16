package com.example.pokemonapp.data
import com.example.pokemonapp.network.NetworkResponse
import com.example.pokemonapp.network.PokemonAPIService

interface PokemonRepository {
    suspend fun getPokemon(): NetworkResponse
}

class NetworkPokemonRepository(private val pokemonAPIService: PokemonAPIService) :
    PokemonRepository {
    override suspend fun getPokemon(): NetworkResponse = pokemonAPIService.getResponse()
}