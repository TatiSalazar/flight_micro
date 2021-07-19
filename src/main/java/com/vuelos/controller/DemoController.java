package com.vuelos.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;



@Controller
public class DemoController {

	@GetMapping("/greeting")
	public String greeting(Model model) {
		
		model.addAttribute("titulo", "Hola Spring Framework");
		

		return "greeting";
	}

}