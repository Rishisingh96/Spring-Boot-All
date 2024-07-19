package com.rishi.todo.dao;

import com.rishi.todo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Integer > {

}
