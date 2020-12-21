package com.scott.human.humancontroller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HumanController {

	@RequestMapping("/")
	public String index(@RequestParam(value="name", required=false, defaultValue="Human") String name, @RequestParam(value="lname", required=false, defaultValue="") String lName,  Model model) {
		model.addAttribute("name", name);
		model.addAttribute("lname", lName);
		return "index.jsp"; 
	}
}
