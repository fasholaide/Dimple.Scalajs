package org.scala.dimplejs

import org.singlespaced.d3js.{SvgObject, Xhr}
import org.singlespaced.d3js.timeModule.FormatObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.chart")
@js.native
class Chart(val svg: SvgObject, val data: Xhr) extends js.Object {

  type Options = String | js.Array[String]
  type Primitives = String | Int | Double
  type Series = Series | js.Array[Series]

  val axes = js.native
  val customeClassList = js.native
  val defaultColors = js.native
  val ease = js.native
  val height = js.native
  val legends = js.native
  val noFormats = js.native
  val series = js.native
  val staggerDraw = js.native
  val storyboard = js.native
  val width = js.native
  val x = js.native
  val y = js.native

  def addAxis(postion: String, categoryFields: Options = null, measure: String = "", timeFiled: String = ""): Axis = js.native

  def addColorAxis(measure: String, colors: Options = null): Axis = js.native

  def addLegend(x: Primitives, y: Primitives, width: Primitives, height: Primitives, horizontalAlign: String = "left", series: Series): Unit = js.native

  def addLogAxis(position: String, measure: String, logBase: Int = 10): Axis = js.native

  def addMeasureAxis(position: String, measure: String): Axis = js.native

  def addPctAxis(position: String, measure: String, categories: AnyRef): Axis = js.native

  def addTimeAxis(position: String, timeField: String, inputFormat: FormatObject | String = "", outputFormat: FormatObject | String = ""): Axis = js.native

  def addSeries(categoryFields: Options = null, plotFunction: js.Function0[Unit], axes: Axis | js.Array[Axis] = null): Series = js.native

  def assignClass(tag: String, css: String): String = js.native

  def assignColor(tag: String, fill: String, stroke: String = "", opacity: Double): Color = js.native

  def draw(duration: Double = 0, noDataChange: Boolean = false) = js.native

  def getClass(tag: String): String = js.native

  def getColor(tag: String): Color = js.native

  def setBounds(x: String | Int, y: String | Int, width: Int | String, height: String | Int): Chart = js.native

  def setMargins(left: String | Int, top: String | Int, right: String | Int, bottom: String | Int): Chart = js.native

  def setStoryboard(categoryFields: String, tickHandler: js.Function1[EventArgs, Unit]): StoryBoard = js.native

}