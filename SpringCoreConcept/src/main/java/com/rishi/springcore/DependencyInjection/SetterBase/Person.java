//package com.rishi.springcore.DependencyInjection.SetterBase;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Component;
//
////@Component
//@Component("person")
//public class Person {
//
//
//    Student student;
//    Animal animal;
//
//
//    //using autowired on setter:animal
//    public Student getStudent() {
//
//        return student;
//    }
//
//    @Autowired
//    public void setStudent(Student student) {
//        System.out.println("setting Student.....");
//        this.student = student;
//    }
//
//    public Animal getAnimal() {
//        return animal;
//    }
//
//    @Autowired
//    public void setAnimal(Animal animal) {
//        System.out.println("setting Animal.....");
//        this.animal = animal;
//    }
//
//    public  void playWithAnimal(){
//        //using animal
//        animal.play();
//        student.Detials();
//    }
//}
