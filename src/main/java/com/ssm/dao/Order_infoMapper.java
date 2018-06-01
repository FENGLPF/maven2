package com.ssm.dao;

import com.ssm.model.Order_info;
import com.ssm.model.Order_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Order_infoMapper {
    int countByExample(Order_infoExample example);

    int deleteByExample(Order_infoExample example);

    int deleteByPrimaryKey(Integer oId);

    int insert(Order_info record);

    int insertSelective(Order_info record);

    List<Order_info> selectByExampleWithRowbounds(Order_infoExample example, RowBounds rowBounds);

    List<Order_info> selectByExample(Order_infoExample example);

    Order_info selectByPrimaryKey(Integer oId);

    int updateByExampleSelective(@Param("record") Order_info record, @Param("example") Order_infoExample example);

    int updateByExample(@Param("record") Order_info record, @Param("example") Order_infoExample example);

    int updateByPrimaryKeySelective(Order_info record);

    int updateByPrimaryKey(Order_info record);
}