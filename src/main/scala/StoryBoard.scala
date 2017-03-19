package org.scala.dimplejs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.JSName

@JSName("dimple.storyboard")
@js.native
class StoryBoard(
  val chart: Chart,
  val categoryFields: String | js.Array[String]
) extends js.Object {
  var autoplay: Boolean = js.native
  var frameDuration: Int = js.native
  var fontSize: String = js.native
  var fontFamily: String = js.native
  var onTick: js.Function1[EventArgs, Unit] = js.native
  var storylabel: Any = js.native

  def addOrderRule(
    odering: String | js.Array[String] | js.Function2[Any, Any, String],
    desc: Boolean = false
  ): Unit = js.native

  def getFramevalue(): String = js.native

  def goToFrame(frameText: String): Unit = js.native

  def pauseAnimation(): Unit = js.native

  def startAnimation(): Unit = js.native

  def stopAnimation(): Unit = js.native
}
