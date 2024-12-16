package com.example.pokemonapp.ui.screens

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import java.io.IOException
import com.example.pokemonapp.data.PokemonRepository
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.example.pokemonapp.PokemonApplication
import com.example.pokemonapp.network.Pokemon

sealed interface PokemonUiState {
    data class Success(val pokemon: List<Pokemon>) : PokemonUiState
    object Error : PokemonUiState
    object Loading : PokemonUiState
}

class PokemonViewModel(private val pokemonRepository: PokemonRepository) : ViewModel() {
    var pokemonUiState: PokemonUiState by mutableStateOf(PokemonUiState.Loading)
        private set

    init {
        getPokemon()
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = (this[APPLICATION_KEY] as PokemonApplication)
                val pokemonRepository = application.container.pokemonRepository
                PokemonViewModel(pokemonRepository = pokemonRepository)
            }
        }
    }

    fun getPokemon() {
        viewModelScope.launch {
            pokemonUiState = try {
                PokemonUiState.Success(pokemonRepository.getPokemon())
            } catch (e: IOException) {
                PokemonUiState.Error
            }
        }
    }
}
