package com.myapp.keyvault.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KeyVaultController {

	@Value("${connectionString}")
	private String connectionString;

	@GetMapping("/getsecret")
	public String get() {
		return "Your Stored Secret Key is " + connectionString;
	}

}