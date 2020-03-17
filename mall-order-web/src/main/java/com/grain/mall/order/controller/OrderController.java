package com.grain.mall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.mall.bean.UserAddress;
import com.grain.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/17 12:35
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class OrderController {

    @Reference
    private UserService userService;

    @RequestMapping("trade")
    @ResponseBody // 第一个返回json 字符串，fastJson.jar 第二直接将数据显示到页面！
    public List<UserAddress> trade(String userId){
        // 返回一个视图名称叫index.html
        return userService.getUserAddressList(userId);
    }
}
