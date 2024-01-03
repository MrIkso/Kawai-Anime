package com.mrikso.kawaianime.models.recent

data class RecentResultList(
    val episodeId: String,
    val episodeNumber: Int,
    val id: String,
    val image: String,
    val title: String,
    val url: String
)