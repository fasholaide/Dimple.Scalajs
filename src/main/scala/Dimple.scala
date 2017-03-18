package org.scala.dimplejs

import org.singlespaced.d3js.Selection
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName
import scala.scalajs.js.|

@JSName("dimple")
@js.native
object Dimple extends js.Object {

  def filterData(
    data: js.Array[js.Dictionary[String]] | js.Array[js.Object with js.Dynamic],
    field: String, filterValues: String | js.Array[String]
  ): js.Array[js.Object with js.Dynamic] | js.Array[js.Dictionary[String]] = js.native

  def getUniqueValues(
    data: js.Array[js.Dictionary[String]] | js.Array[js.Object with js.Dynamic],
    fields: String | js.Array[String]
  ): js.Array[js.Object with js.Dynamic] | js.Array[js.Dictionary[String]] = js.native

  def newSvg(
    parentSelector: String,
    width: String | Int,
    height: String | Int
  ): Selection[org.scalajs.dom.EventTarget] = js.native
}
