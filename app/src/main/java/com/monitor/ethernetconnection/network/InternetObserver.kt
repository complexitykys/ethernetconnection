package com.monitor.ethernetconnection.network

import kotlinx.coroutines.flow.Flow


interface InternetObserver {
    fun observe(): Flow<Status>

    enum class Status {
        Available, Unavailable, Losing, Lost
    }
}