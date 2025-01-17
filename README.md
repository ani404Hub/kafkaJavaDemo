# kafkaJavaDemo
Integrated and Configured Apache Kafka with Java using Spring framework
Docker pulled the image of ZooKeeper and Apache Kafka v3.8.1 Also configured Producer and Consumer in different ports to run in separate servers.
Producer can pass both String and Employee Object and Consumer can consume both of them. To consume an Object type Entity it needs JSON serializer & JSON Deserializer.
In Producer, configuration is done through .YAML file while in Consumer java class-based configuration is done using the Kafka template.
