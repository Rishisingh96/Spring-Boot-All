package com.rishi.mvc.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {

        @RequestMapping("/login")
        public String showLoginPageHandler(){
            System.out.println("success");
            return "Login";
        }

}
