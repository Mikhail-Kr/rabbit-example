package com.example.rabbitexample.infra.web.controller;

import com.example.rabbitexample.infra.service.RabbitProducerService;
import com.example.rabbitexample.infra.web.model.MessageModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitController {

    private final RabbitProducerService rabbitProducerService;

    public RabbitController(RabbitProducerService rabbitProducerService) {
        this.rabbitProducerService = rabbitProducerService;
    }

    @GetMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageModel messageModel) {
        rabbitProducerService.sendMessage(messageModel.getMessage(), messageModel.getRoutingKey());
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "OK";
    }
}
