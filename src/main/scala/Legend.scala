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
  val fontSize: String = js.native
  val fontFamily: String = js.native
  val shapes: js.Any = js.native
  val horizontalPadding: Int = js.native
  val verticalPadding: Int = js.native
}
