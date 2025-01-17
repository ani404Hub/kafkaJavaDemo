package org.example.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KafkaProducerConfig {
    @Bean
    public NewTopic createNewTopic(){
        return new NewTopic("newTopic-Demo2", 3, (short)1);
    }
    @Bean
    public NewTopic createNewCustomerTopic(){
        return new NewTopic("newCustomerTopic2", 3, (short)1);
    }
}
