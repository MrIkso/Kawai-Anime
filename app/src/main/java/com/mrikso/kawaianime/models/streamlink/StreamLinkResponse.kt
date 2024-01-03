package com.mrikso.kawaianime.models.streamlink

data class StreamLinkResponse(
    val headers: Headers,
    val sources: List<Source>
)