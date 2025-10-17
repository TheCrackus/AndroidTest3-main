package com.example.androidtest3.ui.characters.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.androidtest3.data.model.CharacterResponse
import com.example.androidtest3.domain.GetAllCharactersUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

/**
 *   Created by Erik Armando on 07/04/25
 */
@HiltViewModel
class MainViewModel @Inject constructor(
    private val getAllCharactersUseCase: GetAllCharactersUseCase
): ViewModel() {

    private val _getCharacter = MutableStateFlow<CharacterResponse?>(null)
    val getCharacter: StateFlow<CharacterResponse?> get() = _getCharacter.asStateFlow()

    init {
        detonatorCharacter()
    }

    fun detonatorCharacter(){
        viewModelScope.launch {
            getAllCharactersUseCase().collect{
                _getCharacter.emit(it)
            }
        }
    }
}