package com.demo.web.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSONObject;
import com.demo.dao.entry.User;
import com.demo.service.UserService;

/**
 * @Author:anxindong
 * @Date:2019/10/20 0020
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    private static Logger logger = LoggerFactory.getLogger(UserController.class);
    @Autowired
    private UserService userService;
    @RequestMapping("/query")
    @ResponseBody
    public String getUsers(String name){
        List<User> userList = userService.getUsers(name);
        logger.info(JSONObject.toJSONString(userList));
        return JSONObject.toJSONString(userList);
    }
    @RequestMapping("/insert")
    @ResponseBody
    public int insert(){
        User userBo = new User();
        userBo.setUserName("test");
        userBo.setPassword("123456");
        return userService.insertUser(userBo);
    }
  }
