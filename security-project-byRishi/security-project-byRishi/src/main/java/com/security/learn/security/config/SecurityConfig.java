package com.security.learn.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity(debug = true)
@Configuration
public class SecurityConfig {
    //configure security
  /*  @Bean
    public UserDetailsService userDetailsService(){
        //databases nhi user kar:
//        creating users
        UserDetails user1 = User.withDefaultPasswordEncoder()
                .username("rishi")
                .password("rishi")
                .roles("ADMIN","GUEST")
                .build();

        UserDetails user2 = User.withDefaultPasswordEncoder()
                .username("durgesh")
                .password("durgesh")
                .roles("ADMIN")
                .build();
        //creating in memory userdetaimanager: that is user details service implementation
        //providing user1 and user2 to userdetaildetail service
        InMemoryUserDetailsManager inMemoryUserDetailsService = new InMemoryUserDetailsManager(user1,user2);
        return inMemoryUserDetailsService;
    }*/

    //  we will use password encoder in future in project:
    // we will going to skip password encoder for this usecase

    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
