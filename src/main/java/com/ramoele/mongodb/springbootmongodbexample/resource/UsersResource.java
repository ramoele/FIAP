package com.ramoele.mongodb.springbootmongodbexample.resource;

import com.ramoele.mongodb.springbootmongodbexample.document.CreditScore;
import com.ramoele.mongodb.springbootmongodbexample.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/rest/users")
public class CreditScoreResource {

    private UserRepository userRepository;

    public CreditScoreResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/all")
    public List<CreditScore> getAll() {
        return userRepository.findAll();
    }
}
