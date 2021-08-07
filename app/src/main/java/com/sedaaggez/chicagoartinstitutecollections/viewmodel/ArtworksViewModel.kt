package com.sedaaggez.chicagoartinstitutecollections.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork

class ArtworksViewModel : ViewModel(){

    val artworks = MutableLiveData<List<Artwork>>()
    val artworkError = MutableLiveData<Boolean>()
    val artworkLoading = MutableLiveData<Boolean>()

    fun getData() {
        // TODO: get data
    }
}