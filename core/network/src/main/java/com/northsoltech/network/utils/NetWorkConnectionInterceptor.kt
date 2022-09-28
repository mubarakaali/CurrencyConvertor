package com.northsoltech.network.utils

import android.content.Context
import okhttp3.Interceptor
import okhttp3.Response

class NetWorkConnectionInterceptor constructor(private val context: Context):Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        if (!isConnected(context)){
            throw NoConnectivityException()
        }
        val builder = chain.request().newBuilder()
        return chain.proceed(builder.build())
    }
}