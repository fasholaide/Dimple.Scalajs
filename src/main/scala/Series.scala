package org.scala.dimplejs

import org.scalajs.dom.raw.{SVGElement, SVGCircleElement}
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
  var aggregate: js.Function2[js.Object, js.Object, js.Object] = js.native
  var barGap: Float = js.native
  var c: Axis = js.native
  var data: js.Array[Any] = js.native
  var lineMarkers: Boolean = js.native
  var lineWeight: Int = js.native
  var shapes: js.Array[SVGElement] = js.native
  var x: Axis = js.native
  var y: Axis = js.native
  var z: Axis = js.native
  var radius: Int = js.native
  var innerRadius: String = js.native
  var outerRadius: String = js.native

  def addEventHandler(
    event: String,
    handler: js.Function1[EventArgs, Unit]
  ): Unit = js.native

  def addOrderRule(
    ordering: String | js.Array[String] | js.Function2[Any, Any, Int],
    desc: Boolean = false): Unit = js.native

  def getTooltipTest(
    e: js.Function1[EventArgs, js.Array[String]]
  ): js.Array[String] = js.native
}
