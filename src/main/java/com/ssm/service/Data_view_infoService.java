package com.ssm.service;

import java.util.List;

import com.ssm.model.Data_view_info;

public interface Data_view_infoService {
	List<Data_view_info> selectBydId(int dId);
}
