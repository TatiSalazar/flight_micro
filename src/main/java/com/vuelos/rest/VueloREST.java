package com.vuelos.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vuelos.entity.Vuelo;
import com.vuelos.service.VueloService;

@RestController
@RequestMapping("/vuelos")
public class VueloREST {
	
	@Autowired
	private VueloService vueloService;
	
	@GetMapping
    private ResponseEntity<List<Vuelo>> getAllVuelos(){
    	return ResponseEntity.ok(vueloService.findAll());
    }
}
