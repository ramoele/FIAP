package com.ramoele.mongodb.springbootmongodbexample.document;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CreditScore {

    @Id
    private Integer id;
    private String name;
    private String account;
    private Integer score;

    public CreditScore(Integer id, String name, String account, Long score) {
        this.id = id;
        this.name = name;
        this.account = account;
        this.score = score;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }
}
