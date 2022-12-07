package ru.kata.spring.boot_security.demo.dao;


import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserDao {
    User findByName(String username);
    void delete(int id);
    void update(User user);
    boolean add(User user);
    List<User> listUsers();
    User findById(int id);
}
