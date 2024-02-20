package com.example.homework8_6.ui.playlist

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.homework8_6.data.repository.YouTubeRepository
import com.example.homework8_6.model.BaseResponse
import com.example.homework8_6.utils.Resource


class PlaylistsViewModel(private val repository: YouTubeRepository): ViewModel() {

    fun getPlaylists(): LiveData<Resource<List<BaseResponse.Item>>> = repository.getPlaylists()

}