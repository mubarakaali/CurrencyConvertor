package com.rates.network.di

import com.rates.domain.remote.CurrencyChangeDataSource
import com.rates.network.datasource.ChangeCurrencyDataSourceImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RemoteApiModule {

     @Singleton
     @Binds
     fun providesRemoteCurrency(currencyDataSourceImp: ChangeCurrencyDataSourceImp):CurrencyChangeDataSource
}