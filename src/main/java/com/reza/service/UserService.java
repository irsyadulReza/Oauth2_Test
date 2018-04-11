package com.reza.service;

import java.util.List;

import com.reza.model.User;



public interface UserService {

    User save(User user);

    List<User> findAll();

    void delete(long id);
}
