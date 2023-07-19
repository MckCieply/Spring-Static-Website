package com.mckcieply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class FirstStaticApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstStaticApplication.class, args);
	}
	@GetMapping("/")
	public String landingPage(){
		return "Welcome on landing page";
	}

}
