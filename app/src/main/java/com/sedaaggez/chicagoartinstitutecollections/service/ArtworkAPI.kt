package com.sedaaggez.chicagoartinstitutecollections.service

import com.sedaaggez.chicagoartinstitutecollections.model.ArtworkList
import io.reactivex.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface ArtworkAPI {

    @GET("v1/artworks")
    fun getArtworkList(@Query("page") page: Int): Single<ArtworkList>

}