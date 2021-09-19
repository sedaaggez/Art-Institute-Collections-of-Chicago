package com.sedaaggez.chicagoartinstitutecollections.view

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.adapter.ArtworkAdapter
import com.sedaaggez.chicagoartinstitutecollections.viewmodel.ArtworksViewModel
import kotlinx.android.synthetic.main.fragment_artworks.*

class ArtworksFragment : Fragment() {

    private lateinit var viewModel: ArtworksViewModel
    private val artworkAdapter = ArtworkAdapter(arrayListOf())

    private lateinit var linearLayoutManager: LinearLayoutManager


    private var page = 1
    private var totalPages = 0L

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_artworks, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        viewModel = ViewModelProviders.of(this).get(ArtworksViewModel::class.java)
        viewModel.getData(1)

        recyclerViewArtWorks.layoutManager = GridLayoutManager(context, 2)
        recyclerViewArtWorks.adapter = artworkAdapter

        linearLayoutManager = recyclerViewArtWorks.layoutManager as LinearLayoutManager

        recyclerViewArtWorks.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrolled(recyclerView: RecyclerView, dx: Int, dy: Int) {
                if (dy > 0) {
                    var findLastCompletelyVisibleItemPosition =
                        linearLayoutManager.findLastCompletelyVisibleItemPosition()
                    var itemCount = linearLayoutManager.itemCount

                    if (page < totalPages && findLastCompletelyVisibleItemPosition == itemCount - 1) {
                        page++
                        viewModel.getData(
                            page
                        )
                        linearLayoutManager.scrollToPosition(0)
                    }
                }
                super.onScrolled(recyclerView, dx, dy)
            }
        })
        observeLiveData()
    }

    private fun observeLiveData() {

        viewModel.artworks.observe(viewLifecycleOwner, Observer { artworkList ->
            artworkList?.let {
                recyclerViewArtWorks.visibility = View.VISIBLE
                artworkAdapter.updateArtworkList(artworkList)
            }
        })

        viewModel.totalPages.observe(viewLifecycleOwner, Observer { totalPagesLiveData ->
            totalPagesLiveData.let {
                totalPages = totalPagesLiveData
            }
        })

        viewModel.artworkError.observe(viewLifecycleOwner, Observer { error ->
            error?.let {
                if (it) {
                    textViewError.visibility = View.VISIBLE
                    progressBar.visibility = View.GONE
                    recyclerViewArtWorks.visibility = View.GONE
                } else {
                    textViewError.visibility = View.GONE

                }
            }
        })

        viewModel.artworkLoading.observe(viewLifecycleOwner, Observer { loading ->
            loading?.let {
                if (it) {
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