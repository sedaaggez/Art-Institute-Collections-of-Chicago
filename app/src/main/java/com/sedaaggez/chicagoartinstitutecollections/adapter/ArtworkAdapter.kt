package com.sedaaggez.chicagoartinstitutecollections.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.databinding.ItemArtworkBinding
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork
import com.sedaaggez.chicagoartinstitutecollections.util.downloadFromUrl
import com.sedaaggez.chicagoartinstitutecollections.util.placeholderProgressBar
import com.sedaaggez.chicagoartinstitutecollections.view.ArtworksFragmentDirections
import kotlinx.android.synthetic.main.item_artwork.view.*

class ArtworkAdapter(val artworkList: ArrayList<Artwork>) :
    RecyclerView.Adapter<ArtworkAdapter.ArtworkViewHolder>() {

    class ArtworkViewHolder(var view: ItemArtworkBinding) : RecyclerView.ViewHolder(view.root) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtworkViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemArtworkBinding>(inflater, R.layout.item_artwork, parent, false)
        return ArtworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtworkViewHolder, position: Int) {
        holder.view.artwork = artworkList[position]

//        holder.view.setOnClickListener {
//            val action =
//                ArtworksFragmentDirections.actionArtworksFragmentToArtworkDetailFragment(
//                    artworkList[position].uuid
//                )
//            Navigation.findNavController(it).navigate(action)
//        }
    }

    override fun getItemCount(): Int {
        return artworkList.size
    }

    fun updateArtworkList(newArtworkList: List<Artwork>) {
        artworkList.clear()
        artworkList.addAll(newArtworkList)
        notifyDataSetChanged()
    }
}