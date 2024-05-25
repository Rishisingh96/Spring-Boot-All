package com.rishi.springcore.usingBeenAnotation;

import org.springframework.stereotype.Component;

@Component
public class Student {

    public Student(){
        System.out.println("I am Student Constructor");
    }
    public void Detials(){
        System.out.println("My name is Rishi singh. use Constructor Autowired");
    }
}
