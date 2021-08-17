package com.sedaaggez.chicagoartinstitutecollections.model

import com.google.gson.annotations.SerializedName

data class Config(
    @SerializedName("iiif_url")
    val iiifURL: String?,
    @SerializedName("website_url")
    val websiteURL: String?
)
