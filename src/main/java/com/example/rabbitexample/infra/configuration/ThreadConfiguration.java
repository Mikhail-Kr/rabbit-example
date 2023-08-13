package com.example.rabbitexample.infra.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

@Configuration
public class ThreadConfiguration {

    @Bean
    public ExecutorService fixedThreadPool() {
        return Executors.newFixedThreadPool(10);
    }
}
