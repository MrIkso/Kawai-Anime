package com.mrikso.kawaianime.models.streamlink

data class Source(
    val isM3U8: Boolean,
    val quality: String,
    val url: String
)