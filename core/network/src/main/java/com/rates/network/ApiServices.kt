package com.rates.network

import com.rates.network.models.currency.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface ApiServices {
    @GET
    suspend fun currencyConversion(@Url url: String = "EUR"):Response<CurrencyResponse>

}