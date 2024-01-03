package com.mrikso.kawaianime.models.top

data class TopResponse(
    val currentPage: Int,
    val hasNextPage: Boolean,
    val results: List<TopResultList>
)