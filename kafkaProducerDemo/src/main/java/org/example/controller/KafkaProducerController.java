package org.example.controller;

import org.example.dto.CustomerDTO;
import org.example.service.KafkaProducerService;
import org.example.service.KafkaProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/producer-app")
public class KafkaProducerController {
    @Autowired
    private KafkaProducerService publisher;
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
    public void sendEvent(@RequestBody CustomerDTO cust){
        publisher.sendEvtToTopic(cust);
    }
}
