package com.example.demo;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.io.Serializable;


public class UserData implements Serializable{
	@NotEmpty(message = "First Name cannot be empty")
	private String fName;
	
	@NotEmpty(message = "Last Name cannot be empty")
	private String lName;
	
	@NotEmpty(message = "User Name cannot be empty")
	private String username;
	
	@NotEmpty(message = "Email cannot be empty")
	@Email(message = "Please provide a valid email")
	private String email;
	
	@NotEmpty(message = "Password cannot be empty")
	private String password;
}
