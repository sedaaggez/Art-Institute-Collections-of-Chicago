package com.sedaaggez.chicagoartinstitutecollections.viewmodel

import android.app.Application
import androidx.lifecycle.MutableLiveData
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork
import com.sedaaggez.chicagoartinstitutecollections.model.ArtworkList
import com.sedaaggez.chicagoartinstitutecollections.service.ArtworkAPIService
import com.sedaaggez.chicagoartinstitutecollections.service.ArtworkDatabase
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.observers.DisposableSingleObserver
import io.reactivex.schedulers.Schedulers
import kotlinx.coroutines.launch

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
                        storeInSQLite(t.data!!)
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

    private fun storeInSQLite(list: List<Artwork>) {
        launch {
            val dao = ArtworkDatabase(getApplication()).artworkDAO()
            dao.deleteAllArtworks()
            val listLong = dao.insertAll(*list.toTypedArray())
            var i = 0
            while (i < list.size) {
                list[i].uuid = listLong[i].toInt()
                i += 1
            }
            showArtwork(list)
        }
    }

    private fun showArtwork(list: List<Artwork>) {
        artworks.value = list
        artworkError.value = false
        artworkLoading.value = false
    }

    override fun onCleared() {
        super.onCleared()
        disposable.clear()
    }
}