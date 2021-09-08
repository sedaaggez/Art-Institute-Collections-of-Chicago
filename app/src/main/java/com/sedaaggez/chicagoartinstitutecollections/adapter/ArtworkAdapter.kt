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
import com.sedaaggez.chicagoartinstitutecollections.view.ArtworksFragmentDirections
import kotlinx.android.synthetic.main.item_artwork.view.*

class ArtworkAdapter(val artworkList: ArrayList<Artwork>) :
    RecyclerView.Adapter<ArtworkAdapter.ArtworkViewHolder>(), ArtworkClickListener {

    class ArtworkViewHolder(var view: ItemArtworkBinding) : RecyclerView.ViewHolder(view.root) {
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtworkViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = DataBindingUtil.inflate<ItemArtworkBinding>(inflater, R.layout.item_artwork, parent, false)
        return ArtworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtworkViewHolder, position: Int) {
        holder.view.artwork = artworkList[position]
        holder.view.listener = this
    }

    override fun getItemCount(): Int {
        return artworkList.size
    }

    fun updateArtworkList(newArtworkList: List<Artwork>) {
        artworkList.clear()
        artworkList.addAll(newArtworkList)
        notifyDataSetChanged()
    }

    override fun onArtworkClicked(v: View) {
        val uuid = v.artworkUuidText.text.toString().toInt()
        val action = ArtworksFragmentDirections.actionArtworksFragmentToArtworkDetailFragment(uuid)
        Navigation.findNavController(v).navigate(action)
    }
}