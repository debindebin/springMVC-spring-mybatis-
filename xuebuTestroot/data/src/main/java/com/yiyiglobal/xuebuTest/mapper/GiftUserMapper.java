package com.yiyiglobal.xuebuTest.mapper;

import com.yiyiglobal.xuebuTest.domin.GiftUser;

public interface GiftUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GiftUser record);

    int insertSelective(GiftUser record);

    GiftUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GiftUser record);

    int updateByPrimaryKey(GiftUser record);
}