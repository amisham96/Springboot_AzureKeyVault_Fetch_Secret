package com.myapp.keyvault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyVaultController {

	@Value("${spring.datasource.url}")
	private String connectionString;

	@Value("${spring.datasource.username}")
	private String dbuser;

	@Value("${spring.datasource.password}")
	private String dbpass;

	@GetMapping("/getsecret")
	public String get() {
		System.out.println("\nYour Stored Secret Key is " + connectionString + " " + dbuser + " " + dbpass);
		return "Your Stored Secret Key is " + connectionString + " " + dbuser + " " + dbpass;
	}

}