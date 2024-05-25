package com.rishi.todo.controllers;

import com.rishi.todo.config.RISHIConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.Arrays;
import java.util.List;

@RestController
public class QuickAap {
    @Value("${rishi.profile.image.path}")
    private String profilePath;

    @Autowired
    private RISHIConfig rishiConfig;

    @RequestMapping("/todos")
    public List<String> justTest() {
        List<String> todos = Arrays.asList(

                "Learn Spring Boot",
                "Develop project",
                "Learn Django",
                "Learn Node JS",
                "Learn PHP"

        );
        return todos;
    }

    @RequestMapping("/profile-path")
    public String getProfilePath() {
        return this.profilePath;
    }

    @RequestMapping("/rishiConfig")
    public RISHIConfig getRishiConfig() {
        System.out.println(this.rishiConfig);
        return this.rishiConfig;
    }
}
