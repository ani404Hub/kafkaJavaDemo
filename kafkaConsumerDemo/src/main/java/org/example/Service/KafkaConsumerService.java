package org.example.Service;

import org.example.dto.CustomerDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {
    Logger log = LoggerFactory.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "newTopic-Demo2", groupId = "newTopicDemo-Group2")
    public void consumer1(String msg){
        log.info("Consumer1 Consumed the message: {}", msg);
    }   //Here mesage sent in string converted to byte array and pass through broker and consumer  consumed that byte array and converted to String
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

    @KafkaListener(topics = "newCustomerTopic2", groupId = "newCustomerGroup2")
    public void consumeCustomer(CustomerDTO cust){
        log.info("Consumer consumed Customer details: {}", cust);
    }
}
