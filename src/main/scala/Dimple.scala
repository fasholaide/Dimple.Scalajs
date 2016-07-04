package org.scala.dimplejs

import org.singlespaced.d3js.Selection

import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("dimple")
@js.native
object Dimple extends js.Object {

  def filterData(data: js.Array[js.Dictionary[String]], field: String, filterValues: js.Array[String] | String): js.Array[Any] = js.native

  def getUniqueValues(data: js.Array[js.Dictionary[String]], fields: String | js.Array[String]): js.Array[Any] = js.native

  def newSvg(parentSelector: String, width: String | Int, height: String | Int): Selection[org.scalajs.dom.EventTarget] = js.native
}
