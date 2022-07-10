package com.antra.demo.model;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class LoginCredentialsRequest {
	
	@NotEmpty
	@Size(min = 5, max = 12)
	private String username;
	
	@NotEmpty
	@Pattern(regexp = "^[A-Z][a-z]*@{1}[0-9]{3}")
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	

}
