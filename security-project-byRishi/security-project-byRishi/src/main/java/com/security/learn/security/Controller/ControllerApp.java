package com.security.learn.security.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
@RequestMapping("/api")
public class ControllerApp {

    //first end point
    @GetMapping("/route1")
    public String route1(Principal principal){
        return "This is protected route1 "+principal.getName();
    }

    //second protected endpoint
    @GetMapping("/route2")
    public String route2(){
        return "This is protected route1";
    }

}
