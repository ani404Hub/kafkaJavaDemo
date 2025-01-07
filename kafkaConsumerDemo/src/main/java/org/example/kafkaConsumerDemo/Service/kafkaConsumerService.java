package org.example.kafkaConsumerDemo.Service;

import org.example.kafkaConsumerDemo.dto.customerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class kafkaConsumerService {
    Logger log = LoggerFactory.getLogger(kafkaConsumerService.class);

    @KafkaListener(topics = "newTopic-Demo2", groupId = "newTopicDemo-Group2")
    public void consumer1(String msg){
        log.info("Consumer1 Consumed the message: {}", msg);
    }   //Here mesage sent in string converted to byte array and pass through broker and consumer  consumed thar byte array and converted to String
    @KafkaListener(topics = "newTopic-Demo2", groupId = "newTopicDemo-Group2")
    public void consumer2(String msg){
        log.info("Consumer2 Consumed the message: {}", msg);
    }
    @KafkaListener(topics = "newTopic-Demo2", groupId = "newTopicDemo-Group2")
    public void consumer3(String msg){
        log.info("Consumer3 Consumed the message: {}", msg);
    }
    @KafkaListener(topics = "newTopic-Demo2", groupId = "newTopicDemo-Group2")
    public void consumer4(String msg){
        log.info("Consumer4 Consumed the message: {}", msg);
    }

    @KafkaListener(topics = "newCustomerTopic", groupId = "newCustomerGroup")
    public void consumeCustomer(customerDTO cust){
        log.info("Consumer consumed Customer details: {}", cust.toString());
    }
}
