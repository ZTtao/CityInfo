package pers.zhentao.cityinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping("/index")
	public String index(){
		return "indexTemp";
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login";
	}
}
