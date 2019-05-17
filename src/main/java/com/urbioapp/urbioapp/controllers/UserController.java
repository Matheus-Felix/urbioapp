package com.urbioapp.urbioapp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.urbioapp.urbioapp.models.User;
import com.urbioapp.urbioapp.repository.UrbioappRepository;

@Controller
public class UserController {
	@Autowired
	private UrbioappRepository ur;
	
	@RequestMapping(value="/createUser", method=RequestMethod.GET)
	public String form() {
		return "user/formUser";
	}
	
	@RequestMapping(value="/createUser", method=RequestMethod.POST)
	public String form(User user) {
		
		ur.save(user);
		return "redirect:/createUser";
	}
}
