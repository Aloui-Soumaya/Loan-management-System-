package com.loan_management.kafkaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MessageProducer {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendMessage(String topic,String message1,String message2) {
        kafkaTemplate.send(topic, message1);
        kafkaTemplate.send(topic, message2);

    }

}