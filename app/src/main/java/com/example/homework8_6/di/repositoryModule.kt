package com.example.homework8_6.di

import com.example.homework8_6.data.repository.YouTubeRepository
import org.koin.dsl.module

val repositoryModule = module {

    single {
        YouTubeRepository(get())
    }
}