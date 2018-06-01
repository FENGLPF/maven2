package com.ssm.service;

import com.ssm.model.User;

public interface UserService {
	public User getUserById(int uId);
	
	public int register(String uName,String uPassword);
	
	public User login(String uName,String uPassword);
}
