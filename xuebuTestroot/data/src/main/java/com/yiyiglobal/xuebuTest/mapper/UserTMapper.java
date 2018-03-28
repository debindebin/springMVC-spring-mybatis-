package com.yiyiglobal.xuebuTest.mapper;

import com.yiyiglobal.xuebuTest.domin.UserT;
import org.springframework.stereotype.Repository;

@Repository
public interface UserTMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserT record);

    int insertSelective(UserT record);

    UserT selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserT record);

    int updateByPrimaryKey(UserT record);
}