package com.ssm.dao;

import com.ssm.model.Device_info;
import com.ssm.model.Device_infoExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.session.RowBounds;

public interface Device_infoMapper {
	
	int updateDeviceName(@Param("dName")String dName,@Param("dSn")String dSn);
	
	List<Device_info> getAllDevice();
	
    int countByExample(Device_infoExample example);

    int deleteByExample(Device_infoExample example);

    int deleteByPrimaryKey(Integer dId);

    int insert(Device_info record);

    int insertSelective(Device_info record);

    List<Device_info> selectByExampleWithRowbounds(Device_infoExample example, RowBounds rowBounds);

    List<Device_info> selectByExample(Device_infoExample example);

    Device_info selectByPrimaryKey(Integer dId);

    int updateByExampleSelective(@Param("record") Device_info record, @Param("example") Device_infoExample example);

    int updateByExample(@Param("record") Device_info record, @Param("example") Device_infoExample example);

    int updateByPrimaryKeySelective(Device_info record);

    int updateByPrimaryKey(Device_info record);
}