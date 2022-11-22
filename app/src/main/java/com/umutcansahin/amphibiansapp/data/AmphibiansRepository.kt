package com.umutcansahin.amphibiansapp.data

import com.umutcansahin.amphibiansapp.model.Amphibian
import com.umutcansahin.amphibiansapp.network.AmphibiansApiService

interface AmphibiansRepository {

    suspend fun getAmphibians(): List<Amphibian>
}

class DefaultAmphibiansRepository(
    private val amphibiansApiService: AmphibiansApiService
) : AmphibiansRepository {
    override suspend fun getAmphibians(): List<Amphibian> = amphibiansApiService.getAmphibians()
}