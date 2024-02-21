package com.changeworld

import org.koin.core.KoinApplication
import org.koin.core.context.startKoin

object AwesomeSdk {

    private val koinApplication: KoinApplication by lazy {
        startKoin {
            modules(baseModule)
        }
    }

    fun getCredentialsManager(): CredentialsManager {
        return koinApplication.koin.get()
    }
}