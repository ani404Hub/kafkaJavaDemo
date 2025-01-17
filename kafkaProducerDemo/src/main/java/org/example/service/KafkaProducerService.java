package org.example.service;

import org.example.dto.CustomerDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.support.SendResult;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;

import java.util.concurrent.CompletableFuture;

@Service
public class KafkaProducerService {
    @Autowired
    private KafkaTemplate<String, Object> templ;

    public void sendMsgToTopic(String message){
        CompletableFuture<SendResult<String, Object>> future = templ.send("newTopic-Demo2",message);
        future.whenComplete((res, ex) -> {
            if (ex == null)
                System.out.println("Message sent = " + message + " with offset = " + res.getRecordMetadata().offset() + " and topic = " + res.getRecordMetadata().partition());
            else
                System.out.println("Message sent failed = " + ex.getMessage());
        });
    }

    public void sendEvtToTopic(CustomerDTO custDto) {
        try {
            CompletableFuture<SendResult<String, Object>> futCust = templ.send("newCustomerTopic2", custDto);
            futCust.whenComplete((res, ex) -> {
                if (ex == null)
                    System.out.println("Customer detail sent = " + custDto.toString() + "with offset" + res.getRecordMetadata().offset() + "and topic" + res.getRecordMetadata().topic());
                else
                    System.out.println("Customer detail send failed = " + ex.getMessage());
            });
        } catch(Exception ex){
            System.out.println("ERROR  = " + ex.getMessage());
        }
    }
}
