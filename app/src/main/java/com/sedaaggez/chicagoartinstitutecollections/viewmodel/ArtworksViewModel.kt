package com.sedaaggez.chicagoartinstitutecollections.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork
import com.sedaaggez.chicagoartinstitutecollections.model.ArtworkList
import com.sedaaggez.chicagoartinstitutecollections.service.ArtworkAPIService
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers

class ArtworksViewModel(application: Application) : BaseViewModel(application){

    val artworks = MutableLiveData<List<Artwork>>()
    val artworkError = MutableLiveData<Boolean>()
    val artworkLoading = MutableLiveData<Boolean>()

    private val artworkAPIService = ArtworkAPIService()
    private val disposable = CompositeDisposable()

    fun getData(page: Int) {
        artworkError.value = false
        disposable.add(
            artworkAPIService.getArtworkData(page)
                .subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribeWith(object : DisposableSingleObserver<ArtworkList>() {
                    override fun onSuccess(t: ArtworkList) {
                        showArtwork(t)
                    }

                    override fun onError(e: Throwable) {
                        artworkError.value = true
                        artworkLoading.value = false
                        e.printStackTrace()
                        println(e.message)
                    }

                })
        )
    }

    private fun showArtwork(artworkList: ArtworkList) {
        artworks.value = artworkList.data
        artworkError.value = false
        artworkLoading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}