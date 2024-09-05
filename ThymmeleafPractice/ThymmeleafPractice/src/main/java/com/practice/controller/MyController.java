package com.practice.controller;

import java.util.Date;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/about")
	public String about(Model model) {
		System.out.println("Inside about handler.........");

		// Putting data into the model
		model.addAttribute("name", "Rishi Singh");
		model.addAttribute("currentDate", new Date().toLocaleString());

		return "about"; // Thymeleaf template name
	}
}
