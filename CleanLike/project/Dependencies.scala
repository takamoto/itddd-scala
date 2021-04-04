import sbt._

object Dependencies {
  object Versions {
    lazy val Scalikejdbc = "3.5.0"
    lazy val ScalikejdbcPlay = "2.8.0-scalikejdbc-3.5"
    lazy val Scalatest = "3.2.5"
  }

  lazy val CommonDepends = Seq(
    "ch.qos.logback"  %  "logback-classic"   % "1.2.3",
    "org.scalactic" %% "scalactic" % Versions.Scalatest,
    "org.scalatest" %% "scalatest" % Versions.Scalatest % Test
  )

  lazy val InfrastructureDepends = Seq(
    "org.scalikejdbc" %% "scalikejdbc" % Versions.Scalikejdbc,
    "org.scalikejdbc" %% "scalikejdbc-config" % Versions.Scalikejdbc,
    "org.scalikejdbc" %% "scalikejdbc-test" % Versions.Scalikejdbc % Test,
    "org.scalikejdbc" %% "scalikejdbc-play-initializer" % Versions.ScalikejdbcPlay,
    "org.scalikejdbc" %% "scalikejdbc-play-dbapi-adapter" % Versions.ScalikejdbcPlay
  )
}
