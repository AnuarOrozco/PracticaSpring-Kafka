package com.kafka.consumer.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class KafkaConsumerListener {

    private Logger LOGGER = LoggerFactory.getLogger(KafkaConsumerListener.class);

    @KafkaListener(topics = {"helloFromJava-Topic"}, groupId = "random-group-id")
    public void listener(String message) {
        LOGGER.info("Mensaje recibido, el mensaje es: " + message);
    }

}