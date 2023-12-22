package com.telecommunications.service.impl;

import com.telecommunications.mapper.admin.UserMapper;
import com.telecommunications.pojo.admin.User;
import com.telecommunications.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User findUser(String username, String password) {
        return userMapper.findUser(username, password);
    }

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public User findUserByName(User user) {
        return userMapper.findUserByName(user);
    }

    @Override
    public int add(User user) {
        return userMapper.add(user);
    }

    @Override
    public int delete(User user) {
        return userMapper.delete(user.getUserId());
    }

    @Override
    public int update(User user) {
        return userMapper.update(user);
    }

}
