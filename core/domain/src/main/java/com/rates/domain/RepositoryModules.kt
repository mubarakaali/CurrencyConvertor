package com.rates.domain

import com.rates.domain.repositories.curency.CurrencyConvertorRepo
import com.rates.domain.repositories.curency.CurrencyConvertorRepoImp
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
interface RepositoryModules {

     @Binds
     @ActivityRetainedScoped
     fun providesCurrencyRepo(currencyConvertorRepoImp: CurrencyConvertorRepoImp):CurrencyConvertorRepo
}