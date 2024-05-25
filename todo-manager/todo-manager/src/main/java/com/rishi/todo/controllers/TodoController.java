package com.rishi.todo.controllers;

import com.rishi.todo.models.Todo;
import com.rishi.todo.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Random;


@RestController
@RequestMapping("/todos")
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);
  @Autowired
   private TodoService todoService;

    Random random = new Random();
    //create
   @PostMapping
    public ResponseEntity<Todo> createTodoHandler(@RequestBody Todo todo){
        //create todo

       int id = random.nextInt(99999999);
       todo.setId(id);

       // create date with system default current date
       Date currentDate = new Date();
       logger .info("current date : {}",currentDate);
       todo.setAddedDate(currentDate);

        logger.info("Create Todo");
        //call service to create todo

        Todo todo1  = todoService.createTodo(todo);
        return new ResponseEntity<>(todo1, HttpStatus.CREATED);

       }
    //get all todo method
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler(){
        List<Todo>allTodos = todoService.getAllTodos();
        return new ResponseEntity<>(allTodos,HttpStatus.OK);
    }

    //get Single todo
    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(@PathVariable int todoId){
      Todo todo =  todoService.getTodo(todoId);
        return ResponseEntity.ok(todo);
    }

    //update todo
    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoHandler(@RequestBody Todo todoWithNewDetails,@PathVariable int todoId){
       Todo todo = todoService.updateTodo(todoId,todoWithNewDetails);
         return  ResponseEntity.ok(todo);
   }
   //Delete todo
    @DeleteMapping("/{todoId}")
    public  ResponseEntity<String> deleteTodo(@PathVariable int todoId){
        todoService.deleteTodo(todoId);
        return  ResponseEntity.ok("Todo Success fully Deleted");
        }
    }


/*
package com.rishi.todo.controllers;

import com.rishi.todo.models.Todo;
import com.rishi.todo.services.TodoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/todos")
public class TodoController {

    Logger logger = LoggerFactory.getLogger(TodoController.class);

    @Autowired
    private TodoService todoService;

    // Method to generate random ID
    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000000); // Generates random number between 0 (inclusive) and 999999 (inclusive)
    }

    // create
    @PostMapping
    public ResponseEntity<Todo> createTodoHandler(@RequestBody Todo todo) {
        logger.info("Create Todo");
        int id = generateRandomId();
        todo.setId(id);
        Todo createdTodo = todoService.createTodo(todo);
        return new ResponseEntity<>(createdTodo, HttpStatus.CREATED);
    }

    // get all todo method
    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodoHandler() {
        List<Todo> allTodos = todoService.getAllTodos();
        return new ResponseEntity<>(allTodos, HttpStatus.OK);
    }

    // get Single todo
    @GetMapping("/{todoId}")
    public ResponseEntity<Todo> getSingleTodoHandler(@PathVariable int todoId) {
        Todo todo = todoService.getTodo(todoId);
        return ResponseEntity.ok(todo);
    }

    // update todo
    @PutMapping("/{todoId}")
    public ResponseEntity<Todo> updateTodoHandler(@RequestBody Todo todoWithNewDetails, @PathVariable int todoId) {
        Todo todo = todoService.updateTodo(todoId, todoWithNewDetails);
        return ResponseEntity.ok(todo);
    }
}
*/
