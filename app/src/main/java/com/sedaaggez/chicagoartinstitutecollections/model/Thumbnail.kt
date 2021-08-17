package com.sedaaggez.chicagoartinstitutecollections.model

import com.google.gson.annotations.SerializedName

data class Thumbnail(
    val lqip: String?,
    val width: Long?,
    val height: Long?,
    @SerializedName("alt_text")
    val altText: String?
)