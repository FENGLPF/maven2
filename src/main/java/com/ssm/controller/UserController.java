package com.ssm.controller;

import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.User;
import com.ssm.service.UserService;
import com.ssm.util.dataUtil;

@Controller
@RequestMapping("/user")
public class UserController {
	private static Logger logger = Logger.getLogger(UserController.class);
	@Resource
	private UserService userService;
	
	@RequestMapping("/showUser")
	public String toIndex(HttpServletRequest request,Model model){
		int uId = Integer.parseInt(request.getParameter("id"));
		User user = this.userService.getUserById(uId);
		model.addAttribute("user",user);
		model.addAttribute("msg","hello");
		model.addAttribute("id",dataUtil.id);
		return "User";
	}
	
	@RequestMapping("/getUser")
	public String getUser(@RequestParam("id") String id,Model model){
		int uId = Integer.parseInt(id);
		User user = userService.getUserById(uId);
		model.addAttribute("user",user);
		model.addAttribute("id",dataUtil.id);
		return "User";
	}
	
	@RequestMapping("/getUser2")
	@ResponseBody 
	public User getUser2(@RequestBody User user){
		int uId = user.getuId();
		User user1  = userService.getUserById(uId);
		logger.info(user1);
		return user1;
	}
	
	@RequestMapping("/getName")
	@ResponseBody
	public User getName(Model model){
		return userService.getUserById(1); 
	}
	
	@RequestMapping("/showGetUser")
	public String showGetUser(){
		dataUtil.id=1;
		return "GetUser";
	}
	
	/**
	 * 注册
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("register")
	public String register(HttpServletRequest request,Model model){
		String uName = request.getParameter("uName");
		String uPassword = request.getParameter("uPassword");
		
		int res = userService.register(uName, uPassword);
		if(res>0){
			model.addAttribute("msg","注册成功");
		}
		else{
			model.addAttribute("msg","注册失败");
		}
		
		return "user/success";
	}
	
	/**
	 * 登录
	 * @param request
	 * @param model
	 * @return
	 */
	@RequestMapping("login")
	public String login(HttpServletRequest request,Model model){
		String uName = request.getParameter("uName");
		String uPassword = request.getParameter("uPassword");
		User user = userService.login(uName, uPassword);
		if(user==null){
			model.addAttribute("msg","用户或密码错误");
		}
		else {
			model.addAttribute("user",user);
		}
		return "index";
	}
	
	@RequestMapping("index")
	public String login(){	
		return "mylayui/index";
	}
	
	//跳转登录页
	@RequestMapping("showMylogin")
	public String showMylogin(){
		return "mylayui/mylogin";
	}
	
	@RequestMapping("mylogin")
	public String mylogin(HttpServletRequest request,Model model){
		String uName = request.getParameter("uName");
		String uPassword = request.getParameter("uPassword");
		User user = userService.login(uName, uPassword);
		if(user==null){
			model.addAttribute("msg","账号或密码错误");
			return "mylayui/mylogin";
		}
		else {
			model.addAttribute("user",user);
			return "mylayui/index";
		}
	}
	
	@RequestMapping("userInfo")
	public String userInfo(@RequestParam int uId,Model model){
		User user = userService.getUserById(uId);
		model.addAttribute("user",user);
		return "mylayui/userInfo";
	}
}
