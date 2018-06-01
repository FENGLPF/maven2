package com.ssm.dao;

import com.ssm.model.Model_info;
import com.ssm.model.Model_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Model_infoMapper {
    int countByExample(Model_infoExample example);

    int deleteByExample(Model_infoExample example);

    int deleteByPrimaryKey(Integer mId);

    int insert(Model_info record);

    int insertSelective(Model_info record);

    List<Model_info> selectByExampleWithRowbounds(Model_infoExample example, RowBounds rowBounds);

    List<Model_info> selectByExample(Model_infoExample example);

    Model_info selectByPrimaryKey(Integer mId);

    int updateByExampleSelective(@Param("record") Model_info record, @Param("example") Model_infoExample example);

    int updateByExample(@Param("record") Model_info record, @Param("example") Model_infoExample example);

    int updateByPrimaryKeySelective(Model_info record);

    int updateByPrimaryKey(Model_info record);
}