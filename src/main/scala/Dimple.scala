package org.scala.dimplejs

import org.singlespaced.d3js.SvgObject

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("dimple")
@js.native
object Dimple extends js.Object {

  def filterData(data: js.Array, field: String, filterValues: String | js.Array[String]): js.Array = js.native

  def getUniqueValues(data: js.Array, fields: String | js.Array[String]): js.Array[String] = js.native

  def newSvg(parentSelector: String, width: String, height: String): SvgObject = js.native

}

