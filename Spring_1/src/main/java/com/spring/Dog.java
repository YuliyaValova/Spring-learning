package com.spring;

import org.springframework.stereotype.Component;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Wow-Wow");
    }
}
