package com.ssm.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.UserMapper;
import com.ssm.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	@Resource
	private UserMapper userDao;

	@Override
	public User getUserById(int uId) {
		// TODO Auto-generated method stub
		return this.userDao.selectByPrimaryKey(uId);
	}

	@Override
	public int register(String uName, String uPassword) {
		// TODO Auto-generated method stub
		return userDao.addUser(uName, uPassword);
	}

	@Override
	public User login(String uName, String uPassword) {
		// TODO Auto-generated method stub
		return userDao.findUserByNameAndPwd(uName, uPassword);
	}
	
}
