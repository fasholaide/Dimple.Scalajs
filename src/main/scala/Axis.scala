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
  val colors: String | js.Array[String] = js.native
  val clamp: Boolean = js.native
  val fontSize: String = js.native
  val fontFamily: String = js.native
  val gridlineShapes: js.Any = js.native
  val hidden: Boolean = js.native
  val logBase: Int = js.native
  val overrideMin: Float = js.native
  val overrideMax: Float = js.native
  val shapes: js.Any = js.native
  val showGridlines: Boolean = js.native
  val showPercent: Boolean = js.native
  val titleShape: js.Any = js.native
  val tickFormat: String = js.native
  val title: String= js.native
  val floatingBarWidth: Int = js.native
  val dateParseFormat: String = js.native
  val ticks: Int = js.native
  val timePeriod: Interval= js.native
  val timeInterval: Int = js.native
  val useLog: Boolean = js.native

  def addGroupOrderRule(
    ordering: String | js.Array[String] | js.Function2[Any, Any, Int],
    desc: Boolean = false): Unit = js.native

  def addOrderRule(
    ordering: String | js.Array[String] | js.Function2[Any, Any, Int],
    desc: Boolean = false): Unit = js.native

}
