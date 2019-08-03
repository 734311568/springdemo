/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.springdemo.controller;

import com.example.springdemo.Userservice.UserService;
import com.example.springdemo.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 *
 * @author 73431
 */
@Controller
@RequestMapping("/controller")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping("/user")
	
	public String getUser(Model model) {
		List<User> queryUser = userService.queryUser();
		 model.addAttribute("queryUser",queryUser);
		return "userList";
	}
}
