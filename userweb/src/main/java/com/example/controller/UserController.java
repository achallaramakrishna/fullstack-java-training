package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.model.User;
import com.example.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/users")
	public String listUsers(Model model) {
		
		List<User> users = userService.getAllUsers();
		model.addAttribute("users",users);
		return "/users/list-users";
		
	}

}
