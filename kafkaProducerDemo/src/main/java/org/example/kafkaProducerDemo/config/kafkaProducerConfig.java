package org.example.kafkaProducerDemo.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.core.KafkaAdmin;

@Configuration
public class kafkaProducerConfig {
    @Bean
    public NewTopic createNewTopic(){
        return new NewTopic("newTopic-Demo2", 3, (short)1);
    }
    @Bean
    public NewTopic createNewCustomerTopic(){
        return new NewTopic("newCustomerTopic", 3, (short)1);
    }
}
