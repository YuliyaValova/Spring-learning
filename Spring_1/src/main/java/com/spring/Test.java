package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Pet pet = context.getBean("pet", Pet.class);
        pet.say();

        context.close();
    }
}
