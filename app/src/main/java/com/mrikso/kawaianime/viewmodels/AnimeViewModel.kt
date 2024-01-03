package com.mrikso.kawaianime.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mrikso.kawaianime.models.info.InfoResponse
import com.mrikso.kawaianime.models.recent.RecentResponse
import com.mrikso.kawaianime.models.search.SearchResponse
import com.mrikso.kawaianime.models.streamlink.StreamLinkResponse
import com.mrikso.kawaianime.models.top.TopResponse
import com.mrikso.kawaianime.repository.AnimeRepository
import com.mrikso.kawaianime.util.NetworkResult
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AnimeViewModel @Inject constructor(private val repository: AnimeRepository) : ViewModel() {

    val searchAnimeLiveData: LiveData<NetworkResult<SearchResponse>> get() = repository.searchAnimeLiveData
    val animeInfoLiveData: LiveData<NetworkResult<InfoResponse>> get() = repository.animeInfoLiveData
    val topAnimeLiveData: LiveData<NetworkResult<TopResponse>> get() = repository.topAnimeLiveData
    val recentEpisodesLiveData: LiveData<NetworkResult<RecentResponse>> get() = repository.recentEpisodesLiveData
    val streamLinkLiveData: LiveData<NetworkResult<StreamLinkResponse>> get() = repository.streamLinkLiveData

    fun getSearchAnime(query: String) {
        viewModelScope.launch {
            repository.getSearchAnime(query)
        }
    }

    fun getAnimeInfo(id: String) {
        viewModelScope.launch {
            repository.getAnimeInfo(id)
        }
    }

    fun getTopAnime() {
        viewModelScope.launch {
            repository.getTopAnime()
        }
    }

    fun getRecentEpisodes() {
        viewModelScope.launch {
            repository.getRecentEpisodes()
        }
    }

    fun getStreamLink(episodeId: String) {
        viewModelScope.launch {
            repository.getStreamLink(episodeId)
        }
    }
}