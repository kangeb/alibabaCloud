package com.example.alibabaCloud.service;



import com.example.alibabaCloud.service.DTO.UserDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 * @date 2020/10/27
 */

@FeignClient(value = "alibabaCloud-service", contextId = "GetUserInfoService")
@ResponseBody
public interface GetUserInfoService {

    @GetMapping("/user/getUserInfo")
    void getUserInfoById(@RequestBody UserDTO param);

}
