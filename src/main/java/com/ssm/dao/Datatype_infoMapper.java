package com.ssm.dao;

import com.ssm.model.Datatype_info;
import com.ssm.model.Datatype_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Datatype_infoMapper {
    int countByExample(Datatype_infoExample example);

    int deleteByExample(Datatype_infoExample example);

    int deleteByPrimaryKey(Integer dtId);

    int insert(Datatype_info record);

    int insertSelective(Datatype_info record);

    List<Datatype_info> selectByExampleWithRowbounds(Datatype_infoExample example, RowBounds rowBounds);

    List<Datatype_info> selectByExample(Datatype_infoExample example);

    Datatype_info selectByPrimaryKey(Integer dtId);

    int updateByExampleSelective(@Param("record") Datatype_info record, @Param("example") Datatype_infoExample example);

    int updateByExample(@Param("record") Datatype_info record, @Param("example") Datatype_infoExample example);

    int updateByPrimaryKeySelective(Datatype_info record);

    int updateByPrimaryKey(Datatype_info record);
}