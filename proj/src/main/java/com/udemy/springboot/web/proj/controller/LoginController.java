package com.udemy.springboot.web.proj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.udemy.springboot.web.proj.service.LoginService;



@Controller
@SessionAttributes("name")
public class LoginController {

	@Autowired
	LoginService service;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String showLoginPage(ModelMap model) {
		model.put("name", "in28Minutes");
		return "welcome";
	}

}