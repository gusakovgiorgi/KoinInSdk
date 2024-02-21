package com.changeworld

class SuperSecureCredentialsStorage : CredentialsStorage {

    private val map = mutableMapOf<String, String>()
    override fun store(key: String, value: String) {
        map[key] = value
    }

    override fun get(key: String): String? {
        return map[key]
    }
}