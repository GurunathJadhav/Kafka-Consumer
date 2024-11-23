package com.kafkaconsumer.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConfig {
    @KafkaListener(topics = AppConstance.TOPIC_NAME,groupId = AppConstance.GROUP_ID)
    public void receiveMessage(String message){
        System.out.println(message);

    }
}
