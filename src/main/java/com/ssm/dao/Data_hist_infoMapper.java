package com.ssm.dao;

import com.ssm.model.Data_hist_info;
import com.ssm.model.Data_hist_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Data_hist_infoMapper {
    int countByExample(Data_hist_infoExample example);

    int deleteByExample(Data_hist_infoExample example);

    int deleteByPrimaryKey(Integer dhId);

    int insert(Data_hist_info record);

    int insertSelective(Data_hist_info record);

    List<Data_hist_info> selectByExampleWithRowbounds(Data_hist_infoExample example, RowBounds rowBounds);

    List<Data_hist_info> selectByExample(Data_hist_infoExample example);

    Data_hist_info selectByPrimaryKey(Integer dhId);

    int updateByExampleSelective(@Param("record") Data_hist_info record, @Param("example") Data_hist_infoExample example);

    int updateByExample(@Param("record") Data_hist_info record, @Param("example") Data_hist_infoExample example);

    int updateByPrimaryKeySelective(Data_hist_info record);

    int updateByPrimaryKey(Data_hist_info record);
}