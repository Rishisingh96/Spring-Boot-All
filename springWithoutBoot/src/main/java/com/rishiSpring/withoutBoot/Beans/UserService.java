package com.rishiSpring.withoutBoot.Beans;

import org.springframework.stereotype.Component;

@Component
public class UserService {
    public void saveUser() {
        System.out.println("user is saved successfully");
    }
}
