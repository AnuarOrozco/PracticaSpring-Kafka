package com.kafka.provider.config;

import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.config.TopicConfig;
import org.apache.kafka.common.internals.Topic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class KafkaTopicConfig {

    // Create a basic Kafka Topic
    @Bean
    public NewTopic generateTopic() {

        Map<String, String> configurations = new HashMap<>();
        configurations.put(TopicConfig.CLEANUP_POLICY_CONFIG, TopicConfig.CLEANUP_POLICY_DELETE); // delete (erase message), compact (keep the most recent)
        configurations.put(TopicConfig.RETENTION_MS_CONFIG, "86400000"); // retention message time in ms
        configurations.put(TopicConfig.SEGMENT_BYTES_CONFIG, "1073741824"); // max size of segment in bytes
        configurations.put(TopicConfig.MAX_MESSAGE_BYTES_CONFIG, "1000012"); // max size of each msg in bytes

         return TopicBuilder.name("helloFromJava-Topic")
                 .partitions(2)
                 .replicas(2) // messages backup
                 .configs(configurations)
                 .build();
    }

}
