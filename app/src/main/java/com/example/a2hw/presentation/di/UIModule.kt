package com.example.a2hw.presentation.di


import com.example.a2hw.presentation.actyvity.MainActivityViewModel
import org.koin.core.module.Module
import org.koin.dsl.module

val uiModule: Module = module {

    factory { MainActivityViewModel(get(), get()) }
}