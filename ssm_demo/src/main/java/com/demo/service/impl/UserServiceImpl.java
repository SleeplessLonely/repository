package com.demo.service.impl;

import com.demo.dao.entry.User;
import com.demo.service.UserService;
import com.demo.service.manager.UserManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:Administrator
 * @Date:2019/10/20 0020
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {
	private static Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
	@Autowired
	private UserManager userManager;

	public List<User> getUsers(String name) {
		logger.info("查询用户名为{}", name);
		List<User> userList = userManager.getUserList(name);
		if (userList == null || userList.isEmpty()) {
			return null;
		}
		return userList;
	}

	public int insertUser(User userBo) {
		User user = new User();
		BeanUtils.copyProperties(user, userBo);
		int count = userManager.insert(user);
		logger.info("insertUser成功插入数据{}条", count);
		return count;
	}
}
