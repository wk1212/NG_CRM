package com.ngcrm.mapper;

import com.ngcrm.model.TPlan;
import com.ngcrm.model.TPlanExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TPlanMapper {
    int countByExample(TPlanExample example);

    int deleteByExample(TPlanExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(TPlan record);

    int insertSelective(TPlan record);

    List<TPlan> selectByExample(TPlanExample example);

    TPlan selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") TPlan record, @Param("example") TPlanExample example);

    int updateByExample(@Param("record") TPlan record, @Param("example") TPlanExample example);

    int updateByPrimaryKeySelective(TPlan record);

    int updateByPrimaryKey(TPlan record);
}