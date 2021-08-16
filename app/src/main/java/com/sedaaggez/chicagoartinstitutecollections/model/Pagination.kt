package com.sedaaggez.chicagoartinstitutecollections.model

import com.google.gson.annotations.SerializedName

data class Pagination(
    val limit: Long?,
    val offset: Long?,
    @SerializedName("total_pages")
    val totalPages: Long?,
    @SerializedName("current_page")
    val currentPage: Long?,
    @SerializedName("prev_url")
    val prevURL: String?,
    @SerializedName("next_url")
    val nextURL: String?
)
