package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.axis")
@js.native
class Axis(
            chart: Chart,
            position: String,
            categoryFields: String | js.Array[String] = null,
            measure: String = null,
            timeField: String = null
          ) extends js.Object {
  val colors = js.native
  val clamp = js.native
  val fontSize = js.native
  val fontFamily = js.native
  val gridlineShapes = js.native
  val hidden = js.native
  val logBase = js.native
  val overrideMin = js.native
  val overrideMax = js.native
  val shapes = js.native
  val showGridlines = js.native
  val showPercent = js.native
  val titleShape = js.native
  val tickFormat = js.native
  val title = js.native
  val floatingBarWidth = js.native
  val dateParseFormat = js.native
  val ticks = js.native
  val timePeriod = js.native
  val timeInterval = js.native
  val useLog = js.native

  def addGroupOrderRule(ordering: String | js.Array[String] | js.Function2[Any, Any, Int], desc: Boolean = false): Unit = js.native

  def addOrderRule(ordering: String | js.Array[String] | js.Function2[Any, Any, Int], desc: Boolean = false): Unit = js.native

}
