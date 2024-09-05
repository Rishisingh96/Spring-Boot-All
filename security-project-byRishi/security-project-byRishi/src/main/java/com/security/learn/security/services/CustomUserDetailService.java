package com.security.learn.security.services;

import com.security.learn.security.entities.CustomUserDetail;
import com.security.learn.security.entities.User;
import com.security.learn.security.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class CustomUserDetailService {

    @Autowired
    private UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
        User user = userRepository.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("User not find Exception throw " + username));

        return new CustomUserDetail(user);
    }
}
