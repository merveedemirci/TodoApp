package com.example.todolist.controller;

import com.example.todolist.model.TodoItems;
import com.example.todolist.repo.TodoRepo;
import com.sun.istack.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/todoApp")
public class TodoController {
    @Autowired
    private TodoRepo todoRepo;
    @GetMapping

    public List<TodoItems> findAll(){
        return todoRepo.findAll();


    }
    @PostMapping
    public TodoItems save(@Validated @NotNull @RequestBody  TodoItems todoItems){
        return todoRepo.save(todoItems);
    }


}
