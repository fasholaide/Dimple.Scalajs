package org.scala.dimplejs

import org.singlespaced.d3js.Selection
import org.singlespaced.d3js.timeModule.FormatObject

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName


@JSName("dimple.chart")
@js.native
class Chart(
  var svg: Selection[org.scalajs.dom.EventTarget],
  var data: js.Array[js.Object with js.Dynamic] | js.Array[js.Dictionary[String]]
) extends js.Object {

  type Stringy = String | js.Array[String]
  type Primitives = String | Int
  type Seriez = Series | js.Array[Series]

  var axes: js.Array[Axis] = js.native
  var customClassList: js.Any = js.native
  var defaultColors: js.Array[Color] = js.native
  var ease: String = js.native
  var height: Int = js.native
  var legends: js.Array[Legend] = js.native
  var noFormats: Boolean = js.native
  var series: js.Array[Series] = js.native
  var staggerDraw: Boolean = js.native
  var storyboard: StoryBoard = js.native
  var width: Int = js.native
  var x: Int = js.native
  var y: Int = js.native

  def addAxis(
    postion: String,
    categoryFields: Stringy = null,
    measure: String = "",
    timeField: String = ""): Axis = js.native

  def addCategoryAxis(
    position: String,
    measure: Stringy
  ): Axis = js.native

  def addColorAxis(
    measure: String,
    colors: Stringy = null
  ): Axis = js.native

  def addLegend(
    x: Primitives,
    y: Primitives,
    width: Primitives,
    height: Primitives,
    horizontalAlign: String = "left",
    series: Seriez): Unit = js.native

  def addLogAxis(
    position: String,
    measure: String,
    logBase: Int = 10
  ): Axis = js.native

  def addMeasureAxis(
    position: String,
    measure: String
  ): Axis = js.native

  def addPctAxis(
    position: String,
    measure: String,
    categories: Stringy = null
  ): Axis = js.native

  def addTimeAxis(
    position: String,
    timeField: String,
    inputFormat: FormatObject | String = null,
    outputFormat: FormatObject | String = null
  ): Axis = js.native

  def addSeries(
    categoryFields: Stringy = null,
    plotFunction: Plot,
    axes: Axis | js.Array[Axis] = null
  ): Series = js.native

  def assignClass(
    tag: String,
    css: String
  ): String = js.native

  def assignColor(
    tag: String,
    fill: String,
    stroke: String = "",
    opacity: Float
  ): Color = js.native

  def draw(
    duration: Float = 0,
    noDataChange: Boolean = false
  ): Chart = js.native

  def getClass(tag: String): String = js.native

  def getColor(tag: String): Color = js.native

  def setBounds(
    x: String | Int,
    y: String | Int,
    width: Int | String,
    height: String | Int
  ): Chart = js.native

  def setMargins(
    left: String | Int,
    top: String | Int,
    right: String | Int,
    bottom: String | Int
  ): Chart = js.native

  def setStoryboard(
    categoryFields: String,
    tickHandler: js.Function1[EventArgs, Unit]
  ): StoryBoard = js.native

}