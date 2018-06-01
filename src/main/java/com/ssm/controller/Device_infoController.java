package com.ssm.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.text.ParseException;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.model.Device_info;
import com.ssm.service.Device_infoService;

@Controller
@RequestMapping("/Device")
public class Device_infoController {
	private static Logger logger = Logger.getLogger(Device_infoController.class);
	
	@Resource
	private Device_infoService device_infoService;
	
	@RequestMapping("/allDevice")
	@ResponseBody
	public List<Device_info> showAllDevice_infos(){
		return device_infoService.getAllDevice_infos();
	}
	
	@RequestMapping("/entry")
	public String entryDevice(){
		return "swm/AllDevice";
	}
	
	/**
	 * 显示所有设备
	 * @param page
	 * @param model
	 * @return
	 * @throws ParseException
	 */
	@RequestMapping("/pageHelper")
	public String pageHelper(@RequestParam(required=true,defaultValue="1")Integer page,Model model) throws ParseException{
		PageHelper.startPage(page,10);
		List<Device_info> deviceList = device_infoService.getAllDevice_infos();
		PageInfo<Device_info> pageInfo = new PageInfo<Device_info>(deviceList);
		model.addAttribute("page",pageInfo);
		model.addAttribute("deviceList",deviceList);
		return "swm/AllDevice";
	}
	
	@RequestMapping("/updateDeviceName")
	public String updateDeviceName(HttpServletRequest request) throws IOException{
		request.setCharacterEncoding("utf-8");
		String dName = request.getParameter("dName");
		String dSn = request.getParameter("dSn");
		logger.info(dName);
		int res = device_infoService.updateDeviceName(dName, dSn);
		return "redirect:/Device/pageHelper";
	}
	
	@RequestMapping("toUpdateDeviceName")
	public String toUpdateDeviceName(){
		return "swm/updateDeviceName";
	}
	
}
