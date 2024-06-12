package com.rishiSpring.withoutBoot.config;


import com.rishiSpring.withoutBoot.web.AuthController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SecurityConfig {

    @Bean
    public AuthController authController(){
        return new AuthController();
    }
}
