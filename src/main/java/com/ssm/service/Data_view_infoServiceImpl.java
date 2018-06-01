package com.ssm.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ssm.dao.Data_view_infoMapper;
import com.ssm.model.Data_view_info;

@Service("Data_view_infoService")
public class Data_view_infoServiceImpl implements Data_view_infoService{

	@Resource
	private Data_view_infoMapper data_view_infoMapper;
	
	@Override
	public List<Data_view_info> selectBydId(int dId) {
		// TODO Auto-generated method stub
		return data_view_infoMapper.selectBydId(dId);
	}

}
