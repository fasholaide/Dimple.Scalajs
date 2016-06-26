package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.series")
@js.native
class Series(
              chart: Chart,
              categoryFields: String | js.Array[String],
              xAxis: Axis,
              yAxis: Axis,
              zAxis: Axis = null,
              colorAxis: Axis = null,
              pieAxis: Axis = null,
              plotFunction: Plot,
              aggregateMethod: js.Function0[Int],
              stacked: Boolean
            ) extends js.Object {
  val aggregate = js.native
  val barGap = js.native
  val c = js.native
  val data = js.native
  val lineMarkers = js.native
  val lineWeight = js.native
  val shapes = js.native
  val x = js.native
  val y = js.native
  val z = js.native

  def addEventHandler(event: String, handler: EventArgs): Unit = js.native

  def addOrderRule(ordering: String | js.Array[String] | js.Function2[Any, Any, Int], desc: Boolean = false): Unit = js.native

  def getTooltipTest(e: EventArgs): js.Array[String] = js.native
}
