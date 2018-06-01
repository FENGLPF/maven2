package com.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/message")
public class MessageController {

	public static Logger logger = Logger.getLogger(MessageController.class);
	
	@RequestMapping("list")
	public String list(){
		return "mylayui/main";
	}
}
