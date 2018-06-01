package com.ssm.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ssm.model.Data_view_info;
import com.ssm.service.Data_view_infoService;


@Controller
@RequestMapping("/dataViewInfo")
public class Data_view_infoController {
	private static Logger logger = Logger.getLogger(Data_view_infoController.class);
	
	@Resource
	private Data_view_infoService data_view_infoService;
	
	/**
	 * 获取设备数据详情
	 * @param request
	 * @return
	 */
	@RequestMapping("/getByDid")
	@ResponseBody
	public Map<Object, Object> getViewByDiD(HttpServletRequest request){
		List<Data_view_info> data_view_infos = data_view_infoService.selectBydId(Integer.parseInt(request.getParameter("dId")));
		Map<Object, Object> map = new HashMap<Object, Object>();
		for(Data_view_info data_view_info:data_view_infos){
			if(data_view_info.getDatatype_info().getDtName().equals("PANID")){
				map.put(data_view_info.getDatatype_info().getDtName(), 
						Integer.toHexString(Float.floatToIntBits(data_view_info.getDvData())).toUpperCase());
			}
			else{
				map.put(data_view_info.getDatatype_info().getDtName(), 
						data_view_info.getDvData()+data_view_info.getDatatype_info().getDtUnit());
			}
			
		}
		return map;
	}
}
