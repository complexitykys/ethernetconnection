package com.monitor.ethernetconnection.di

import com.monitor.ethernetconnection.NetworkViewModel
import com.monitor.ethernetconnection.network.InternetObserver
import com.monitor.ethernetconnection.network.InternetObserverImpl
import org.koin.android.ext.koin.androidContext
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    single<InternetObserver>{ InternetObserverImpl(androidContext())}
    viewModel { NetworkViewModel(get()) }
}