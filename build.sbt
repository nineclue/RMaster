enablePlugins(ScalaJSPlugin)

name := "RMaster"

version := "0.1"

scalaVersion := "2.12.6"

scalaJSUseMainModuleInitializer := true

libraryDependencies ++= Seq(
  "org.scala-js" %%% "scalajs-dom" % "0.9.6",
  "org.querki" %%% "jquery-facade" % "1.2"
)

skip in packageJSDependencies := false
jsDependencies +=
  "org.webjars" % "jquery" % "3.3.1" / "jquery.js" minified "jquery.min.js"
