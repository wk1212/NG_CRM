package com.ngcrm.mapper;

import com.ngcrm.model.TBase;
import com.ngcrm.model.TBaseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TBaseMapper {
    int countByExample(TBaseExample example);

    int deleteByExample(TBaseExample example);

    int deleteByPrimaryKey(Integer bid);

    int insert(TBase record);

    int insertSelective(TBase record);

    List<TBase> selectByExample(TBaseExample example);

    TBase selectByPrimaryKey(Integer bid);

    int updateByExampleSelective(@Param("record") TBase record, @Param("example") TBaseExample example);

    int updateByExample(@Param("record") TBase record, @Param("example") TBaseExample example);

    int updateByPrimaryKeySelective(TBase record);

    int updateByPrimaryKey(TBase record);
}