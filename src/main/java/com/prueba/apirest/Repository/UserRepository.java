package com.prueba.apirest.Repository;

import com.prueba.apirest.Entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Integer> {
}
