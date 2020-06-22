package com.edu.todo.basicAuth;

import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class BasicAuthenticationController {

    @GetMapping(path = "/basicauth")
    public AuthenticationBean authenticationBean()
    {
        return new AuthenticationBean("You are authenticated");
    }


}
