package com.maurya91.mykoinapplication.base.di

import org.koin.dsl.module

val appModule = module {
    single { Controller(get()) }
    single { DataManager() }
}