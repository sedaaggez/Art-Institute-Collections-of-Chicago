package com.sedaaggez.chicagoartinstitutecollections.model

data class ArtworkList(
    val pagination: Pagination?,
    val data: List<Artwork>?,
    val info: Info?,
    val config: Config?
)
