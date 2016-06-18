package org.scala.dimplejs

import org.singlespaced.d3js.SvgObject
import scala.scalajs.js
import scala.scalajs.js.annotation.JSName

@JSName("dimple.plot")
@js.native
trait Plot extends js.Object {
  val stacked: Boolean = js.native
  val supports: String = js.native
}

@JSName("dimple.plot.area")
@js.native
object PlotArea extends Plot {

}

@JSName("dimple.plot.bar")
@js.native
object PlotBar extends js.Object {

}

@JSName("dimple.plot.bubble")
@js.native
object PlotBubble extends js.Object {

}

@JSName("dimple.plot.line")
@js.native
object PlotLine extends js.Object {

}
