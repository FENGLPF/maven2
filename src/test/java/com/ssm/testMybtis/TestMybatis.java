package com.ssm.testMybtis;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssm.dao.Device_infoMapper;
import com.ssm.model.Device_info;
import com.ssm.model.Device_infoExample;
import com.ssm.model.User;
import com.ssm.service.Device_infoService;
import com.ssm.service.Device_infoServiceImpl;
import com.ssm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-mybatis.xml"})
public class TestMybatis {
	private static Logger logger = Logger.getLogger(TestMybatis.class);
	
	@Resource
	private UserService userService=null;
	@Resource 
	private Device_infoService device_infoService=null;
	
	@Test
	public void test(){
		User user = userService.getUserById(1);
		logger.info(user.getuName());
		logger.info("user转json");
		logger.info(JSON.toJSONString(user));
	}
	
	@Test
	public void testDevice(){
		List<Device_info> deviceList = device_infoService.getAllDevice_infos();
		for (Device_info device_info : deviceList) {
			logger.info(device_info.getdSn());
		}
		logger.info(deviceList);
	}
}
