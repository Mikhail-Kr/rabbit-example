package com.example.rabbitexample.infra.service;

public interface RabbitProducerService {
    void sendMessage(String message, String routingKey);
}
