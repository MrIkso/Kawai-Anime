package com.mrikso.kawaianime.models.search

data class SearchResponse(
    val currentPage: Int,
    val hasNextPage: Boolean,
    val results: List<SearchResultList>
)