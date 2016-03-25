sbtPlugin := true

name := "sbt-jooq"
version := "0.3.0-SNAPSHOT"
description := "jOOQ plugin for SBT 0.13.5+"
organization := "com.github.kxbmap"

scalacOptions ++= Seq(
  "-deprecation",
  "-unchecked",
  "-feature",
  "-Xlint"
)

libraryDependencies += "org.jooq" % "joox" % "1.3.0"
