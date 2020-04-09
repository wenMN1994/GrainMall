package com.grain.mall.item.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.mall.bean.SkuInfo;
import com.grain.mall.service.ManageService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/31 15:58
 * @description：
 * @modified By：
 * @version: $
 */
@Controller
public class ItemController {

    @Reference
    private ManageService manageService;

    @RequestMapping("{skuId}.html")
    public String item(@PathVariable String skuId, HttpServletRequest request){

        // 根据skuId 获取数据
        SkuInfo skuInfo = manageService.getSkuInfo(skuId);

        // 保存到作用域
        request.setAttribute("skuInfo",skuInfo);
        return "item";
    }
}
