package com.ssm.dao;

import com.ssm.model.Model_datatype;
import com.ssm.model.Model_datatypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Model_datatypeMapper {
    int countByExample(Model_datatypeExample example);

    int deleteByExample(Model_datatypeExample example);

    int insert(Model_datatype record);

    int insertSelective(Model_datatype record);

    List<Model_datatype> selectByExampleWithRowbounds(Model_datatypeExample example, RowBounds rowBounds);

    List<Model_datatype> selectByExample(Model_datatypeExample example);

    int updateByExampleSelective(@Param("record") Model_datatype record, @Param("example") Model_datatypeExample example);

    int updateByExample(@Param("record") Model_datatype record, @Param("example") Model_datatypeExample example);
}