package edu.prahlad.casestudy.onlinebank.controller;

import edu.prahlad.casestudy.onlinebank.entity.Users;
import edu.prahlad.casestudy.onlinebank.model.CaseStudyException;
import edu.prahlad.casestudy.onlinebank.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("createUser")
    public Users createUser(@RequestBody Users users) throws CaseStudyException {
        return userService.createUser(users);
    }

    @PostMapping("validateUser")
    public Users validateUser(@RequestBody Users users) throws CaseStudyException{
        return userService.validateUser(users);
    }

    @PostMapping("getUser")
    public Users getUser(@RequestBody String userName) throws CaseStudyException {
        return userService.findByUsername(userName);
    }

    @GetMapping("getUsers")
    public List<Users> getUsers() throws CaseStudyException{
        return userService.getUserList();
    }

}
