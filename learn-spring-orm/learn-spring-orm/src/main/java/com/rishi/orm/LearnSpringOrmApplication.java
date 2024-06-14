package com.rishi.orm;

import com.rishi.orm.entities.User;
import com.rishi.orm.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnSpringOrmApplication implements CommandLineRunner {

	@Autowired
	private UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(LearnSpringOrmApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		User user = new User();
		user.setName("Rishi singh");
		user.setCity("Basti");
		user.setAge(22);
		User saveUser = userService.saveUser(user);
		userService.saveUser(saveUser);
	}
}
