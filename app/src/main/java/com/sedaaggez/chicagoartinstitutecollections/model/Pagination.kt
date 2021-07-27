package com.sedaaggez.chicagoartinstitutecollections.model

data class Pagination(
    val limit: Long?,
    val offset: Long?,
    val totalPages: Long?,
    val currentPage: Long?,
    val prevURL: String?,
    val nextURL: String?
)
