package com.sedaaggez.chicagoartinstitutecollections.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.sedaaggez.chicagoartinstitutecollections.R
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork
import kotlinx.android.synthetic.main.item_artwork.view.*

class ArtworkAdapter(val artworkList: ArrayList<Artwork>): RecyclerView.Adapter<ArtworkAdapter.ArtworkViewHolder>()  {

    class ArtworkViewHolder(var view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ArtworkViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_artwork, parent, false)
        return ArtworkViewHolder(view)
    }

    override fun onBindViewHolder(holder: ArtworkViewHolder, position: Int) {
        holder.view.textViewTitle.text = artworkList[position].title
        holder.view.textViewArtist.text = artworkList[position].artistTitle
        holder.view.textViewStyle.text = artworkList[position].styleTitle
        holder.view.textViewYear.text = artworkList[position].fiscalYear.toString()
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