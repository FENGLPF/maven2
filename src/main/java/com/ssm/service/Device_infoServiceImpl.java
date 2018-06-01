package com.ssm.service;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ssm.dao.Device_infoMapper;
import com.ssm.model.Device_info;

@Service("Device_infoService")
public class Device_infoServiceImpl implements Device_infoService{
	private static Logger logger = Logger.getLogger(Device_infoServiceImpl.class);
	
	@Autowired
	private Device_infoMapper device_infoDao;

	@Transactional(readOnly=true) //数据库的读取方式为：只读
	@Override
	public List<Device_info> getAllDevice_infos() {
		return device_infoDao.getAllDevice();
	}

	@Override
	public Device_info getDevice_infoBySN(String sn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateDeviceName(String dName, String dSn) {
		// TODO Auto-generated method stub
		return device_infoDao.updateDeviceName(dName, dSn);
	}
}
