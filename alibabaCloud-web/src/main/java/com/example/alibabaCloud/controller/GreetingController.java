package com.example.alibabaCloud.controller;


import com.example.alibabaCloud.service.DTO.UserDTO;
import com.example.alibabaCloud.service.GetUserInfoService;
import com.example.alibabaCloud.service.bo.UserBO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * @author paida 派哒 zeyu.pzy@alibaba-inc.com
 */
@RestController
@RequestMapping("/greet")
@RefreshScope
public class GreetingController {

	@Resource
	private GetUserInfoService getUserInfoService;

	@Value("${mydate:noHi}")
	private String say;


	@GetMapping("/sayhi")
	public String sayhi() {
		return say;
	}


	@RequestMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="1") String name) {
		UserDTO param = new UserDTO();
		param.setName(name);
		UserBO userBO = getUserInfoService.getUserInfoByName(name);
		//这里返回的数据类型是String，但实际上更多的数据通过本函数中Model model传给了前端。返回值String也会被SpringMVC整合为一个ModelAndView，以供前端使用。（Controller可以返回多种数值，比如void、String、ModelAndView。同学们可以自行搜索学习）
		return userBO.getAge() + "";
	}

	@RequestMapping("/greetName")
	public String greetName(@RequestBody UserDTO param) {
		UserBO userBO = getUserInfoService.getUserInfoById(param);
		//这里返回的数据类型是String，但实际上更多的数据通过本函数中Model model传给了前端。返回值String也会被SpringMVC整合为一个ModelAndView，以供前端使用。（Controller可以返回多种数值，比如void、String、ModelAndView。同学们可以自行搜索学习）
		return userBO.getAge() + "";
	}
}
