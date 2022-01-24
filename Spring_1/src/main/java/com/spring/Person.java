package com.spring;

public class Person {
    private String name;
    private int age;
    private Pet pet;

    public Person() {
    }

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

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void callPet(){
        System.out.println("Hello");
        this.pet.say();
    }
}
