/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.todoapi.controllers;

import com.sg.todoapi.data.ToDoDao;
import com.sg.todoapi.models.ToDo;
import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Nickee Coco
 */

@RestController
@RequestMapping("/api/todo")
public class ToDoController {
    
    private final ToDoDao dao;
    
    public ToDoController(ToDoDao dao) {
        this.dao = dao;
    }
    
    @GetMapping
    public List<ToDo> all() {
        return dao.getAll();
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<ToDo> findById(@PathVariable int id) {
        ToDo result = dao.findById(id);
        if(result == null) {
            return new ResponseEntity(null, HttpStatus.NOT_FOUND);
        }
        return ResponseEntity.ok(result);
    }
    
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ToDo create(@RequestBody ToDo todo) {
        return dao.add(todo);
    }
    
    @PutMapping("/{id}")
    public ResponseEntity update(@PathVariable int id, @RequestBody ToDo todo) {
        ResponseEntity response = new ResponseEntity(HttpStatus.NOT_FOUND);
        if(id != todo.getId()){
            response = new ResponseEntity(HttpStatus.UNPROCESSABLE_ENTITY);
        } else if(dao.update(todo)) {
            response = new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return response;
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable int id) {
        if(dao.deleteById(id)) {
            return new ResponseEntity(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }
    
}
