package com.sedaaggez.chicagoartinstitutecollections.service

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.sedaaggez.chicagoartinstitutecollections.model.Artwork

@Dao
interface ArtworkDAO {
    @Insert
    suspend fun insertAll(vararg artworks: Artwork): List<Long>

    @Query("SELECT * FROM artwork")
    suspend fun getAllArtworks(): List<Artwork>

    @Query("SELECT * FROM artwork WHERE uuid = :artworkId")
    suspend fun getArtwork(artworkId: Int): Artwork

    @Query("DELETE FROM artwork")
    suspend fun deleteAllArtworks()
}