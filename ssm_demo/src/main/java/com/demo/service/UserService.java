package com.demo.service;

import com.demo.dao.entry.User;
import com.demo.service.bo.UserBo;

import java.util.List;

/**
 * @Author:anxindong
 * @Date:2019/10/20 0020
 * @Description:
 */
public interface UserService {
    public List<User> getUsers(String name);
    public int insertUser(User user);
}
