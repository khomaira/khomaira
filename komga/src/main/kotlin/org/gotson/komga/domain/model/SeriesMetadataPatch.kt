package org.gotson.komga.domain.model

data class SeriesMetadataPatch(
  val title: String?,
  val titleSort: String?,
  val status: SeriesMetadata.Status?,
  val summary: String?,
  val readingDirection: SeriesMetadata.ReadingDirection?,
  val publisher: String?,
  val ageRating: Int?,
  val language: String?,
  val genres: Set<String>?,

  val collections: List<String>
)
