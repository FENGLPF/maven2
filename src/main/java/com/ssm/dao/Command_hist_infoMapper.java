package com.ssm.dao;

import com.ssm.model.Command_hist_info;
import com.ssm.model.Command_hist_infoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface Command_hist_infoMapper {
    int countByExample(Command_hist_infoExample example);

    int deleteByExample(Command_hist_infoExample example);

    int deleteByPrimaryKey(Integer chId);

    int insert(Command_hist_info record);

    int insertSelective(Command_hist_info record);

    List<Command_hist_info> selectByExampleWithRowbounds(Command_hist_infoExample example, RowBounds rowBounds);

    List<Command_hist_info> selectByExample(Command_hist_infoExample example);

    Command_hist_info selectByPrimaryKey(Integer chId);

    int updateByExampleSelective(@Param("record") Command_hist_info record, @Param("example") Command_hist_infoExample example);

    int updateByExample(@Param("record") Command_hist_info record, @Param("example") Command_hist_infoExample example);

    int updateByPrimaryKeySelective(Command_hist_info record);

    int updateByPrimaryKey(Command_hist_info record);
}