package com.changeworld

import org.koin.dsl.koinApplication

internal object IsolatedKoinContext {
    val koinApp = koinApplication {
        // declare used modules
        modules(baseModule)
    }

    val koin = koinApp.koin
}