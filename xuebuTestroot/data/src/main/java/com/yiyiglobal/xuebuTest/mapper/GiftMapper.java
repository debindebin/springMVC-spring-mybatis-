package com.yiyiglobal.xuebuTest.mapper;

import com.yiyiglobal.xuebuTest.domin.Gift;

public interface GiftMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Gift record);

    int insertSelective(Gift record);

    Gift selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Gift record);

    int updateByPrimaryKey(Gift record);
}