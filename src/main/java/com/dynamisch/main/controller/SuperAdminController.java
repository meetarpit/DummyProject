package com.dynamisch.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.dynamisch.main.model.SuperAdmin;
import com.dynamisch.main.service.SuperAdminService;

@Controller
public class SuperAdminController {
	
	@Autowired
	SuperAdminService superAdminService;

	@GetMapping("/")
	public String login(Model model) {
		model.addAttribute("super",new SuperAdmin());
		return "superAdminlogin";	
	}
	@PostMapping("/superAdminloginProcess")
	public String superAdminDoLogin(Model model,SuperAdmin superAdmin) {
		boolean result=superAdminService.validate(superAdmin);
		if(result==true) {
			return "redirect:/adminloginPage";
		}
		model.addAttribute("super",new SuperAdmin());
		return "superAdminlogin";
		
	}
}
