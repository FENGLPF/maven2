package com.ssm.dao;

import com.ssm.model.Model_function;
import com.ssm.model.Model_functionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Model_functionMapper {
    int countByExample(Model_functionExample example);

    int deleteByExample(Model_functionExample example);

    int insert(Model_function record);

    int insertSelective(Model_function record);

    List<Model_function> selectByExampleWithRowbounds(Model_functionExample example, RowBounds rowBounds);

    List<Model_function> selectByExample(Model_functionExample example);

    int updateByExampleSelective(@Param("record") Model_function record, @Param("example") Model_functionExample example);

    int updateByExample(@Param("record") Model_function record, @Param("example") Model_functionExample example);
}