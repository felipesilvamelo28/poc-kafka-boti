package com.example.testekafka.service;

public class Publisher {

    public static void main(String[] args) {

        String brokers = "localhost:9091";

        KafkaExample kafkaExample = new KafkaExample(brokers);

        kafkaExample.produce("teste");
        //kafkaExample.consume();

    }

}
