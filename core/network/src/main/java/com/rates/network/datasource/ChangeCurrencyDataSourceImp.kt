package com.rates.network.datasource

import com.rates.domain.models.ApiResource
import com.rates.domain.models.currency.ConversionRates
import com.rates.domain.models.transform
import com.rates.domain.remote.CurrencyChangeDataSource
import com.rates.network.ApiServices
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class ChangeCurrencyDataSourceImp @Inject constructor (private val apiServices: ApiServices):BaseRemoteDataSource(),CurrencyChangeDataSource {
    override fun changeCurrency(): Flow<ApiResource<ConversionRates?>>  = safeApiCall {
        apiServices.currencyConversion()
    }.map { res ->
        res.transform {
            it.conversionRatesDto?.toConversionRatesDomain()
        }
    }
}