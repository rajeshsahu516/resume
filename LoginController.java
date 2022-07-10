package com.antra.demo.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.antra.demo.model.LoginCredentialsRequest;

@Controller
public class LoginController {
	
	@GetMapping( value = "/login" )
	public String  getLoginPage(Model model) {
		LoginCredentialsRequest  credentials = new LoginCredentialsRequest();
		model.addAttribute("credentials", credentials);
		return "Login";
	}
	
	@PostMapping( value = "/check" )
	public String checkLoginCredentials(@Valid @ModelAttribute(value = "credentials") LoginCredentialsRequest loginCredentials, BindingResult result, Model model) {
		
		if(result.hasErrors()) {
			return "Login";
		}
		else {
			
			String username = loginCredentials.getUsername();
			String password = loginCredentials.getPassword();
			if(username.equals("Antra") && password.equals("Boot@123")) {
				return "success";
			}
			
			else {
				model.addAttribute("message", "Bad Credentials");
				return "Login";
			}
		}
	}

}
