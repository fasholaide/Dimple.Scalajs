package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("dimple.color")
@js.native
case class Color(
  fill: String,
  stroke: String = "",
  opacity: Float
) extends js.Object {

}
