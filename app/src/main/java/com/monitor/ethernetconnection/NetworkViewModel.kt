package com.monitor.ethernetconnection

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.monitor.ethernetconnection.network.InternetObserver
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn

class NetworkViewModel(private val internetObserver: InternetObserver) : ViewModel() {
    val networkStatus: StateFlow<InternetObserver.Status> = internetObserver.observe()
        .stateIn(viewModelScope, SharingStarted.Lazily, InternetObserver.Status.Unavailable)
}