# kafkaJavaDemo
Integrated and Configured Apache Kafka with Java using Spring framework
Docker pulled the image of ZooKeeper and Apache Kafka v3.8.1 Also configured Producer and Consumer in different ports to run in separate servers.
Producer can pass both String and Employee Object and Consumer can consume both of them. To consume an Object type Entity it needs JSON serializer & JSON Deserializer.
In Producer, configuration is done through .YAML file while in Consumer java class-based configuration is done using the Kafka template.
In Consumer, the Employee Entity along with the path should have the same name as Producer else it will throw an error as while publishing a message to Kafka Topic by Producer it also sends the Entity name along with the path in the header, so while consuming the message Consumer also look for the same entity in same path. So both of them needs to be matched along with path. 
