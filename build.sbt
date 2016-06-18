enablePlugins(ScalaJSPlugin)

name := "Scalatags"

version := "1.0"

scalaVersion := "2.11.8"

// http://mvnrepository.com/artifact/com.scalatags/scalatags_2.10
libraryDependencies += "com.scalatags" % "scalatags_2.10" % "0.1.4"
libraryDependencies += "org.scala-js" %%% "scalajs-dom" % "0.9.0"
libraryDependencies += "org.singlespaced" %%% "scalajs-d3" % "0.3.3"

jsDependencies += "org.webjars.bower" % "dimple" % "2.1.6" / "dimple.v1.js"

