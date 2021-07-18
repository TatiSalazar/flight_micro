package com.vuelos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.vuelos.entity.Pasajero;
import com.vuelos.repository.IPasajeroRepo;

@Controller
public class DemoController {

//	@Autowired
//	private IPasajeroRepo repo;
	
	@GetMapping("/greeting")
	public String greeting(Model model) {
		
		model.addAttribute("titulo", "Hola Spring Framework");
		
		//@RequestParam(name="name", required=false, defaultValue="World") String name, Model model)
//		Pasajero p = new Pasajero();
//		p.setId(2);
//		p.setNombre("Tatis");
//		p.setDocumento("1234");
//		p.setEmail("tatis@gmail.com");
//		p.setTelefono("34567");
//		repo.save(p);
//		Pasajero p2 = new Pasajero();
//		p2.setId(3);
//		p2.setNombre("TatisAalaza");
//		p2.setDocumento("1234");
//		p2.setEmail("tatis@gmail.com");
//		p2.setTelefono("34567");
//		repo.save(p2);
		
		//model.addAttribute("name", name);
		return "greeting";
	}
//	@GetMapping("/listar")
//	public String greeting(Model model) {
//		
//		model.addAttribute("pasajeros", repo.findAll());
//		return "greeting";
//	}
}
