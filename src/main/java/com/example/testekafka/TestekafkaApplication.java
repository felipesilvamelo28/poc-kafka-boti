package com.example.testekafka;

import com.example.testekafka.repository.ArquivoRepository;
import com.example.testekafka.service.ConsumerExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestekafkaApplication implements CommandLineRunner {

	@Autowired
	ArquivoRepository arquivoRepository;

	public static void main(String[] args) {
		SpringApplication.run(TestekafkaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		ConsumerExample.runConsumer(arquivoRepository);
	}
}
