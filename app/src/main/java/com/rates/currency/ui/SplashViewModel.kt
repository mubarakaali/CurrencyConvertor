package com.rates.currency.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor(
) : ViewModel() {
    var isTimeOut = mutableStateOf(false)

    //    val isTimeOut = _isTimeOut.asStateFlow()
    init {
        if (!isTimeOut.value) goToNextScreen()
    }

    private fun goToNextScreen() {
        viewModelScope.launch {
            delay(2000)
            isTimeOut.value = true
        }
    }
}