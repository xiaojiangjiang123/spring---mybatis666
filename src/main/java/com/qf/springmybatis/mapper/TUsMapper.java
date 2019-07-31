package com.qf.springmybatis.mapper;

import com.qf.springmybatis.entity.TUs;
import org.apache.ibatis.annotations.Param;

public interface TUsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TUs record);

    int insertSelective(TUs record);

    TUs selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TUs record);

    int updateByPrimaryKey(TUs record);
}