package com.dariojolo.kafka.app.controllers;

import com.dariojolo.kafka.app.services.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/service1")
public class ProducerController {
    private final MessageProducer producer;

    @Autowired
    public ProducerController(MessageProducer producer){
        this.producer = producer;
    }

    @PostMapping("/publicar")
    public ResponseEntity<String> messageToTopic(@RequestParam String message){
        this.producer.sendMessage(message);
        return ResponseEntity.ok("OK");
    }

}
