package com.ssm.dao;

import com.ssm.model.Function_info;
import com.ssm.model.Function_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Function_infoMapper {
    int countByExample(Function_infoExample example);

    int deleteByExample(Function_infoExample example);

    int deleteByPrimaryKey(Integer fId);

    int insert(Function_info record);

    int insertSelective(Function_info record);

    List<Function_info> selectByExampleWithRowbounds(Function_infoExample example, RowBounds rowBounds);

    List<Function_info> selectByExample(Function_infoExample example);

    Function_info selectByPrimaryKey(Integer fId);

    int updateByExampleSelective(@Param("record") Function_info record, @Param("example") Function_infoExample example);

    int updateByExample(@Param("record") Function_info record, @Param("example") Function_infoExample example);

    int updateByPrimaryKeySelective(Function_info record);

    int updateByPrimaryKey(Function_info record);
}