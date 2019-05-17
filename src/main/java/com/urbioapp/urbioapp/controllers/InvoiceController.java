package com.urbioapp.urbioapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class InvoiceController {
	@RequestMapping("/send_invoice")
	public String form() {
		return "invoice/showInvoice";
	}
	
	
}
