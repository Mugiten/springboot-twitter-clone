package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import java.util.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class TwitterCloneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TwitterCloneApplication.class, args);
//		BCryptPasswordEncoder bcryptPasswordEncoder = new BCryptPasswordEncoder();
//	    String pwd = bcryptPasswordEncoder.encode("spring123");
//	    System.out.println("Encrypted Password: " + pwd);
		
	}

}
