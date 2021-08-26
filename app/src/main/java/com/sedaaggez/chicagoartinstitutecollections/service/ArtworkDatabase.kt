package com.sedaaggez.chicagoartinstitutecollections.service

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = arrayOf(com.sedaaggez.chicagoartinstitutecollections.model.Artwork::class), version = 1)
abstract class ArtworkDatabase : RoomDatabase() {

    abstract fun artworkDAO() : ArtworkDAO

    companion object {
        @Volatile private var instance : ArtworkDatabase? = null

        private val lock = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(lock) {
            instance ?: makeDatabase(context).also {
                instance = it
            }
        }

        private fun makeDatabase(context: Context) = Room.databaseBuilder(
            context.applicationContext, ArtworkDatabase::class.java, "artworkdatabase"
        ).build()
    }
}