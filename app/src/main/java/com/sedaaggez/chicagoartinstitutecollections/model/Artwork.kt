package com.sedaaggez.chicagoartinstitutecollections.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Artwork(
    @ColumnInfo(name = "id")
    val id: Long?,
    @ColumnInfo(name = "api_model")
    @SerializedName("api_model")
    val apiModel: String?,
    @ColumnInfo(name = "api_link")
    @SerializedName("api_link")
    val apiLink: String?,
    @ColumnInfo(name = "is_boosted")
    @SerializedName("is_boosted")
    val isBoosted: Boolean?,
    @ColumnInfo(name = "title")
    val title: String?,
    @ColumnInfo(name = "alt_titles")
    @SerializedName("alt_titles")
    val altTitles: String?,
    @ColumnInfo(name = "thumbnail")
    val thumbnail: Thumbnail?,
    @ColumnInfo(name = "main_reference_number")
    @SerializedName("main_reference_number")
    val mainReferenceNumber: String?,
    @ColumnInfo(name = "has_not_been_viewed_much")
    @SerializedName("has_not_been_viewed_much")
    val hasNotBeenViewedMuch: Boolean?,
    @ColumnInfo(name = "boost_rank")
    @SerializedName("boost_rank")
    val boostRank: String?,
    @ColumnInfo(name = "date_start")
    @SerializedName("date_start")
    val dateStart: Long?,
    @ColumnInfo(name = "date_end")
    @SerializedName("date_end")
    val dateEnd: Long?,
    @ColumnInfo(name = "date_display")
    @SerializedName("date_display")
    val dateDisplay: String?,
    @ColumnInfo(name = "date_qualifier_title")
    @SerializedName("date_qualifier_title")
    val dateQualifierTitle: String?,
    @ColumnInfo(name = "date_qualifier_id")
    @SerializedName("date_qualifier_id")
    val dateQualifierID: Long?,
    @ColumnInfo(name = "artist_display")
    @SerializedName("artist_display")
    val artistDisplay: String?,
    @ColumnInfo(name = "place_of_origin")
    @SerializedName("place_of_origin")
    val placeOfOrigin: String?,
    @ColumnInfo(name = "dimensions")
    val dimensions: String?,
    @ColumnInfo(name = "medium_display")
    @SerializedName("medium_display")
    val mediumDisplay: String?,
    @ColumnInfo(name = "inscriptions")
    val inscriptions: String?,
    @ColumnInfo(name = "credit_line")
    @SerializedName("credit_line")
    val creditLine: String?,
    @ColumnInfo(name = "publication_history")
    @SerializedName("publication_history")
    val publicationHistory: String?,
    @ColumnInfo(name = "exhibition_history")
    @SerializedName("exhibition_history")
    val exhibitionHistory: String?,
    @ColumnInfo(name = "provenance_text")
    @SerializedName("provenance_text")
    val provenanceText: String?,
    @ColumnInfo(name = "publishing_verification_level")
    @SerializedName("publishing_verification_level")
    val publishingVerificationLevel: String?,
    @ColumnInfo(name = "internal_department_id")
    @SerializedName("internal_department_id")
    val internalDepartmentID: Long?,
    @ColumnInfo(name = "fiscal_year")
    @SerializedName("fiscal_year")
    val fiscalYear: Long?,
    @ColumnInfo(name = "fiscal_year_deaccession")
    @SerializedName("fiscal_year_deaccession")
    val fiscalYearDeaccession: String?,
    @ColumnInfo(name = "is_public_domain")
    @SerializedName("is_public_domain")
    val isPublicDomain: Boolean?,
    @ColumnInfo(name = "is_zoomable")
    @SerializedName("is_zoomable")
    val isZoomable: Boolean?,
    @ColumnInfo(name = "max_zoom_window_size")
    @SerializedName("max_zoom_window_size")
    val maxZoomWindowSize: Long?,
    @ColumnInfo(name = "copyright_notice")
    @SerializedName("copyright_notice")
    val copyrightNotice: String?,
    @ColumnInfo(name = "has_multimedia_resources")
    @SerializedName("has_multimedia_resources")
    val hasMultimediaResources: Boolean?,
    @ColumnInfo(name = "has_educational_resources")
    @SerializedName("has_educational_resources")
    val hasEducationalResources: Boolean?,
    @ColumnInfo(name = "colorfulness")
    val colorfulness: Double?,
    @ColumnInfo(name = "color")
    val color: Color?,
    @ColumnInfo(name = "latitude")
    val latitude: Double?,
    @ColumnInfo(name = "longitude")
    val longitude: Double?,
    @ColumnInfo(name = "latlon")
    val latlon: String?,
    @ColumnInfo(name = "is_on_view")
    @SerializedName("is_on_view")
    val isOnView: Boolean?,
    @ColumnInfo(name = "on_loan_display")
    @SerializedName("on_loan_display")
    val onLoanDisplay: String?,
    @ColumnInfo(name = "gallery_title")
    @SerializedName("gallery_title")
    val galleryTitle: String?,
    @ColumnInfo(name = "gallery_id")
    @SerializedName("gallery_id")
    val galleryID: String?,
    @ColumnInfo(name = "artwork_type_title")
    @SerializedName("artwork_type_title")
    val artworkTypeTitle: String?,
    @ColumnInfo(name = "artwork_type_id")
    @SerializedName("artwork_type_id")
    val artworkTypeID: String?,
    @ColumnInfo(name = "department_title")
    @SerializedName("department_title")
    val departmentTitle: String?,
    @ColumnInfo(name = "department_id")
    @SerializedName("department_id")
    val departmentID: String?,
    @ColumnInfo(name = "artist_id")
    @SerializedName("artist_id")
    val artistID: Long?,
    @ColumnInfo(name = "artist_title")
    @SerializedName("artist_title")
    val artistTitle: String?,
    @ColumnInfo(name = "alt_artist_ids")
    @SerializedName("alt_artist_ids")
    val altArtistIDS: List<String>?,
    @ColumnInfo(name = "artist_ids")
    @SerializedName("artist_ids")
    val artistIDS: List<Int>?,
    @ColumnInfo(name = "artist_titles")
    @SerializedName("artist_titles")
    val artistTitles: List<String>?,
    @ColumnInfo(name = "category_ids")
    @SerializedName("category_ids")
    val categoryIDS: List<String>?,
    @ColumnInfo(name = "category_titles")
    @SerializedName("category_titles")
    val categoryTitles: List<String>?,
    @ColumnInfo(name = "artwork_catalogue_ids")
    @SerializedName("artwork_catalogue_ids")
    val artworkCatalogueIDS: List<String>?,
    @ColumnInfo(name = "term_titles")
    @SerializedName("term_titles")
    val termTitles: List<String>?,
    @ColumnInfo(name = "style_id")
    @SerializedName("style_id")
    val styleID: String?,
    @ColumnInfo(name = "style_title")
    @SerializedName("style_title")
    val styleTitle: String?,
    @ColumnInfo(name = "alt_style_ids")
    @SerializedName("alt_style_ids")
    val altStyleIDS: List<String>?,
    @ColumnInfo(name = "style_ids")
    @SerializedName("style_ids")
    val styleIDS: List<String>?,
    @ColumnInfo(name = "style_titles")
    @SerializedName("style_titles")
    val styleTitles: List<String>?,
    @ColumnInfo(name = "classification_id")
    @SerializedName("classification_id")
    val classificationID: String?,
    @ColumnInfo(name = "classification_title")
    @SerializedName("classification_title")
    val classificationTitle: String?,
    @ColumnInfo(name = "alt_classification_ids")
    @SerializedName("alt_classification_ids")
    val altClassificationIDS: List<String>?,
    @ColumnInfo(name = "classification_ids")
    @SerializedName("classification_ids")
    val classificationIDS: List<String>?,
    @ColumnInfo(name = "classification_titles")
    @SerializedName("classification_titles")
    val classificationTitles: List<String>?,
    @ColumnInfo(name = "subject_id")
    @SerializedName("subject_id")
    val subjectID: String?,
    @ColumnInfo(name = "alt_subject_ids")
    @SerializedName("alt_subject_ids")
    val altSubjectIDS: List<String>?,
    @ColumnInfo(name = "subject_ids")
    @SerializedName("subject_ids")
    val subjectIDS: List<String>?,
    @ColumnInfo(name = "subject_titles")
    @SerializedName("subject_titles")
    val subjectTitles: List<String>?,
    @ColumnInfo(name = "material_id")
    @SerializedName("material_id")
    val materialID: String?,
    @ColumnInfo(name = "alt_material_ids")
    @SerializedName("alt_material_ids")
    val altMaterialIDS: List<String>?,
    @ColumnInfo(name = "material_ids")
    @SerializedName("material_ids")
    val materialIDS: List<String>?,
    @ColumnInfo(name = "material_titles")
    @SerializedName("material_titles")
    val materialTitles: List<String>?,
    @ColumnInfo(name = "technique_id")
    @SerializedName("technique_id")
    val techniqueID: String?,
    @ColumnInfo(name = "alt_technique_ids")
    @SerializedName("alt_technique_ids")
    val altTechniqueIDS: List<String>?,
    @ColumnInfo(name = "technique_ids")
    @SerializedName("technique_ids")
    val techniqueIDS: List<String>?,
    @ColumnInfo(name = "technique_titles")
    @SerializedName("technique_titles")
    val techniqueTitles: List<String>?,
    @ColumnInfo(name = "theme_titles")
    @SerializedName("theme_titles")
    val themeTitles: List<String>?,
    @ColumnInfo(name = "image_id")
    @SerializedName("image_id")
    val imageID: String?,
    @ColumnInfo(name = "alt_image_ids")
    @SerializedName("alt_image_ids")
    val altImageIDS: List<String>?,
    @ColumnInfo(name = "document_ids")
    @SerializedName("document_ids")
    val documentIDS: List<String>?,
    @ColumnInfo(name = "sound_ids")
    @SerializedName("sound_ids")
    val soundIDS: List<String>?,
    @ColumnInfo(name = "video_ids")
    @SerializedName("video_ids")
    val videoIDS: List<String>?,
    @ColumnInfo(name = "text_ids")
    @SerializedName("text_ids")
    val textIDS: List<String>?,
    @ColumnInfo(name = "section_ids")
    @SerializedName("section_ids")
    val sectionIDS: List<String>?,
    @ColumnInfo(name = "section_titles")
    @SerializedName("section_titles")
    val sectionTitles: List<String>?,
    @ColumnInfo(name = "site_ids")
    @SerializedName("site_ids")
    val siteIDS: List<String>?,
    @ColumnInfo(name = "suggest_autocomplete_all")
    @SerializedName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocompleteAll>?,
    @ColumnInfo(name = "last_updated_source")
    @SerializedName("last_updated_source")
    val lastUpdatedSource: String?,
    @ColumnInfo(name = "last_updated")
    @SerializedName("last_updated")
    val lastUpdated: String?,
    @ColumnInfo(name = "timestamp")
    val timestamp: String?
) {
    @PrimaryKey(autoGenerate = true)
    var uuid: Int = 0

    val imageUrl: String
        get() = String.format("https://www.artic.edu/iiif/2/$imageID/full/843,/0/default.jpg")

}