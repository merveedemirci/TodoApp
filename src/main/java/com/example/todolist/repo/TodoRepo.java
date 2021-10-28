package com.example.todolist.repo;

import com.example.todolist.model.TodoItems;
import org.springframework.data.jpa.repository.JpaRepository;



public interface TodoRepo extends JpaRepository<TodoItems,Long> {
}
