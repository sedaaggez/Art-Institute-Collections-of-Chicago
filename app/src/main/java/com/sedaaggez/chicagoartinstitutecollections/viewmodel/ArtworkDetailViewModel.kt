package com.sedaaggez.chicagoartinstitutecollections.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork
import com.sedaaggez.chicagoartinstitutecollections.service.ArtworkDatabase
import kotlinx.coroutines.launch

class ArtworkDetailViewModel (application: Application) : BaseViewModel(application) {

    val artworkLiveData = MutableLiveData<Artwork>()

    fun getDataFromRoom(uuid: Int) {
        launch {
            val dao = ArtworkDatabase(getApplication()).artworkDAO()
            val artwork = dao.getArtwork(uuid)
            artworkLiveData.value = artwork
        }
    }

}