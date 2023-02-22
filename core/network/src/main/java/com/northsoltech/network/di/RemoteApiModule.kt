package com.northsoltech.network.di

import com.northsoltech.domain.remote.SigningDataSource
import com.northsoltech.domain.remote.SignupRemoteDataSource
import com.northsoltech.network.ApiServices
import com.northsoltech.network.datasource.SigningDataSourceImp
import com.northsoltech.network.datasource.SignupRemoteDataSourceImp
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface RemoteApiModule {

    @Singleton
    @Binds
    fun providesRemoteSignup(signupRemoteDataSourceImp: SignupRemoteDataSourceImp ): SignupRemoteDataSource

    @Singleton
    @Binds
     fun providesRemoteSignings(signingDataSourceImp: SigningDataSourceImp): SigningDataSource
}