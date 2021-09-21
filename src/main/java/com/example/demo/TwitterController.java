package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Controller
public class TwitterController{
	
	@RequestMapping("/")
	public String index(Model model) {
		//model.addAttribute("message", "Welcome to spring!");
		return "index";
	}
	
	@RequestMapping("/testing")
	public String testing(Model model) {
		model.addAttribute("message", "Welcome to spring boot!");
		return "testing";
	}
	
	@RequestMapping("/signup")
	public String signup(Model model) {
		return "signup";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
}