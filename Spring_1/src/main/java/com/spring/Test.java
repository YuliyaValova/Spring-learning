package com.spring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        //Pet pet = context.getBean("pet", Pet.class);
        // pet.say();
        // Person person = new Person(pet); - создание вручную
        Person person = context.getBean("person", Person.class);
        person.callPet();
        System.out.println("Person: " + person.getName() + " " + person.getAge());

        context.close();
    }
}
