//package com.rishi.springcore.usingBeenAnotation;//package com.rishi.springcore;
//
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Primary;
//
//@SpringBootApplication
////@ComponentScan(basePackages = {"com.rishi.springcore","test"}) // when we want to test package
//public class SpringCoreConceptApplication {
//	public static void main(String[] args) {
//
//		ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
//        Person personBeen = context.getBean(Person.class);
//        personBeen.playWithAnimal();
//        System.out.println(personBeen);
//
//	}
////    //Declaring the Bean using @Been
////    @Bean(name = "samosa1")
////    @Primary
////    public Samosa getSamosa1(){
////        return new Samosa(" Tandoori Samosa");
////    }
////
////    @Bean(name = "samosa2")
////    public Samosa getSamosa2(){
////        return new Samosa(" Meeta samosa");
////    }
//}
