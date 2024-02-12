package com.example.oauth2poc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@Import(SecurityConfig.class)
@SpringBootApplication
public class Oauth2pocApplication {

	public static void main(String[] args) {
		SpringApplication.run(Oauth2pocApplication.class, args);
	}

}
