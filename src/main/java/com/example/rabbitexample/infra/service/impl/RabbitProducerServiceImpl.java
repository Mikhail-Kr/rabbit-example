package com.example.rabbitexample.infra.service.impl;

import com.example.rabbitexample.infra.service.RabbitProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

@Service
public class RabbitProducerServiceImpl implements RabbitProducerService {
    private final RabbitTemplate rabbitTemplate;

    public RabbitProducerServiceImpl(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message, String routingKey) {
        rabbitTemplate.convertAndSend("testExchange", routingKey, message);
    }
}
