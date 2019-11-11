scalaVersion in ThisBuild := "2.13.1"

enablePlugins(JooqCodegenPlugin)

addJooqCodegenSettingsTo(Test)

jooqCodegenConfig in Test := file("jooq-codegen.xml")

libraryDependencies ++= Seq("test", "jooq-codegen").map { conf =>
  "com.h2database" % "h2" % "1.4.196" % conf
}
