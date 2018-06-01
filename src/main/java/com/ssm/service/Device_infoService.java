package com.ssm.service;

import java.util.List;

import com.ssm.model.Device_info;

public interface Device_infoService {
	List<Device_info> getAllDevice_infos();
	Device_info getDevice_infoBySN(String sn);
	int updateDeviceName(String dName,String dSn);
}
