package com.spring;

import com.spring.entities.Cat;
import com.spring.entities.Dog;
import com.spring.entities.Humster;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        // создаем пустой спринговый контекст, который будет искать свои бины по аннотациям в указанном пакете
        ApplicationContext context = new AnnotationConfigApplicationContext("com.spring.config");
        System.out.println("context cr");
        Cat cat = context.getBean(Cat.class);
        Dog dog = (Dog) context.getBean(Dog.class);
        Humster humster = context.getBean(Humster.class);

        System.out.println(cat.getName());
        System.out.println(dog.getName());
        System.out.println(humster.getName());
    }
}
