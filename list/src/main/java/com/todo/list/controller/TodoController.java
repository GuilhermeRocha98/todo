package com.todo.list.controller;

import com.todo.list.model.Todo;
import com.todo.list.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/todos")
public class TodoController {

    @Autowired
    private TodoRepository repository;

    @PostMapping
    public Todo save(@RequestBody Todo todo){
        return repository.save(todo);
    }

    @GetMapping("{id}")
    public Todo getById(Long id){
        return repository.findById(id).orElseThrow(()->new ResponseStatusException(HttpStatus.NOT_FOUND));
    }
}
