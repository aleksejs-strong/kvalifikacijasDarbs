name := "KafkaConsumer"

version := "1.0.1"

scalaVersion := "2.11.8"


val sparkVersion = "2.3.0"

libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-streaming"            % sparkVersion,  //kafka consumer
  "org.apache.spark" %% "spark-streaming-kafka-0-10" % sparkVersion,  //kafka consumer
  "com.hortonworks"   % "shc-core" % "1.1.1-2.1-s_2.11"               //hbase writing
)



assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs@_*) => MergeStrategy.discard
  case x => MergeStrategy.last
}