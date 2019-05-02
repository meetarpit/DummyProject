package com.dynamisch.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dynamisch.main.dao.AdminRepository;
import com.dynamisch.main.dao.RolesRepository;
import com.dynamisch.main.model.Admin;
import com.dynamisch.main.model.Roles;

@Controller
public class AdminController {

	@Autowired
	AdminRepository adminRepository;
	
	@Autowired
	RolesRepository rolesRepository;
	
	
	@GetMapping("/adminloginPage")
	public String login(Model model) {
		return "insertAdmin";	
	}
	@PostMapping("adminlogin")
	@ResponseBody
	public Admin adminLogin(@RequestBody Admin admin) {
		Admin response=adminRepository.save(admin);
		return response;		
	}
	
	
	
	@GetMapping("adminList")
	@ResponseBody
	public List<Admin> getAllAdmin(Model model) {
		List<Admin>admin=adminRepository.findAll();
		return  admin;		
	}
}
