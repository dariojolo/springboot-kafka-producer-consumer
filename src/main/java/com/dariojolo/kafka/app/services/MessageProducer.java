package com.dariojolo.kafka.app.services;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MessageProducer {

    private static final String TOPIC = "topico-de-prueba";

    @Autowired
    private KafkaTemplate<String, String> template;

    public void sendMessage(String message){
        this.template.send(TOPIC, message);
    }
}
