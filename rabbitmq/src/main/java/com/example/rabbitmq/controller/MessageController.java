package com.example.rabbitmq.controller;

import com.example.rabbitmq.publisher.RabbitMQProducer;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
@RequiredArgsConstructor
public class MessageController {
    private final RabbitMQProducer rabbitMQProducer;

    @GetMapping("/publish")
    public ResponseEntity<String> sendMessage(@RequestParam String message) {
        rabbitMQProducer.send(message);
        return ResponseEntity.ok(message);
    }
}
