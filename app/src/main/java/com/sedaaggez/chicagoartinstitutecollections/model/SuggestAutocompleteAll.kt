package com.sedaaggez.chicagoartinstitutecollections.model

data class SuggestAutocompleteAll(
    val input: List<String>?,
    val contexts: Contexts?,
    val weight: Long?
)
