package com.example.testekafka.repository;

import com.example.testekafka.entity.Arquivo;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ArquivoRepository extends MongoRepository<Arquivo, String> {
}
