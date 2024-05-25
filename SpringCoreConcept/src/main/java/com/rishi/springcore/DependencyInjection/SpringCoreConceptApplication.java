//package com.rishi.springcore.DependencyInjection;//package com.rishi.springcore;
//
//import com.rishi.springcore.DependencyInjection.ConstructorBase.Person;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.ComponentScan;
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
//
//}
