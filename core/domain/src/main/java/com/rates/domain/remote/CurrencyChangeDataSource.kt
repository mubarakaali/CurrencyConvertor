package com.rates.domain.remote

import com.rates.domain.models.ApiResource
import com.rates.domain.models.currency.ConversionRates
import kotlinx.coroutines.flow.Flow

interface CurrencyChangeDataSource {
    fun changeCurrency():Flow<ApiResource<ConversionRates?>>
}