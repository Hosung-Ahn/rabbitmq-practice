package com.example.rabbitmq.consumer;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class RabbitMQConsumer {

    @RabbitListener(queues = "${rabbitmq.queue.name}")
    public void consume(String message) {
        log.info("receive message: {}", message);

    }
}
