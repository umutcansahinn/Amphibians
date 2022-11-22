package com.umutcansahin.amphibiansapp

import android.app.Application
import com.umutcansahin.amphibiansapp.data.AppContainer
import com.umutcansahin.amphibiansapp.data.DefaultAppContainer

class AmphibiansApplication : Application(){
    lateinit var container: AppContainer
    override fun onCreate() {
        super.onCreate()
        container = DefaultAppContainer()
    }}