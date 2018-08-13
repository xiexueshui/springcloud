package com.hfut.server.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hfut.domain.User;

@RefreshScope
@Controller
public class ConsumerController {

	@Autowired
	UserFeignService feignService;
	
	@PostMapping("/user/insert")
	@ResponseBody
	public String insertUser(@ModelAttribute(value="user")User user ) {
		int i=feignService.insert(user);
		if(i==0) {
			return "插入失败";
		}else if(i==-1) {
			return "熔断";
		}else {
			return user.toString();
		}
	}
	@PostMapping("/user/login")
	public String login(@ModelAttribute(value="user")User user,ModelMap map ) {
		List<User> users=feignService.select(user);
		if(users.size()==0) {
			return "exception";
		}else {
			users=feignService.select(new User());
			map.addAttribute("users", users);
			return "list";
		}
	}
}
