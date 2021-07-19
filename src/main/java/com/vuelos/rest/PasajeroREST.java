package com.vuelos.rest;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.vuelos.entity.Pasajero;
import com.vuelos.service.PasajeroService;

@RestController
@RequestMapping("/pasajeros/")
public class PasajeroREST {
	
	@Autowired
	private PasajeroService pasajeroService;
	
	@GetMapping
    private ResponseEntity<List<Pasajero>> getAllPasajeros(){
    	return ResponseEntity.ok(pasajeroService.findAll());
    }
	
	@GetMapping("{id}")
	private ResponseEntity<Pasajero> getAllPasajerosById(@PathVariable("id") int idPasajero ) {
		return ResponseEntity.ok(pasajeroService.findPasajeroById(idPasajero));
		
	}

	@PostMapping
    private ResponseEntity<Pasajero> savePasajero(@RequestBody Pasajero pasajero){
		
		try {
			Pasajero pasajeroGuardado = pasajeroService.save(pasajero);
			return ResponseEntity.created(new URI("/pasajeros/"+pasajeroGuardado.getId())).body(pasajeroGuardado);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
    }
	
	@PostMapping(value = "modificar/{id}")
	private ResponseEntity<Boolean> editarPasajero(@RequestBody Pasajero pasajero){

		   
			return ResponseEntity.ok(pasajeroService.actualizarPasajero(pasajero));

	}

	
	@DeleteMapping (value = "delete/{id}")
	private ResponseEntity<Boolean> deletePasajero (@PathVariable ("id") int id){
		pasajeroService.deleteById(id);
		return ResponseEntity.ok(!(pasajeroService.findById(id)!=null));
		
	}
	
}
