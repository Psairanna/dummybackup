package com.zoho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zoho.entity.Lead;
import com.zoho.service.Leadservice;

@Controller
public class LeadController {

	@Autowired
	private Leadservice leadservice;
	
	@RequestMapping("/view")
	public String viewRegistration() {
		return "reg_page";
	}
	
	@RequestMapping("/register")
	public String savelead(@ModelAttribute("lead") Lead lead) {
		leadservice.saveOneLead(lead);
		return "reg_page";
	}
}
