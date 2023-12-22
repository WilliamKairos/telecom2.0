package com.telecommunications.service;

import com.telecommunications.pojo.admin.User;

import java.util.List;

public interface UserService {
    User findUser(String username, String password);

    List<User> getAll();

    User findUserByName(User user);

    int add(User user);

    int delete(User user);

    int update(User user);

}
