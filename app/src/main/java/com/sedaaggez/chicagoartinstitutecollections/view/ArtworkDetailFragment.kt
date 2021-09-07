package com.sedaaggez.chicagoartinstitutecollections.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.util.downloadFromUrl
import com.sedaaggez.chicagoartinstitutecollections.util.placeholderProgressBar
import com.sedaaggez.chicagoartinstitutecollections.viewmodel.ArtworkDetailViewModel
import kotlinx.android.synthetic.main.fragment_artwork_detail.*

class ArtworkDetailFragment : Fragment() {

    private lateinit var viewModel : ArtworkDetailViewModel
    private var artworkUuid = 0

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.fragment_artwork_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = ViewModelProvider(this).get(ArtworkDetailViewModel::class.java)

        arguments?.let {
            artworkUuid = ArtworkDetailFragmentArgs.fromBundle(it).artworkUuid
        }

        viewModel.getDataFromRoom(artworkUuid)

        observeLiveData()
    }


    private fun observeLiveData() {
        viewModel.artworkLiveData.observe(viewLifecycleOwner, Observer { artwork ->
            artwork?.let {
                textViewTitleName.text = artwork.title
                textViewArtistName.text = artwork.artistTitle
                textViewStyleName.text = artwork.styleTitle

                imageViewDetail.downloadFromUrl(
                    "https://www.artic.edu/iiif/2/" + artwork.imageID + "/full/843,/0/default.jpg",
                    placeholderProgressBar(requireContext())
                )
            }
        })
    }
}