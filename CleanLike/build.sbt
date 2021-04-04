lazy val commonSettings = Seq(
  organization := "com.takamoto",
  version := "0.1.0-SNAPSHOT",
  scalaVersion := "2.13.5",
  scalacOptions := Seq(
    "-deprecation",
    "-feature"
  ),
  libraryDependencies ++= Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "5.0.0" % Test
  )
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    commonSettings,
    name := "itddd"
    // publishArtifact := false
  )
