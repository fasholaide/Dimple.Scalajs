package org.scala.dimplejs

import org.singlespaced.d3js.{SvgObject, Xhr}
import org.singlespaced.d3js.timeModule.FormatObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.legend")
@js.native
class Legend(
  chart: Chart,
  x: Int | String,
  y: Int | String,
  width: Int | String,
  height: Int | String,
  horizontalAlign: String = "left",
  series: Series | js.Array[Series]
) extends js.Object {
  var fontSize: String = js.native
  var fontFamily: String = js.native
  var shapes: js.Any = js.native
  var horizontalPadding: Int = js.native
  var verticalPadding: Int = js.native
}
