package example

import org.scala.dimplejs.{Chart, Dimple, PlotLine}
import org.singlespaced.d3js.d3
import scala.scalajs.js

class Main extends js.JSApp {

  def main(): Unit = {
    val svg = Dimple.newSvg("#charContainer", 590, 400)
    val func: js.Function1[js.Array[js.Dictionary[String]], Unit] = { data: js.Array[js.Dictionary[String]] =>
      val filteredData = Dimple.filterData(data, "", js.Array(""))
      val myChart = new Chart(svg, filteredData)
      myChart.setBounds(60, 30, 505, 305)
      val xAxis = myChart.addCategoryAxis("x", "")
      xAxis.addOrderRule("")
      myChart.addMeasureAxis("y", "")
      val series = myChart.addSeries(null, PlotLine)
      myChart.draw()
      ()
    }

    d3.tsv("", func)

  }
}
