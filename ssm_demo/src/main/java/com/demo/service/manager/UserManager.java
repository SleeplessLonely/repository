package com.demo.service.manager;

import com.demo.dao.entry.User;
import com.demo.dao.entry.UserExample;
import com.demo.dao.mapper.UserMapper;
import com.demo.service.bo.UserBo;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * <li>Title:</li>
 * <li>Description:</li>
 * <li>Copyright: Copyright (c) 2019/11/19</li>
 * <li>Company: Sunshine Insurance Group Co., Ltd.</li>
 *
 * @version 1.0 修改记录： 修改序号，修改日期，修改人，修改内容
 * @Author: anxindong
 */
@Component
public class UserManager {
    private static Logger logger = LoggerFactory.getLogger(UserManager.class);
    @Autowired
    private UserMapper userMapper;

    public List<User> getUserList(String name){
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        if(StringUtils.isNotBlank(name)){
            criteria.andUserNameLike(name);
        }
        return userMapper.selectByExample(example);

    }
    @Transactional
    public int insert(User user) {
        int count = userMapper.insert(user);
        logger.info("成功插入数据{}条",count);
        return count;
    }
}
