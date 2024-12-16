package com.example.pokemonapp
import android.app.Application
import com.example.pokemonapp.network.DefaultAppContainer
import com.example.pokemonapp.data.AppContainer

class PokemonApplication : Application() {
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }
}