package com.sedaaggez.chicagoartinstitutecollections.util

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.sedaaggez.chicagoartinstitutecollections.model.Color
import com.sedaaggez.chicagoartinstitutecollections.model.SuggestAutocompleteAll
import com.sedaaggez.chicagoartinstitutecollections.model.Thumbnail
import java.lang.reflect.Type
import java.util.*
import kotlin.collections.ArrayList


class Converters {

    var gson = Gson()

    @TypeConverter
    fun fromListToInteger(intList: List<Int>?): String {
        if (intList == null) return ""
        return intList.joinToString(",")
    }

    @TypeConverter
    fun fromListToString(stringList: List<String>?): String {
        if (stringList == null) return ""
        return stringList.joinToString(",")
    }

    @TypeConverter
    fun fromStringToIntegerList(list: String?): List<Int> {
        if (list == null) return ArrayList()
        return list.split(",").map { it.toInt() }
    }

    @TypeConverter
    fun fromStringToStringList(list: String?): List<String> {
        if (list == null) return ArrayList()
        return list.split(",").map { it }
    }

    @TypeConverter
    fun stringToSuggestAutocompleteAllList(data: String?): List<SuggestAutocompleteAll?>? {
        if (data == null) {
            return Collections.emptyList()
        }
        val listType: Type = object : TypeToken<List<SuggestAutocompleteAll?>?>() {}.type
        return gson.fromJson<List<SuggestAutocompleteAll?>>(data, listType)
    }

    @TypeConverter
    fun SuggestAutocompleteAllListToString(someObjects: List<SuggestAutocompleteAll?>?): String? {
        return gson.toJson(someObjects)
    }

    @TypeConverter
    fun stringToThumbnail(data: String?): Thumbnail? {
        return gson.fromJson(data, Thumbnail::class.java)
    }

    @TypeConverter
    fun ThumbnailToString(thumbnail: Thumbnail?): String? {
        return gson.toJson(thumbnail)
    }

    @TypeConverter
    fun stringToColor(data: String?): Color? {
        return gson.fromJson(data, Color::class.java)
    }

    @TypeConverter
    fun ColorToString(color: Color?): String? {
        return gson.toJson(color)
    }
}