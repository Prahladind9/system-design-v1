package com.edu.todo.helloworld;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class HelloWorldController {

    @RequestMapping(method = RequestMethod.GET, path = "/hello-world-traditional")
    public String helloWorldTraditional() {
        return "Namaste!!";
    }

    @GetMapping(path = "/hello-world")
    public String helloWorld() {
        return "Hello World";
    }

    @GetMapping("hello-world-bean")
    public HelloWorldBean helloWorldBean() {
//        throw new RuntimeException("Unknown Error");
        return new HelloWorldBean("Hello World");
    }

    //http://localhost:8080/hello-world/path-variable/Rao
    @GetMapping("/hello-world/path-variable/{name}")
    public HelloWorldBean helloWorldBean(@PathVariable String name) {
        return new HelloWorldBean(String.format("HelloWorld, %s", name));
    }
}
