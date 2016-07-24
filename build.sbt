enablePlugins(ScalaJSPlugin)

name := "Dimple.Scalajs"

organization := "org.dimple.scalajs"

version := "0.1-SNAPSHOT"

scalaVersion := "2.11.8"

// http://mvnrepository.com/artifact/com.scalatags/scalatags_2.10
libraryDependencies ++= Seq(
  "com.scalatags" % "scalatags_2.10" % "0.1.4",
  "org.scala-js" %%% "scalajs-dom" % "0.9.0",
  "org.singlespaced" %%% "scalajs-d3" % "0.3.3"
)

jsDependencies += "org.webjars.bower" % "dimple" % "2.1.6" / "dimple.v2.0.0.js"

//publishTo := Some("Sonatype Snapshots Nexus" at "https://oss.sonatype.org/content/repositories/snapshots")
//credentials += Credentials(Path.userHome / "" / "")

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))
