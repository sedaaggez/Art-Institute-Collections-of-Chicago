package com.sedaaggez.chicagoartinstitutecollections.model

import com.google.gson.annotations.SerializedName

data class Info(
    @SerializedName("license_text")
    val licenseText: String?,
    @SerializedName("license_links")
    val licenseLinks: List<String>?,
    val version: String?
)
