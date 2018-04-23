package com.beterch.easm.web.bussiness.user;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.beterch.easm.app.entity.User;

@Controller
@RequestMapping("/user")
public class UserController {
	Logger log = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/create")
	public String create(Model model) {
		return "user/users";
	}

	@RequestMapping("/save")
	public String save(@ModelAttribute("form") User user, Model model) { // user:视图层传给控制层的表单对象；model：控制层返回给视图层的对象
		log.info("user name:{}", user.getName());
		log.info("user age:{}",user.getAge());
		log.info("user password:{}",user.getPwd());
		model.addAttribute("user", user);
		return "user/user_detail";
	}
}
