name := "CleanScala"

version := "1.0"

scalaVersion := "2.12.2"

wartremoverErrors ++= Warts.unsafe

coverageEnabled := true

wartremoverExcluded += baseDirectory.value / "src" / "test" / "scala" / "NumbersTest.scala"

libraryDependencies += "org.scalactic" %% "scalactic" % "3.0.1"
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.1" % "test"