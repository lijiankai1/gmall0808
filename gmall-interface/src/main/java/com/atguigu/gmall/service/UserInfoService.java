package com.atguigu.gmall.service;

import com.atguigu.gmall.bean.UserAddress;
import com.atguigu.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService{
    public List<UserInfo> findAll();
    public List<UserAddress> findAddressByUserId(String userId);
}
