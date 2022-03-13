package com.ms.kafka.adapters.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaPortfolioInitializer {
    public static void main(String[] args) {
        SpringApplication.run(KafkaPortfolioInitializer.class,args);
    }
}