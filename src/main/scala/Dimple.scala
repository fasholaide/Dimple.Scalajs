package org.scala.dimplejs

import org.singlespaced.d3js.SvgObject
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("dimple")
@js.native
trait Dimple[A] extends js.Object {

  def filterData(data: js.Array[A][js.Array[A]], field: String, filterValues: js.Array[String]): js.Array[A][js.Array[A]] = js.native

  def filterData(data: js.Array[A][js.Array[A]], field: String, filterValues: String): js.Array[A][js.Array[A]] = js.native

  def getUniqueValues(data: js.Array[A][js.Array[A]], fields: String): js.Array[String] = js.native

  def getUniqueValues(data: js.Array[A][js.Array[A]], fields: js.Array[String]): js.Array[String] = js.native

  def newSvg(parentSelector: String, width: String, height: String): SvgObject = js.native

}