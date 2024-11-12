package com.example.a2hw.domain.di

import com.example.a2hw.domain.usecase.GetAllTasksUseCase
import com.example.a2hw.domain.usecase.InsertTaskUseCase
import org.koin.core.module.Module
import org.koin.dsl.module

val domainModule: Module = module {

    factory { InsertTaskUseCase(get()) }
    factory { GetAllTasksUseCase(get()) }
}