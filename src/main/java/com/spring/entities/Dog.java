package com.spring.entities;

import org.springframework.stereotype.Component;


public class Dog {
    private String name = "Sabaka";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
