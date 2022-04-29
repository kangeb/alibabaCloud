package com.example.alibabaCloud.service.impl;



import com.example.alibabaCloud.mappers.MVCMybatisDemoUserMapper;
import com.example.alibabaCloud.mappers.entry.MVCMybatisDemoUser;
import com.example.alibabaCloud.service.DTO.UserDTO;
import com.example.alibabaCloud.service.GetUserInfoService;
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
    public void getUserInfoById(UserDTO param)
    {


        //search by id, get UserInfo
        MVCMybatisDemoUser user = mVCMybatisDemoUserMapper.queryUserInfo(param.getName());
        model.addAttribute("name", user.getId())
                .addAttribute("age", user.getAge())
                .addAttribute("height", user.getHeight())
                .addAttribute("weight", user.getWeight());
    }
}
