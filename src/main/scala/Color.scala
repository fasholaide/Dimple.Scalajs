package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("dimple.color")
@js.native
class Color(
  var fill: String,
  var stroke: String = "",
  var opacity: Float = 0.8F
) extends js.Object {
}
