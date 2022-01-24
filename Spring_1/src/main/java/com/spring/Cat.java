package com.spring;

import org.springframework.stereotype.Component;

@Component("Cat")
public class Cat implements Pet{
    @Override
    public void say() {
        System.out.println("Meow");
    }

    public void init(){
        System.out.println("Init");
    }

    public void destroy(){
        System.out.println("Destroy");
    }
}
