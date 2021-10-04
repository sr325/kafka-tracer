package com.demo.consumer_one;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {
    @Autowired
    org.springframework.cloud.sleuth.Tracer tracer;

    @KafkaListener(topics = "topic1", groupId = "myGroup")
    public void consume(String message) {
        log.info("Tracer id is {} ", tracer.currentSpan().context().traceId());
        log.info("Span id is {} ", tracer.currentSpan().context().spanId());

        /*This parent id is not the span id of the parent*/
        log.info("Parent id is {} ", tracer.currentSpan().context().parentId());
        log.info("Consumed message {}", message);
    }
}
