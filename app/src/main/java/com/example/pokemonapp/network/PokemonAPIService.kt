package com.example.pokemonapp.network
import com.example.pokemonapp.data.AppContainer
import com.example.pokemonapp.data.NetworkPokemonRepository
import com.example.pokemonapp.data.PokemonRepository
import retrofit2.Retrofit
import retrofit2.http.GET
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.http.Path

class DefaultAppContainer : AppContainer {
    private val baseUrl = "https://pokeapi.co/api/v2/"

    private val retrofit = Retrofit.Builder()
//        .addConverterFactory(GsonConverterFactory.create())
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(baseUrl)
        .build()
    private val retrofitService: PokemonAPIService by lazy {
        retrofit.create(PokemonAPIService::class.java)
    }

    override val pokemonRepository: PokemonRepository by lazy {
        NetworkPokemonRepository(retrofitService)
    }
}

interface PokemonAPIService {

    @GET("pokemon?limit=100000")
    suspend fun getResponse(): NetworkResponse

    @GET("pokemon/{id}")
    suspend fun getPokemon(id: Int) : Pokemon
}