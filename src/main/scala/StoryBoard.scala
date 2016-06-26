package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.chart")
@js.native
class StoryBoard(
  val chart: Chart,
  val categoryFields: String | js.Array[String]
) extends js.Object {
  val autoplay: Boolean = js.native
  val frameDuration: Int = js.native
  val fontSize: String | Int = js.native
  val fontFamily: String = js.native
  val onTick: js.Function1[EventArgs, Unit] = js.native
  val storylabel: Any = js.native

  def addOrderRule(
    odering: String | js.Array[String] | js.Function2[Any, Any, String],
    desc: Boolean = false) = js.native

  def getFramevalue(): String = js.native

  def goToFrame(frameText: String): Unit = js.native

  def pauseAnimation(): Unit = js.native

  def startAnimation(): Unit = js.native

  def stopAnimation(): Unit = js.native
}
