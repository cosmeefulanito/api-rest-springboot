package com.prueba.apirest.Service;

import com.prueba.apirest.Entity.User;
import com.prueba.apirest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository repository;

    @Override
    @Transactional(readOnly = true)
    public List<User> findAll() {
        return (List<User>) repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User findOne(Integer id){
        return repository.findById(id).orElseGet(null);
    }

    @Override
    @Transactional(readOnly = true)
    public void save(User user){
        repository.save(user);
    }

}
