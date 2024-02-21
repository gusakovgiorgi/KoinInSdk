package com.changeworld

import org.koin.dsl.module

object AwesomeSdk {

    private var initialized = false
    fun init(awesomeSdkLogger: AwesomeSdkLogger) {
        val dynamicModule = module {
            single {
                awesomeSdkLogger
            }
        }
        IsolatedKoinContext.koinApp.koin.loadModules(listOf(dynamicModule))
        initialized = true
    }

    fun getCredentialsManager(): CredentialsManager {
        if (!initialized) {
            throw IllegalStateException("AwesomeSdk is not initialized. Please call AwesomeSdk.init() first.")
        }
        return IsolatedKoinContext.koin.get()
    }
}