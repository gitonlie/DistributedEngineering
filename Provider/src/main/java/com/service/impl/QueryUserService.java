package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.UserMapper;
import com.entity.User;
import com.service.IQueryUserService;
@Service
public class QueryUserService implements IQueryUserService {
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User queryUserInfo(User user) {
		User u = userMapper.queryUser(user);
		return u;
	}

}
