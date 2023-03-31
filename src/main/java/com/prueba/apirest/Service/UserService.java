package com.prueba.apirest.Service;

import com.prueba.apirest.Entity.User;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service
public interface UserService {

    public List<User> findAll();

    //READ
    User findOne(Integer id);

    public void save(User user);

}
