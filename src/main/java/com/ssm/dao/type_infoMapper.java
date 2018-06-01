package com.ssm.dao;

import com.ssm.model.type_info;
import com.ssm.model.type_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface type_infoMapper {
    int countByExample(type_infoExample example);

    int deleteByExample(type_infoExample example);

    int deleteByPrimaryKey(Integer tId);

    int insert(type_info record);

    int insertSelective(type_info record);

    List<type_info> selectByExampleWithRowbounds(type_infoExample example, RowBounds rowBounds);

    List<type_info> selectByExample(type_infoExample example);

    type_info selectByPrimaryKey(Integer tId);

    int updateByExampleSelective(@Param("record") type_info record, @Param("example") type_infoExample example);

    int updateByExample(@Param("record") type_info record, @Param("example") type_infoExample example);

    int updateByPrimaryKeySelective(type_info record);

    int updateByPrimaryKey(type_info record);
}