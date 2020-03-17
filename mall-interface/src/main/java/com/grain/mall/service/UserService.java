package com.grain.mall.service;

import com.grain.mall.bean.UserAddress;
import com.grain.mall.bean.UserInfo;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/16 22:28
 * @description：
 * @modified By：
 * @version: $
 */
public interface UserService {

    /**
     * 查询所有数据
     * @return
     */
    List<UserInfo> findAll();

    /**
     * 根据userId 查询用户地址列表
     * @param userId
     * @return
     */
    List<UserAddress> getUserAddressList(String userId);
}
