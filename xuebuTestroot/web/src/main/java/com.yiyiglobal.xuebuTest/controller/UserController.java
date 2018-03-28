package com.yiyiglobal.xuebuTest.controller;

import com.yiyiglobal.xuebuTest.domin.UserT;
import com.yiyiglobal.xuebuTest.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zhangdebin on 2017/12/11.
 */
@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    IUserService userService;

    @RequestMapping("getUser")
    public String getUser(@RequestParam int  id, Model  model){
        UserT user = userService.getUserById(id);
        model.addAttribute("userName",user.getUserName());
        return  "user";
    }

    @RequestMapping("getGift")
    public String getGift(){
//        userService.getGift();
        return  "user";
    }

}
