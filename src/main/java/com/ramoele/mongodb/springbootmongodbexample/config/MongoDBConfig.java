package com.ramoele.mongodb.springbootmongodbexample.config;

import com.ramoele.mongodb.springbootmongodbexample.document.CreditScore;
import com.ramoele.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories(basePackageClasses = UserRepository.class)
@Configuration
public class MongoDBConfig {


    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository) {
        return strings -> {
            userRepository.save(new CreditScore(1, "Ramoele", "NU10000000001", 2));
            userRepository.save(new CreditScore(2, "Dutra", "NU20000000002", 9));
        };
    }

}
