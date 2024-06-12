package com.rishi.todo;

import com.rishi.todo.dao.TodoDao;


import com.rishi.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Date;
import java.util.List;

@SpringBootApplication
public class TodoManagerApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(TodoManagerApplication.class);
	@Autowired
	private TodoDao todoDao;
	public static void main(String[] args) {
		SpringApplication.run(TodoManagerApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Application Started......");
//		JdbcTemplate template = todoDao.getTemplate();
//		logger.info("Template Object : {}",template);  //Template Object : org.springframework.jdbc.core.JdbcTemplate@23cb2935
//		logger.info("Template Object : {}",template.getDataSource());  //Template Object : org.springframework.jdbc.core.JdbcTemplate@23cb2935

//		Todo todo = new Todo();
//		todo.setId(13);
//		todo.setTitle("Java course Learn ");
//		todo.setContent(" Learn Advance Java");
//		todo.setStatus("PENDING");
//		todo.setAddedDate(new Date());
//		todo.setToDoDate(new Date());
//
//		todoDao.saveTodo(todo);

		//getTodo
//		Todo todo = todoDao.getTodo(123);
//		logger.info("TODO :{}",todo);

//		//getTodo using RowMapper
//		Todo todo = todoDao.getTodo(13);
//		logger.info("TODO :{}",todo);

//		update Todo
//		Todo todo = todoDao.getTodo(1235);
//		logger.info("TODO :{}",todo);
//		todo.setTitle("Learn SpringBoot course");
//		todo.setContent("I have learn Spring Boot");
//		todo.setStatus("Done");
//		todo.setAddedDate(new Date());
//		todo.setToDoDate(new Date());
//		todoDao.updateTodo(1235,todo);

		//get all todos
//		List<Todo> allTodos  = todoDao.getAllTodos();
//		logger.info("ALL TODOS : {}",allTodos);

		//get all todos using RowMaper
//		List<Todo> allTodos  = todoDao.getAllTodos();
//		logger.info("ALL TODOS : {}",allTodos);

		//Delete todo
//		todoDao.deleteTodo(123);

		//Delete Multiple
//		todoDao.deleteMultiple(new int[]{1236});
//		System.out.println("Deleting todos from Database.........");
		Todo todo = todoDao.getTodo(85372930);
		logger.info("{}",todo);
		List<Todo> allTodos = todoDao.getAllTodos();
		logger.info("{}",allTodos);
	}
}
