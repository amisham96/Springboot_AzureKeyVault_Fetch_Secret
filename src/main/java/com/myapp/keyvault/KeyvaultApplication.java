package com.myapp.keyvault;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KeyvaultApplication implements CommandLineRunner {

	@Value("${connectionString}")
	private String connectionString;

	public static void main(String[] args) {
		SpringApplication.run(KeyvaultApplication.class, args);
	}

	@GetMapping("get")
	public String get() {
		return connectionString;
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("\nSecret stored in Azure Key Vault: \n" + connectionString);
	}

}