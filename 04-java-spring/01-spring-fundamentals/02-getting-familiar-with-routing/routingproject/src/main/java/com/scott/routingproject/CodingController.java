package com.scott.routingproject;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/coding/")
public class CodingController {
	@RequestMapping("/")
	public String index() {
		return "Hello coding Dojo";
	}
	
	@RequestMapping("/python")
	public String python() {
		return "Pyhton/Django was awesome";
	}
	
	@RequestMapping("/java")
	public String java() {
		return "Java/Spring is better";
	}
}
