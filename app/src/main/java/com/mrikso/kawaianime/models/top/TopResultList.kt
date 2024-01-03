package com.mrikso.kawaianime.models.top

data class TopResultList(
    val genres: List<String>,
    val id: String,
    val image: String,
    val title: String,
    val url: String
)