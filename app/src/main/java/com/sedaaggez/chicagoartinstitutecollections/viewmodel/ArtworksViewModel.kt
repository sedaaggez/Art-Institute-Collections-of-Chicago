package com.sedaaggez.chicagoartinstitutecollections.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork

class ArtworksViewModel(application: Application) : BaseViewModel(application){

    val artworks = MutableLiveData<List<Artwork>>()
    val artworkError = MutableLiveData<Boolean>()
    val artworkLoading = MutableLiveData<Boolean>()

    fun getData() {
        // TODO: get data
    }
}