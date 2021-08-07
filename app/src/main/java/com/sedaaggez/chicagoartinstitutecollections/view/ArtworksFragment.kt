package com.sedaaggez.chicagoartinstitutecollections.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.adapter.ArtworkAdapter
import com.sedaaggez.chicagoartinstitutecollections.viewmodel.ArtworksViewModel
import kotlinx.android.synthetic.main.fragment_artworks.*

class ArtworksFragment : Fragment() {

    private lateinit var viewModel : ArtworksViewModel
    private val artworkAdapter = ArtworkAdapter(arrayListOf())

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_artworks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProviders.of(this).get(ArtworksViewModel::class.java)
        viewModel.getData()

        recyclerViewArtWorks.layoutManager = LinearLayoutManager(context)
        recyclerViewArtWorks.adapter = artworkAdapter

        observeLiveData()
    }

    private fun observeLiveData() {

        viewModel.artworks.observe(viewLifecycleOwner, Observer {artworkList ->
            artworkList?.let {
                recyclerViewArtWorks.visibility = View.VISIBLE
                artworkAdapter.updateArtworkList(artworkList)
            }
        })

        viewModel.artworkError.observe(viewLifecycleOwner, Observer {error ->
            error?.let {
                if(it) {
                    textViewError.visibility = View.VISIBLE
                    progressBar.visibility = View.GONE
                    recyclerViewArtWorks.visibility = View.GONE
                } else {
                    textViewError.visibility = View.GONE

                }
            }
        })

        viewModel.artworkLoading.observe(viewLifecycleOwner, Observer {loading ->
            loading?.let {
                if(it) {
                    progressBar.visibility = View.VISIBLE
                    textViewError.visibility = View.GONE
                    recyclerViewArtWorks.visibility = View.GONE

                } else {
                    progressBar.visibility = View.GONE

                }
            }
        })
    }

}