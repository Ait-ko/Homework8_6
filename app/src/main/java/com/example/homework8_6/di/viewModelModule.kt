package com.example.homework8_6.di

import com.example.homework8_6.ui.playlist.PlaylistsViewModel
import com.example.homework8_6.ui.playlistitem.VideoViewModel

import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel {
        PlaylistsViewModel(get())
    }

    viewModel {
        VideoViewModel(get())
    }
}