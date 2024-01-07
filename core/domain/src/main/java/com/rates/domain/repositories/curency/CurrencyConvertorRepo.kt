package com.rates.domain.repositories.curency

import com.rates.domain.models.ApiResource
import com.rates.domain.models.currency.ConversionRates
import kotlinx.coroutines.flow.Flow

interface CurrencyConvertorRepo {
    fun changeCurrency(): Flow<ApiResource<ConversionRates?>>
}