package com.rishi.mvc.Controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// This class is marked as a Controller
//@Controller
// This class is also annotated as a RestController, which implies that all handler methods return data that will be written directly to the HTTP response body
@RestController   //we use @RestController = Controller + ResponseBody than no use controller and ResponseBody
// This annotation specifies the base URL for all request mappings in this class
@RequestMapping("/api")
public class ApiControllerhttpMethod {
        @RequestMapping(value = "/hello",method = RequestMethod.GET)
        public String helloApi(){
            System.out.println("hello creating");
            return "Hello Rishi How are you?";
        }

        // This method handles GET requests to /users endpoint
        @RequestMapping(value = "/users",method = RequestMethod.GET)
        // This annotation indicates that the return value of this method should be written directly to the HTTP response body
        //@ResponseBody
        public List<String> getUserData(){
            return Arrays.asList("Ram", "Rishi","Durgesh sir");
        }
    @RequestMapping(value = "/create-user",method = RequestMethod.POST)
    public String createUser(){
        System.out.println("creating user");
        return "Hello Rishi I am creating user !!";
    }
    }


