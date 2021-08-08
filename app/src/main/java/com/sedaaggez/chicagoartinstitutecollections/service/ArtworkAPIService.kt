package com.sedaaggez.chicagoartinstitutecollections.service

import com.sedaaggez.chicagoartinstitutecollections.model.ArtworkList
import io.reactivex.Single
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

class ArtworkAPIService {

    private val BASE_URL = "https://api.artic.edu/api/"
    private val api = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
        .build()
        .create(ArtworkAPI::class.java)

    fun getArtworkData(page: Int) : Single<ArtworkList> {
        return api.getArtworkList(page)
    }

}