package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;
import java.util.Set;

public interface UserDao {
    User findByName(String username);
    void delete(int id);
    void update(User user);
    boolean add(User user);
    Set<User> listUsers();
    User findById(int id);
}
