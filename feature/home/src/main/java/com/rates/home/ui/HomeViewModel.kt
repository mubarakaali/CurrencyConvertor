package com.rates.home.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rates.domain.models.ApiResource
import com.rates.domain.models.currency.ConversionRates
import com.rates.domain.repositories.curency.CurrencyConvertorRepo
import com.rates.framework.states.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
private val currencyChangeRepo: CurrencyConvertorRepo
):ViewModel() {

    var currencyConversionState = MutableStateFlow<UiState>(UiState.Idle)
         private set


    fun getCurrencyRate(currencyRate: String) {
        viewModelScope.launch(Dispatchers.IO) {
            currencyChangeRepo.changeCurrency()
                .catch {
                    currencyConversionState.emit(UiState.Error(it.message?:""))
                }
                .collect{ state->
                when(state){
                    is ApiResource.Invalid -> {
                        Log.d("jejeje", "api invalid:....${state.message} ")
                        currencyConversionState.emit(UiState.Error(state.message))
                    }
                    is ApiResource.Loading -> {
                        Log.d("jejeje", ": api loading")
                        currencyConversionState.emit(UiState.Loading)
                    }
                    is ApiResource.Valid ->{
                        state.data?.let {rate->
                            updateCurrencyRate(currencyRate,rate)
                        }
                    }
                }
            }
        }

    }

    private suspend fun updateCurrencyRate(currencyRate: String, conversionRate: ConversionRates) {
        val rateList = arrayListOf<RateData>()
        Log.d("jejeje", ": api success currencyRate... $currencyRate")

        val mxnRate = RateData(rate = conversionRate.mXN?.times(currencyRate.toDouble())?:0.0)
        val audRate = RateData(rate = conversionRate.aUD?.times(currencyRate.toDouble())?:0.0)
        val hkdRate = RateData(rate = conversionRate.hKD?.times(currencyRate.toDouble())?:0.0)

        rateList.add(mxnRate)
        rateList.add(audRate)
        rateList.add(hkdRate)
        Log.d("jejeje", ": api success rateList... $rateList")

        currencyConversionState.emit(UiState.Success(rateList))

    }
}
data class RateData(val rate:Double)