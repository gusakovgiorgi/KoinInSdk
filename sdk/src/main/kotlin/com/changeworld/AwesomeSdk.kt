package com.changeworld

import org.koin.dsl.module

object AwesomeSdk {

    fun init(awesomeSdkLogger: AwesomeSdkLogger) {
        val dynamicModule = module {
            single {
                awesomeSdkLogger
            }
        }
        IsolatedKoinContext.koinApp.koin.loadModules(listOf(dynamicModule))
    }

    fun getCredentialsManager(): CredentialsManager {
        return IsolatedKoinContext.koin.get()
    }
}