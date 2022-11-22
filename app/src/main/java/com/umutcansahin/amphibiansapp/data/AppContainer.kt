package com.umutcansahin.amphibiansapp.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.umutcansahin.amphibiansapp.network.AmphibiansApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val amphibiansRepository: AmphibiansRepository

}


class DefaultAppContainer : AppContainer {
    private val BASE_URL ="https://android-kotlin-fun-mars-server.appspot.com/"


    @kotlinx.serialization.ExperimentalSerializationApi
    private val retrofit: Retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()


    private val retrofitService: AmphibiansApiService by lazy {
        retrofit.create(AmphibiansApiService::class.java)
    }


    override val amphibiansRepository: AmphibiansRepository by lazy {
        DefaultAmphibiansRepository(retrofitService)
    }
}