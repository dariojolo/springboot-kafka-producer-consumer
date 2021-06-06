package com.dariojolo.kafka.app.services;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MessageConsumer {
    @KafkaListener(topics = "topico-de-prueba", groupId = "group_id")
    public void consumeMessage(String message){
        if (message.startsWith("Mensaje para")){
            System.out.println("El mensaje que llego era para una persona: " + message);
        }
        else {
            System.out.println("Es otro mensaje: " + message);
        }
    }
}
