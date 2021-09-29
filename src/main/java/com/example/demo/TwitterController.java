package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class TwitterController{
	
	@Autowired
	private UserRepository userRepo;
	
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
	
	@GetMapping("/register")
	public String signup(Model model) {
		User user = new User();
		model.addAttribute("user", user);
		return "register";
	}
	
	@RequestMapping("/login")
	public String login(Model model) {
		return "login";
	}
	
	@PostMapping("/process_register")
	public String processRegister(User user) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		String encodedPassword = encoder.encode(user.getPassword());
		user.setPassword(encodedPassword);
		
		userRepo.save(user);
		
		return "register_success";
	}
}