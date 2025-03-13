package com.kafka.consumer.springboot.consumer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaMessageListener
{
    Logger log = LoggerFactory.getLogger(KafkaMessageListener.class);

    @KafkaListener(topics = "world-cup", groupId= "Group-1")
    public void consumer(String message)
    {
        log.info("consumer consume the message {}", message);
    }
    @KafkaListener(topics="world-cup", groupId = "Group-2")
    public void consumer1(String message){
        log.info("consumer1 consume the message1 {}", message);
    }
    @KafkaListener(topics="world-cup", groupId= "Group-3")
    public void consumer2(String message) {
        log.info("consumer2 consume the message2 {}", message);
    }
    @KafkaListener(topics="world-cup", groupId= "Group-4")
    public void consumer3(String message) {
        log.info("consumer3 consume the message3 {}", message);
    }
    @KafkaListener(topics="world-cup", groupId="Group-5")
            public void consumer4(String message) {
        log.info("consumer4 consume the message4 {}", message);
    }
    @KafkaListener(topics="world-cup", groupId="Group-6")
         public void consumer5(String message){
         log.info("consumer consume the message5 {}", message);
        }

        }




