package com.scott.stringsproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class StringsprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringsprojectApplication.class, args);
	}
	
	@RequestMapping("/")
	public String index() {
		return "Hello Again";
	}

	@RequestMapping("/random")
	public String indexRandom() {
		return "Random message";
	}
}
