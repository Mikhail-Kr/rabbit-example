package com.example.rabbitexample.infra.service.impl;

import com.example.rabbitexample.infra.service.RabbitProducerService;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutorService;

@Service
public class RabbitProducerServiceImpl implements RabbitProducerService {
    private final RabbitTemplate rabbitTemplate;
    private final ExecutorService fixedThreadPool;

    public RabbitProducerServiceImpl(RabbitTemplate rabbitTemplate, ExecutorService fixedThreadPool) {
        this.rabbitTemplate = rabbitTemplate;
        this.fixedThreadPool = fixedThreadPool;
    }

    public void sendMessage(String message) {
        for (int i = 0; i <= 100_000_0; i++) {
            fixedThreadPool.execute(() -> rabbitTemplate.convertAndSend("testExchange", "", message));
        }
    }
}
