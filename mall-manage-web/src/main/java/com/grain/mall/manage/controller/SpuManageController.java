package com.grain.mall.manage.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.grain.mall.bean.SpuInfo;
import com.grain.mall.service.ManageService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/19 14:29
 * @description：
 * @modified By：
 * @version: $
 */
@RestController
@CrossOrigin
public class SpuManageController {

    @Reference
    private ManageService manageService;

    // http://localhost:8082/spuList?catalog3Id=63 实体类对象封装
    @RequestMapping("spuList")
    public List<SpuInfo> spuList(String catalog3Id){
        SpuInfo spuInfo = new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = manageService.getSpuList(spuInfo);
        return  spuInfoList;
    }

    @RequestMapping("saveSpuInfo")
    public void saveSpuInfo(@RequestBody SpuInfo spuInfo){

        if (spuInfo!=null){
            // 调用保存
            manageService.saveSpuInfo(spuInfo);
        }
    }
}
