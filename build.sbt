import sys.process._

name := "projectName!!"

scalaVersion := "2.12"

scalaVersion := "2.12.15"

val awsS3List = taskKey[String]("List de aws s3 buckets")
val countBuckets = taskKey[Int]("Count buckets")

awsS3List := {
    val sum = 1+2
    println(s"Sum: $sum")
    println(s"Sum: $sum")
    val buckets = "aws s3 ls".!!
    // println(s"Buckets: $buckets")
    "muchos-buckets"
}

countBuckets := {
    awsS3List.value
    20
}

lazy val common = (
    Project("common", file("common")).
    settings(
        libraryDependencies +=
            "org.specs2" % "specs2_2.10" % "1.14" % "test"
    )
)

// val dependencies = Seq(
//     flinkDependencies,
//     testDependencies,
//     utilsDependencies
// ).flatten

// libraryDependencies ++= dependencies
