package com.ramoele.mongodb.springbootmongodbexample.repository;

import com.ramoele.mongodb.springbootmongodbexample.document.CreditScore;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<CreditScore, Integer> {
}
