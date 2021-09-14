package com.sedaaggez.chicagoartinstitutecollections.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.databinding.FragmentArtworkDetailBinding
import com.sedaaggez.chicagoartinstitutecollections.viewmodel.ArtworkDetailViewModel

class ArtworkDetailFragment : Fragment() {

    private lateinit var viewModel : ArtworkDetailViewModel
    private var artworkUuid = 0
    private lateinit var dataBinding: FragmentArtworkDetailBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        dataBinding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_artwork_detail,
            container,
            false
        )
        return dataBinding.root
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
                dataBinding.artwork = artwork
            }
        })
    }
}