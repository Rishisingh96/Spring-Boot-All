//package com.rishi.springcore.config;
//
//import com.rishi.springcore.usingBeenAnotation.Person;
//import com.rishi.springcore.usingBeenAnotation.Samosa;
//import com.rishi.springcore.usingBeenAnotation.SpringCoreConceptApplication;
//import org.springframework.boot.SpringApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//
//@Configuration
//public class MyConfig {
//    public static void main(String[] args) {
//        ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
//        Person personBeen = context.getBean(Person.class);
//        personBeen.playWithAnimal();
//        System.out.println(personBeen);
//    }
//    @Bean(name = "samosa1")
//    @Primary
//    public Samosa getSamosa1(){
//        return new Samosa(" Tandoori Samosa");
//    }
//
//    @Bean(name = "samosa2")
//    public Samosa getSamosa2(){
//        return new Samosa(" Meeta samosa");
//    }
//}
