package com.kafka.consumer.service;

import com.kafka.consumer.model.User;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

@Service
@KafkaListener(topics = "topic_partition_2", groupId = "group_json", containerFactory = "kafkaListenerContainerFactory")
public class KafkaConsumer {

  @KafkaHandler
  public void consumeJson(@Payload  User user) {
    System.out.println("Consumed Json message" + user);
  }
}