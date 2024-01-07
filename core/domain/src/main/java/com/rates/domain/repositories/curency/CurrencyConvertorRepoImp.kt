package com.rates.domain.repositories.curency

import com.rates.domain.models.ApiResource
import com.rates.domain.models.currency.ConversionRates
import com.rates.domain.remote.CurrencyChangeDataSource
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class CurrencyConvertorRepoImp @Inject constructor(private val currencyChangeDataSource: CurrencyChangeDataSource):CurrencyConvertorRepo {
    override fun changeCurrency(): Flow<ApiResource<ConversionRates?>> = currencyChangeDataSource.changeCurrency()
}