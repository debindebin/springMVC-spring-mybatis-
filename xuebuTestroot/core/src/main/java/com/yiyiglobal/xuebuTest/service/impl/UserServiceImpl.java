package com.yiyiglobal.xuebuTest.service.impl;


import com.yiyiglobal.xuebuTest.domin.UserT;
import com.yiyiglobal.xuebuTest.mapper.GiftMapper;
import com.yiyiglobal.xuebuTest.mapper.GiftUserMapper;
import com.yiyiglobal.xuebuTest.mapper.UserTMapper;
import com.yiyiglobal.xuebuTest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements IUserService {

     @Autowired
    UserTMapper  userTMapper;

    @Autowired
    GiftMapper giftMapper;

    @Autowired
    GiftUserMapper giftUserMapper;


    public  UserT  getUserById(Integer id){

        return  userTMapper.selectByPrimaryKey(id);
    }


}
