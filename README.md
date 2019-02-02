# Apache-Spark-2x-Machine-Learning-Cookbook-With-Sbt
This repository is sbt added edition of [PacktPublishing/Apache-Spark-2x-Machine-Learning-Cookbook](https://github.com/PacktPublishing/Apache-Spark-2x-Machine-Learning-Cookbook).
Sbt configuration is added to help to run examples in the [Apache Spark Machine Learning Cookbook](https://www.packtpub.com/big-data-and-business-intelligence/apache-spark-machine-learning-cookbook?utm_source=github&utm_medium=repository&utm_campaign=9781783551606) without suffering from all the dependencies of the code.

## Test Environment
- os: mac
- spark: spark-2.4.0-bin-hadoop2.7
- scala: 2.12

## Note
1. Download spark from https://www.apache.org/dyn/closer.lua/spark/spark-2.4.0/spark-2.4.0-bin-hadoop2.7.tgz, and run spark
2. snowball-1.0.jar doesn't seem maintained on collide repository anymore. Please add ./lib/snowball-1.0.jar to your external dependencies of the project manually
3. Do some intellij setup such as importing this repository to intellij, scala sdk setup, build Project, etc before running code
4. Code of cookbook example under spark.ml.cookbook package is tested. Example code of spark application are not tested on this repository 
