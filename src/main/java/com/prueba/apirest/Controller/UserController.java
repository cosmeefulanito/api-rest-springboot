package com.prueba.apirest.Controller;

import com.prueba.apirest.Entity.User;
import com.prueba.apirest.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService UService;

    @GetMapping("/users")
    public List<User> getUsers(){
        return UService.findAll();
    }

    @PostMapping("/user")
    public String save(@RequestBody User user){
        UService.save(user);
        return "OK";
    }

}
