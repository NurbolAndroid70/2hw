package com.example.a2hw.data.database.di

import androidx.room.Room
import com.example.a2hw.data.database.AppDatabase
import com.example.a2hw.data.repositoryImpl.TaskManagerRepositoryImpl
import com.example.a2hw.domain.repository.TaskManagerRepository
import org.koin.core.module.Module
import org.koin.dsl.module

val dataModules: Module = module {

    single {
        Room.databaseBuilder(get(), AppDatabase::class.java, "TaskDataBase")
            .fallbackToDestructiveMigration()
            .build()
    }

    single { get<AppDatabase>().taskManagerDao() }


    single<TaskManagerRepository> { TaskManagerRepositoryImpl(get()) }
}