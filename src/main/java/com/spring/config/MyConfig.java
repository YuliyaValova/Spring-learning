package com.spring.config;

import com.spring.entities.Cat;
import com.spring.entities.Dog;
import com.spring.entities.Humster;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Cat getCat() {
        System.out.println("C cr");
        return new Cat();
    }

    @Bean
    public Humster getHumster(){
        System.out.println("H cr");
        return new Humster();
    }

    @Bean
    public Dog getDog(Humster humster){
        Dog dog = new Dog();
        dog.setName(humster.getName()+"-lol");
        System.out.println("D cr");
        return dog;
    }

}
