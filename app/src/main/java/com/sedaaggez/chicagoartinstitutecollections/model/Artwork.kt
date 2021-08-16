package com.sedaaggez.chicagoartinstitutecollections.model

import com.google.gson.annotations.SerializedName

data class Artwork(
    val id: Long,
    @SerializedName("api_model")
    val apiModel: String,
    @SerializedName("api_link")
    val apiLink: String,
    @SerializedName("is_boosted")
    val isBoosted: Boolean,
    val title: String,
    @SerializedName("alt_titles")
    val altTitles: Any? = null,
    val thumbnail: Thumbnail,
    @SerializedName("main_reference_number")
    val mainReferenceNumber: String,
    @SerializedName("has_not_been_viewed_much")
    val hasNotBeenViewedMuch: Boolean,
    @SerializedName("boost_rank")
    val boostRank: Any? = null,
    @SerializedName("date_start")
    val dateStart: Long,
    @SerializedName("date_end")
    val dateEnd: Long,
    @SerializedName("date_display")
    val dateDisplay: String,
    @SerializedName("date_qualifier_title")
    val dateQualifierTitle: String,
    @SerializedName("date_qualifier_id")
    val dateQualifierID: Long? = null,
    @SerializedName("artist_display")
    val artistDisplay: String,
    @SerializedName("place_of_origin")
    val placeOfOrigin: String,
    val dimensions: String,
    @SerializedName("medium_display")
    val mediumDisplay: String,
    val inscriptions: String? = null,
    @SerializedName("credit_line")
    val creditLine: String,
    @SerializedName("publication_history")
    val publicationHistory: String? = null,
    @SerializedName("exhibition_history")
    val exhibitionHistory: String? = null,
    @SerializedName("provenance_text")
    val provenanceText: String? = null,
    @SerializedName("publishing_verification_level")
    val publishingVerificationLevel: String,
    @SerializedName("internal_department_id")
    val internalDepartmentID: Long,
    @SerializedName("fiscal_year")
    val fiscalYear: Long? = null,
    @SerializedName("fiscal_year_deaccession")
    val fiscalYearDeaccession: Any? = null,
    @SerializedName("is_public_domain")
    val isPublicDomain: Boolean,
    @SerializedName("is_zoomable")
    val isZoomable: Boolean,
    @SerializedName("max_zoom_window_size")
    val maxZoomWindowSize: Long,
    @SerializedName("copyright_notice")
    val copyrightNotice: Any? = null,
    @SerializedName("has_multimedia_resources")
    val hasMultimediaResources: Boolean,
    @SerializedName("has_educational_resources")
    val hasEducationalResources: Boolean,
    val colorfulness: Double,
    val color: Color,
    val latitude: Double? = null,
    val longitude: Double? = null,
    val latlon: String? = null,
    @SerializedName("is_on_view")
    val isOnView: Boolean,
    @SerializedName("on_loan_display")
    val onLoanDisplay: String,
    @SerializedName("gallery_title")
    val galleryTitle: Any? = null,
    @SerializedName("gallery_id")
    val galleryID: Any? = null,
    @SerializedName("artwork_type_title")
    val artworkTypeTitle: Any? = null,
    @SerializedName("artwork_type_id")
    val artworkTypeID: Any? = null,
    @SerializedName("department_title")
    val departmentTitle: String,
    @SerializedName("department_id")
    val departmentID: String,
    @SerializedName("artist_id")
    val artistID: Long,
    @SerializedName("artist_title")
    val artistTitle: String,
    @SerializedName("alt_artist_ids")
    val altArtistIDS: List<Any?>,
    @SerializedName("artist_ids")
    val artistIDS: List<Long>,
    @SerializedName("artist_titles")
    val artistTitles: List<String>,
    @SerializedName("category_ids")
    val categoryIDS: List<String>,
    @SerializedName("category_titles")
    val categoryTitles: List<String>,
    @SerializedName("artwork_catalogue_ids")
    val artworkCatalogueIDS: List<Any?>,
    @SerializedName("term_titles")
    val termTitles: List<String>,
    @SerializedName("style_id")
    val styleID: String? = null,
    @SerializedName("style_title")
    val styleTitle: String? = null,
    @SerializedName("alt_style_ids")
    val altStyleIDS: List<String>,
    @SerializedName("style_ids")
    val styleIDS: List<String>,
    @SerializedName("style_titles")
    val styleTitles: List<String>,
    @SerializedName("classification_id")
    val classificationID: String,
    @SerializedName("classification_title")
    val classificationTitle: String,
    @SerializedName("alt_classification_ids")
    val altClassificationIDS: List<String>,
    @SerializedName("classification_ids")
    val classificationIDS: List<String>,
    @SerializedName("classification_titles")
    val classificationTitles: List<String>,
    @SerializedName("subject_id")
    val subjectID: String? = null,
    @SerializedName("alt_subject_ids")
    val altSubjectIDS: List<String>,
    @SerializedName("subject_ids")
    val subjectIDS: List<String>,
    @SerializedName("subject_titles")
    val subjectTitles: List<String>,
    @SerializedName("material_id")
    val materialID: String? = null,
    @SerializedName("alt_material_ids")
    val altMaterialIDS: List<String>,
    @SerializedName("material_ids")
    val materialIDS: List<String>,
    @SerializedName("material_titles")
    val materialTitles: List<String>,
    @SerializedName("technique_id")
    val techniqueID: String? = null,
    @SerializedName("alt_technique_ids")
    val altTechniqueIDS: List<Any?>,
    @SerializedName("technique_ids")
    val techniqueIDS: List<String>,
    @SerializedName("technique_titles")
    val techniqueTitles: List<String>,
    @SerializedName("theme_titles")
    val themeTitles: List<Any?>,
    @SerializedName("image_id")
    val imageID: String,
    @SerializedName("alt_image_ids")
    val altImageIDS: List<String>,
    @SerializedName("document_ids")
    val documentIDS: List<String>,
    @SerializedName("sound_ids")
    val soundIDS: List<String>,
    @SerializedName("video_ids")
    val videoIDS: List<Any?>,
    @SerializedName("text_ids")
    val textIDS: List<Any?>,
    @SerializedName("section_ids")
    val sectionIDS: List<Any?>,
    @SerializedName("section_titles")
    val sectionTitles: List<Any?>,
    @SerializedName("site_ids")
    val siteIDS: List<Any?>,
    @SerializedName("suggest_autocomplete_all")
    val suggestAutocompleteAll: List<SuggestAutocompleteAll>,
    @SerializedName("last_updated_source")
    val lastUpdatedSource: String,
    @SerializedName("last_updated")
    val lastUpdated: String,
    val timestamp: String
)