package com.example.alibabaCloud.service.impl;



import com.example.alibabaCloud.mappers.MVCMybatisDemoUserMapper;
import com.example.alibabaCloud.mappers.entry.MVCMybatisDemoUser;
import com.example.alibabaCloud.service.DTO.UserDTO;
import com.example.alibabaCloud.service.GetUserInfoService;
import com.example.alibabaCloud.service.bo.UserBO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;




/*
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 * @date 2020/10/27
 */

@RestController
public class GetUserInfoServiceImpl implements GetUserInfoService {

    @Resource
    protected MVCMybatisDemoUserMapper mVCMybatisDemoUserMapper;

    @Override
    public UserBO getUserInfoById(UserDTO param)
    {
        MVCMybatisDemoUser user = mVCMybatisDemoUserMapper.queryUserInfo(param.getName());
        UserBO bo = new UserBO();
        bo.setAge(user.getAge());
        return bo;
    }

    @Override
    public UserBO getUserInfoByName(String name) {
        //search by id, get UserInfo
        MVCMybatisDemoUser user = mVCMybatisDemoUserMapper.queryUserInfo(name);
        UserBO bo = new UserBO();
        bo.setAge(user.getAge());
        return bo;
    }
}
