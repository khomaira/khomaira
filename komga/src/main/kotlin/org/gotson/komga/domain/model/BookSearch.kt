package org.gotson.komga.domain.model

open class BookSearch(
  val libraryIds: Collection<String>? = null,
  val seriesIds: Collection<String>? = null,
  val searchTerm: String? = null,
  val mediaStatus: Collection<Media.Status>? = null,
  val deleted: Boolean? = null,
)

class BookSearchWithReadProgress(
  libraryIds: Collection<String>? = null,
  seriesIds: Collection<String>? = null,
  searchTerm: String? = null,
  mediaStatus: Collection<Media.Status>? = null,
  val tags: Collection<String>? = null,
  val readStatus: Collection<ReadStatus>? = null,
  val authors: Collection<Author>? = null,
) : BookSearch(libraryIds, seriesIds, searchTerm, mediaStatus)
