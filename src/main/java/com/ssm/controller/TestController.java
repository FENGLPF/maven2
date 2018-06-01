package com.ssm.controller;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.User;
import com.ssm.service.UserService;

@Controller
@RequestMapping("/test")
public class TestController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	
	
	@RequestMapping("getUser2")
	@ResponseBody 
	public User getUser2(@RequestBody User user){
		int uId = user.getuId();
		User user1  = userService.getUserById(uId);
		logger.info("test");
		return user1;
	}
	
	@RequestMapping("/websocket")
	public String showWebSocekt(){
		return "test/websocket";
	}
}
