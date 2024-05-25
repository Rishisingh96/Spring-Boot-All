package com.rishi.mvc.Controllers;


import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;



//@Component
//@RequestMapping
@Controller
public class RishiMan {
    /*
    *
    * /about
    * @RequestMapping is used for mapping the url with method
    * */
    @RequestMapping("/about")
    public String aboutRequestHandler(){
        System.out.println("Processing about request");
        return "About";
    }
    @RequestMapping("/rishi")
    public String rishiRequestHandler(){
        System.out.println("Processing rishi request success ");
        return "Rishi";
    }
    @RequestMapping("/services")
    public String servicesRequestHandler(){
        System.out.println("Processing service request success ");
        return "Services";
    }

}
