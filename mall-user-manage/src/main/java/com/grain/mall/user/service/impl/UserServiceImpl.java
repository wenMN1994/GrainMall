package com.grain.mall.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.grain.mall.bean.UserAddress;
import com.grain.mall.bean.UserInfo;
import com.grain.mall.service.UserService;
import com.grain.mall.user.mapper.UserAddressMapper;
import com.grain.mall.user.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author：Dragon Wen
 * @email：18475536452@163.com
 * @date：Created in 2020/3/16 22:30
 * @description：
 * @modified By：
 * @version: $
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        // 调用mapper
        // select * from userAddress where userId=?
        UserAddress userAddress = new UserAddress();
        userAddress.setUserId(userId);
        return userAddressMapper.select(userAddress);
    }
}

