package com.edu.todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class TodoResource {

    @Autowired
    private TodoHardcodedService todoHardcodedService;

    @GetMapping(path = "/users/{username}/todos")
    public List<Todo> getAllTodos(@PathVariable String username) {
        return this.todoHardcodedService.findAll();
    }

    @GetMapping(path = "/users/{username}/todos/{id}")
    public Todo getAllTodos(@PathVariable String username ,@PathVariable long id) {
        return this.todoHardcodedService.findById(id);
    }

    @PutMapping(path = "/users/{username}/todos/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable String username,
                            @PathVariable long id,
                            @RequestBody Todo todo) {

        Todo updateTodo = this.todoHardcodedService.save(todo);
        return new ResponseEntity<Todo>(updateTodo, HttpStatus.OK);
    }

    @PostMapping(path = "/users/{username}/todos")
    public ResponseEntity<Todo> saveTodo(@PathVariable String username,
                                           @RequestBody Todo todo) {

        Todo saveTodo = this.todoHardcodedService.save(todo);
        return new ResponseEntity<Todo>(saveTodo, HttpStatus.OK);
    }


    @DeleteMapping("/users/{username}/todos/{id}")
    public ResponseEntity<Void> deleteTodo(@PathVariable String username, @PathVariable long id){
        Todo todo = this.todoHardcodedService.deleteById(id);
        if(todo != null){
            return ResponseEntity.noContent().build();
        }

        return ResponseEntity.notFound().build();
    }
}
