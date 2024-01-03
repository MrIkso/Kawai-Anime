package com.mrikso.kawaianime.api

import com.mrikso.kawaianime.models.info.InfoResponse
import com.mrikso.kawaianime.models.recent.RecentResponse
import com.mrikso.kawaianime.models.search.SearchResponse
import com.mrikso.kawaianime.models.streamlink.StreamLinkResponse
import com.mrikso.kawaianime.models.top.TopResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface AnimeAPI {

    @GET("/anime/gogoanime/{query}")
    suspend fun getSearchAnime(
        @Path("query") query: String,
        @Query("page") page: Int = 1
    ): Response<SearchResponse>

    @GET("/anime/gogoanime/info/{id}")
    suspend fun getAnimeInfo(
        @Path("id") id: String
    ): Response<InfoResponse>

    @GET("/anime/gogoanime/top-airing")
    suspend fun getTopAnime(
        @Query("page") page: Int = 1
    ): Response<TopResponse>


    @GET("/anime/gogoanime/recent-episodes")
    suspend fun getRecentEpisodes(
        @Query("type") type: Int = 1, //1 - Japanese with SUB , 2 - English Dub without SUB
        @Query("page") page: Int = 1
    ): Response<RecentResponse>


    @GET("/anime/gogoanime/watch/{episodeId}")
    suspend fun getStreamLink(
        @Path("episodeId") episodeId: String,
        @Query("server") server: String = "gogocdn" // Available servers - "gogocdn" , "steamsb"
    ): Response<StreamLinkResponse>

    @GET("/anime/gogoanime/servers/{episodeId}")
    suspend fun getAvailableServer(
        @Path("episodeId") episodeId: String
    ): Response<SearchResponse>

}