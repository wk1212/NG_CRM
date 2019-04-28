package com.ngcrm.mapper;

import com.ngcrm.model.TChance;
import com.ngcrm.model.TChanceExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TChanceMapper {
    int countByExample(TChanceExample example);

    int deleteByExample(TChanceExample example);

    int deleteByPrimaryKey(Long chno);

    int insert(TChance record);

    int insertSelective(TChance record);

    List<TChance> selectByExample(TChanceExample example);

    TChance selectByPrimaryKey(Long chno);

    int updateByExampleSelective(@Param("record") TChance record, @Param("example") TChanceExample example);

    int updateByExample(@Param("record") TChance record, @Param("example") TChanceExample example);

    int updateByPrimaryKeySelective(TChance record);

    int updateByPrimaryKey(TChance record);
}