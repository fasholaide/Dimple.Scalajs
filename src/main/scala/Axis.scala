package org.scala.dimplejs

import org.singlespaced.d3js.timeModule.Interval
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName
import org.singlespaced.d3js.TimeObject

@JSName("dimple.axis")
@js.native
class Axis(
  chart: Chart,
  position: String,
  categoryFields: String | js.Array[String] = null,
  measure: String = null,
  timeField: String = null
) extends js.Object {
  var colors: String | js.Array[String] = js.native
  var clamp: Boolean = js.native
  var fontSize: String = js.native
  var fontFamily: String = js.native
  var gridlineShapes: js.Any = js.native
  var hidden: Boolean = js.native
  var logBase: Int = js.native
  var overrideMin: Float = js.native
  var overrideMax: Float = js.native
  var shapes: js.Any = js.native
  var showGridlines: Boolean = js.native
  var showPercent: Boolean = js.native
  var titleShape: js.Any = js.native
  var tickFormat: String = js.native
  var title: String= js.native
  var floatingBarWidth: Int = js.native
  var dateParseFormat: String = js.native
  var ticks: Int = js.native
  var timePeriod: Interval= js.native
  var timeInterval: Int = js.native
  var useLog: Boolean = js.native

  def addGroupOrderRule(
    ordering: String | js.Array[String] | js.Function2[Any, Any, Int],
    desc: Boolean = false): Unit = js.native

  def addOrderRule(
    ordering: String | js.Array[String] | js.Function2[Any, Any, Int],
    desc: Boolean = false): Unit = js.native
}
