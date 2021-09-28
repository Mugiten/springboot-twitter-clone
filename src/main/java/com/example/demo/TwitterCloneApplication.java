package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import java.util.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class TwitterCloneApplication {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(TwitterCloneApplication.class, args);
//		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
//	    String pwd = bcryptPasswordEncoder.encode("spring123");
//	    System.out.println("Encrypted Password: " + pwd);
		
	}

}
