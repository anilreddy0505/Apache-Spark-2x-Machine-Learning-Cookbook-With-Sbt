name := "Apache-Spark-2x-Machine-Learning-Cookbook-With-Sbt"

version := "0.1"

scalaVersion := "2.12.8"

resolvers ++= Seq(
  "Sonatype OSS release" at "https://oss.sonatype.org/content/repositories/release",
  "Collide release" at "http://mvn.collide.info/content/repositories/releases",
  "Cental maven" at "http://central.maven.org/maven2/release",
  "Ivy release" at "https://repo.typesafe.com/typesafe/ivy-releases",
  "Cloudera repo" at "https://repository.cloudera.com/content/repositories/releases",
  "Cloudera thirdparty repo" at "https://repository.cloudera.com/content/repositories/third-party"
)

libraryDependencies += "org.apache.spark" %% "spark-core" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-streaming" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-sql" % "2.4.0"
libraryDependencies += "org.apache.spark" %% "spark-mllib" % "2.4.0"
libraryDependencies += "com.github.scopt" %% "scopt" % "3.7.1"
libraryDependencies += "org.apache.kafka" % "kafka-clients" % "2.1.0"

libraryDependencies += "org.scalanlp" %% "breeze" % "1.0-RC2"
libraryDependencies += "org.scalanlp" %% "breeze-viz" % "1.0-RC2"

libraryDependencies += "org.apache.hbase" % "hbase-client" % "0.98.6-cdh5.3.0"
libraryDependencies += "org.apache.hbase" % "hbase-server" % "0.98.6-cdh5.3.0"
libraryDependencies += "org.jfree" % "jfreechart" % "1.0.19"
libraryDependencies += "org.jfree" % "jcommon" % "1.0.24"
libraryDependencies += "edu.umd" % "cloud9" % "2.0.1"
libraryDependencies += "info.bliki.wiki" % "bliki-core" % "3.0.19"
//libraryDependencies += "org.tartarus" % "snowball" % "1.0"
