package com.mrikso.kawaianime.models.recent

data class RecentResponse(
    val currentPage: Int,
    val hasNextPage: Boolean,
    val results: List<RecentResultList>
)