package org.gotson.komga.domain.model

data class Panel(
  val x: Int,
  val y: Int,
  val width: Int,
  val height: Int,
  val order: Int = 0,
)
