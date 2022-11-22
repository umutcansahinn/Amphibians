package com.umutcansahin.amphibiansapp.network

import com.umutcansahin.amphibiansapp.model.Amphibian
import retrofit2.http.GET

interface AmphibiansApiService {
    @GET("amphibians")
    suspend fun getAmphibians(): List<Amphibian>
}