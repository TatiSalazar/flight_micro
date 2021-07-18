//package com.vuelos.rest;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.vuelos.entity.Pasajero;
//import com.vuelos.repository.IPasajeroRepo;
//
//@RestController
//@RequestMapping("/pasajeros")
//public class RestDemoController {
//
//	@Autowired
//	private IPasajeroRepo repo;
//	
//	@GetMapping
//	public List<Pasajero> listar(){
//		return repo.findAll();
//	}
//	
//	@PostMapping
//	public void insertar(@RequestBody Pasajero per){
//		repo.save(per);
//	}
//	
//	@PutMapping
//	public void modificar(@RequestBody Pasajero per){
//		repo.save(per);
//	}
//	
//	@DeleteMapping(value = "/{id}")
//	public void eliminar(@PathVariable("id") Integer id){
//		repo.deleteById(id);
//	}
//}
