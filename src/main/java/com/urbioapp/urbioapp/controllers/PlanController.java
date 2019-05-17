package com.urbioapp.urbioapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PlanController {
	@RequestMapping("/createPlan")
	public String form() {
		return "plan/formPlan";
	}
	
}
