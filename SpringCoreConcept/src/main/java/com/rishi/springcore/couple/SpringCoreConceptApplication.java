//package com.rishi.springcore;//package com.rishi.springcore;
//
//import com.rishi.springcore.couple.BeenQualifier.Animal;
//import com.rishi.springcore.couple.BeenQualifier.Person;
//import test.test;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
//
//import org.springframework.context.annotation.ComponentScan;
//
//@SpringBootApplication
//@ComponentScan(basePackages = {"com.rishi.springcore","test"}) // when we want to test package
//public class SpringCoreConceptApplication {
//	public static void main(String[] args) {
//
//
//        //about the beans
//        //@Component
//        //about the dependencies
//        //@Autowired
//        //where to scan for beans
//        //com.rishi.springcore.couple.Been
//        //@ComponentScan()
//
//
//        //About the Dependency
////		ConfigurableApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
//		ApplicationContext context = SpringApplication.run(SpringCoreConceptApplication.class, args);
//        Person personBeen = context.getBean(Person.class);
//        personBeen.playWithAnimal();
////        System.out.println(personBeen);
//
//		test testBean = context.getBean(test.class);
//		testBean.testing();
//		Animal cat = context.getBean("cat", Animal.class);
//		Animal dog = context.getBean("dog", Animal.class);
//		cat.play();
//		dog.play();
//	}
//
//}
