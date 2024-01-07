package com.rates.framework.states

sealed class UiState{
    object Idle:UiState()
    object Loading:UiState()
    data class Success<T>(val data:T): UiState()
    class Error(e:String):UiState()
}
