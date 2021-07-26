package com.vuelos.rest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.entity.Pasajero;
import com.vuelos.entity.Vuelo;
import com.vuelos.service.VueloService;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/vuelos/")
public class VueloREST {
	
	@Autowired
	private VueloService vueloService;
	
	@GetMapping
    private ResponseEntity<List<Vuelo>> getAllVuelos(){
    	return ResponseEntity.ok(vueloService.findAll());
    }
	@GetMapping("{id}")
	private ResponseEntity<Optional<Vuelo>> getVueloID(@PathVariable("id") int id) {
		return ResponseEntity.ok(vueloService.findById(id));
		
	}
}
