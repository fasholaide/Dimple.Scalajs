package org.scala.dimplejs

import org.singlespaced.d3js.SvgObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("dimple")
@js.native
object Dimple extends js.Object {

  def filterData(data: js.Array[Any], field: String, filterValues: String | js.Array[String]): js.Array[Any] = js.native

  def getUniqueValues(data: js.Array[Any], fields: String | js.Array[String]): js.Array[Any] = js.native

  def newSvg(parentSelector: String, width: String | Int, height: String | Int): SvgObject = js.native
}
