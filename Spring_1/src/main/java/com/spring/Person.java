package com.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
    private String name;
    private int age;
    @Autowired
    private Pet pet;

    public Person() {
    }

    //@Autowired
    public Person(Pet pet) {
        this.pet = pet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }
    //@Autowired
    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello");
        this.pet.say();
    }
}
