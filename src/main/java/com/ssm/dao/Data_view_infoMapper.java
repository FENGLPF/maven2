package com.ssm.dao;

import com.ssm.model.Data_view_info;
import com.ssm.model.Data_view_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Data_view_infoMapper {
	
	List<Data_view_info> selectBydId(int dId);
	
    int countByExample(Data_view_infoExample example);

    int deleteByExample(Data_view_infoExample example);

    int deleteByPrimaryKey(Integer dvId);

    int insert(Data_view_info record);

    int insertSelective(Data_view_info record);

    List<Data_view_info> selectByExampleWithRowbounds(Data_view_infoExample example, RowBounds rowBounds);

    List<Data_view_info> selectByExample(Data_view_infoExample example);

    Data_view_info selectByPrimaryKey(Integer dvId);

    int updateByExampleSelective(@Param("record") Data_view_info record, @Param("example") Data_view_infoExample example);

    int updateByExample(@Param("record") Data_view_info record, @Param("example") Data_view_infoExample example);

    int updateByPrimaryKeySelective(Data_view_info record);

    int updateByPrimaryKey(Data_view_info record);
}