package com.grain.mall.user.controller;

import com.grain.mall.bean.UserInfo;
import com.grain.mall.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/16 22:31
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    public List<UserInfo> findAll(){
        return userService.findAll();
    }

}
