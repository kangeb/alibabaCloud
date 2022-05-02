package com.example.alibabaCloud.service;



import com.example.alibabaCloud.service.DTO.UserDTO;
import com.example.alibabaCloud.service.bo.UserBO;
import feign.Param;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


/*
 *
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 * @date 2020/10/27
 */

@FeignClient(value = "alibabaCloud-service", contextId = "GetUserInfoService")
//@FeignClient(value = "localhost", contextId = "GetUserInfoService")
@ResponseBody
public interface GetUserInfoService {

    @RequestMapping("/user/getUserInfo")
    UserBO getUserInfoById(@RequestBody UserDTO param);

    @GetMapping("/user/getUserInfo/str")
    UserBO getUserInfoByName(@RequestParam("name") String name);

}
