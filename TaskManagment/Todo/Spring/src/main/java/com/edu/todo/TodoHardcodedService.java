package com.edu.todo;

import lombok.EqualsAndHashCode;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TodoHardcodedService {
    private static List<Todo> todoList = new ArrayList<>();
    private static int idCounter = 0;

    static {
        todoList.add(new Todo(++idCounter, "Rao", "Learn to Dance", new Date(), false));
        todoList.add(new Todo(++idCounter, "Rao", "Learn about Microservices", new Date(), false));
        todoList.add(new Todo(++idCounter, "Rao", "Learn about Angular", new Date(), false));
    }

    public List<Todo> findAll() {
        return todoList;
    }

    public Todo save(Todo todo) {
        if(todo.getId() ==-1) {
            todo.setId(++idCounter);
            todo.setUsername("Rao");
            todoList.add(todo);
        }else{
            deleteById(todo.getId());
            todoList.add(todo);
        }
        return todo;
    }

    public Todo deleteById(long id){
        Todo todo = findById(id);
        if(todo == null) return null;

        if(todoList.remove(todo))
            return todo;

        return null;
    }

    public Todo findById(long id) {
        Optional<Todo> todo =
                todoList.stream().filter(t-> t.getId() == id).findFirst();
        if(todo.isPresent()){
         return todo.get();
        }
        return null;
    }

}
