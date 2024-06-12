package com.rishiSpring.withoutBoot.config;

import com.rishiSpring.withoutBoot.Beans.CartService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = {"com.rishiSpring.withoutBoot","another.world"}) // if we do not want  write this code in this place than we pass
@ComponentScan(basePackages = {"com.rishiSpring.withoutBoot"}) // if we do not want  write this code in this place than we pass
// than pass package name in context App.java file
public class AppConfig {

    //Bean for cartService
    @Bean("cartService1")
    public CartService cartService(){
        return new CartService();

        //
//    @Bean
//    public ViewResolver viewResolver(){
//        ViewResolver v=new ViewResolver();
//
//        return v;
//
//    }
    }
}
