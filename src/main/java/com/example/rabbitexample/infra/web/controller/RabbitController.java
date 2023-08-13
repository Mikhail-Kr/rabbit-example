package com.example.rabbitexample.infra.web.controller;

import com.example.rabbitexample.infra.service.RabbitProducerService;
import com.example.rabbitexample.infra.web.model.MessageModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("/rabbit/v1")
public class RabbitController {

    private final RabbitProducerService rabbitProducerService;

    public RabbitController(RabbitProducerService rabbitProducerService) {
        this.rabbitProducerService = rabbitProducerService;
    }

    @PostMapping("/send")
    public void sendMessageToRabbit(@RequestBody MessageModel messageModel) {
        rabbitProducerService.sendMessage(messageModel.getMessage());
    }
}
