package com.demo.service;

import java.util.List;

import com.demo.dao.entry.User;

/**
 * @Author:anxindong
 * @Date:2019/10/20 0020
 * @Description:
 */
public interface UserService {
    public List<User> getUsers(String name);
    public int insertUser(User user);
}
