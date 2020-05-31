package com.demo.dao.mapper;

import com.demo.dao.entry.LoginLog;
import com.demo.dao.entry.LoginLogExample;
import java.util.List;

public interface LoginLogMapper {
    int deleteByPrimaryKey(Integer loginLogId);

    int insert(LoginLog record);

    int insertSelective(LoginLog record);

    List<LoginLog> selectByExample(LoginLogExample example);

    LoginLog selectByPrimaryKey(Integer loginLogId);

    int updateByPrimaryKeySelective(LoginLog record);

    int updateByPrimaryKey(LoginLog record);
}