package com.demo.service;


import com.demo.dao.entry.User;
import com.demo.dao.entry.UserExample;
import com.demo.dao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:Administrator
 * @Date:2019/10/20 0020
 * @Description:
 */
@ContextConfiguration("classpath:spring/spring-*.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UserServiceTest  {
    @Autowired
    private UserMapper userMapper;
    @Test
    public void getUser(){
        UserExample example = new UserExample();
        example.createCriteria();
        List<User> users = userMapper.selectByExample(example);
        System.out.println(users.get(0).getUserName()+"-----"+users.get(0).getPassword());
    }
}
