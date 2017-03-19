package org.scala.dimplejs

import org.scalajs.dom.Element
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("dimple.eventArgs")
@js.native
class EventArgs() extends js.Object {
  var seriesValue: Any = js.native
  var xValue: Any = js.native
  var yValue: Any = js.native
  var zValue: Any = js.native
  var colorValue: Any = js.native
  var frameValue: Any = js.native
  var seriesShape: js.Array[Element] = js.native
  var selectedShape: Element = js.native
}
