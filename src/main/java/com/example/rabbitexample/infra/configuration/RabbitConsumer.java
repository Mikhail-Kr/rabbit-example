package com.example.rabbitexample.infra.configuration;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@EnableRabbit
public class RabbitConsumer {


    @RabbitListener(queues = "queue1")
    public void processMyQueue(String message) {
        System.out.printf("Received from myQueue : %s ", new String(message.getBytes()));
    }
}