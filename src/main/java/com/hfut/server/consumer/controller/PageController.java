package com.hfut.server.consumer.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.hfut.domain.User;

@Controller
public class PageController {
	
	@GetMapping("login")
	public String login(ModelMap map) {
		User user=new User();
		map.addAttribute("user", user);
		return "login";
	}

}
