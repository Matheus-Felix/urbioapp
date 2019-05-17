package com.urbioapp.urbioapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/createUser")
	public String form() {
		return "user/formUser";
	}
}
