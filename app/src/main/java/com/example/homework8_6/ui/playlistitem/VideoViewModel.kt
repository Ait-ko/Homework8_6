package com.example.homework8_6.ui.playlistitem

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.homework8_6.data.repository.YouTubeRepository
import com.example.homework8_6.model.VideoModel
import com.example.homework8_6.utils.Resource

class VideoViewModel(private val repository: YouTubeRepository) : ViewModel() {

    fun getPlaylistVideo(getId: String, listSize:Int): LiveData<Resource<List<VideoModel.Item>>> =
        repository.getPlaylistVideo(getId, listSize)

}