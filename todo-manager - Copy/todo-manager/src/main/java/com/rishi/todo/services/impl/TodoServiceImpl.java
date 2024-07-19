package com.rishi.todo.services.impl;

import com.rishi.todo.exceptions.ResourceNotFoundException;
import com.rishi.todo.models.Todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//@Component
@Service
public class TodoServiceImpl implements com.rishi.todo.services.TodoService {

    Logger logger = LoggerFactory.getLogger(TodoServiceImpl.class);
    List<Todo> todos = new ArrayList<>();

    //create todo method
    public Todo createTodo(Todo todo){
        //create.......
        //change the logic
        todos.add(todo);
        logger.info("Todos {}", this.todos);
        return todo;
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodo(int todoId) {
        Todo todo = todos.stream().filter(t->todoId == t.getId()).findAny().orElseThrow(()->new ResourceNotFoundException("Todo not found with given ID", HttpStatus.NOT_FOUND));
//        Todo todo = todos.stream().filter(t->todoId == t.getId()).findAny().get();
        logger.info("TODO: {}",todo);
        return todo;
    }

    public Todo updateTodo(int todoId,Todo todo){
       List<Todo> newUpdateList = todos.stream().map(t ->{
            if(t.getId()==todoId){
                //perform update
                t.setTitle(todo.getTitle());
                t.setContent(todo.getContent());
                t.setStatus(todo.getStatus());
                return  t;
            }else {
                return t;
            }
        }).collect(Collectors.toList());
        todos= newUpdateList;
        todo.setId(todoId);
        return todo; //TODO: 12/05/2024
    }
    public void deleteTodo(int todoId){
        logger.info("DELETING TODO");
        List<Todo>newList = todos.stream().filter(t -> t.getId() !=todoId).collect(Collectors.toList() );
                todos = newList;
    }
}


// TodoService.java
/*package com.rishi.todo.services;

import com.rishi.todo.models.Todo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@Component
public class TodoService {

    Logger logger = LoggerFactory.getLogger(TodoService.class);
    private List<Todo> todos = new ArrayList<>();
    private static AtomicInteger idCounter = new AtomicInteger(0);

    // create todo method
    public Todo createTodo(Todo todo) {
        todo.setId(idCounter.incrementAndGet()); // Generate unique ID
        todos.add(todo);
        logger.info("Todos {}", this.todos);
        return todo;
    }

    public List<Todo> getAllTodos() {
        return todos;
    }

    public Todo getTodo(int todoId) {
        return todos.stream().filter(t -> todoId == t.getId()).findAny().orElse(null);
    }

    public Todo updateTodo(int todoId, Todo todo) {
        todos.forEach(t -> {
            if (t.getId() == todoId) {
                t.setTitle(todo.getTitle());
                t.setContent(todo.getContent());
                t.setStatus(todo.getStatus());
            }
        });
        todo.setId(todoId); // Ensure the ID is retained
        return todo;
    }
}*/