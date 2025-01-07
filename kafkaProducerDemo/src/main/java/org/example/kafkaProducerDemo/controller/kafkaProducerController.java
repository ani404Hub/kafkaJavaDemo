package org.example.kafkaProducerDemo.controller;

import org.example.kafkaProducerDemo.dto.customerDTO;
import org.example.kafkaProducerDemo.service.kafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class kafkaProducerController {
    @Autowired
    private kafkaProducerService publisher;
    @GetMapping("/publish/{msg}")
    public ResponseEntity<?> publishMessage(@PathVariable String msg){
        try{
            for(int i = 0; i < 100; i++){
                publisher.sendMsgToTopic(msg +" message "+ i);
            }
            return ResponseEntity.ok("Message Published");
        }
        catch(Exception e){
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
    @PostMapping("/publish")
    public void sendEvent(@RequestBody customerDTO cust){
        publisher.sendEvtToTopic(cust);
    }
}
