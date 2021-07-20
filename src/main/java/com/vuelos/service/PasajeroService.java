package com.vuelos.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


import com.vuelos.entity.Pasajero;
import com.vuelos.repository.IPasajeroRepo;


@Service
public class PasajeroService implements IPasajeroRepo {

	@Autowired
	private IPasajeroRepo pasajeroRepository;

	@Override
	public List<Pasajero> findAll() {
		// TODO Auto-generated method stub
		return pasajeroRepository.findAll();
	}
	
	
	public Pasajero findPasajeroById(int id){
		
		List<Pasajero> pasajero = pasajeroRepository.findAll();
		for (int i = 0; i < pasajero.size(); i++) {
			if(pasajero.get(i).getId()==id) {
				return pasajero.get(i);
			}
		}
		return null;
	}
	
	
	public Boolean actualizarPasajero(Pasajero pasajero1) {

		Pasajero pasajero = findPasajeroById(pasajero1.getId());
		pasajero.setNombre(pasajero1.getNombre());
		pasajero.setDocumento(pasajero1.getDocumento());
		pasajero.setEmail(pasajero1.getEmail());
		pasajero.setTelefono(pasajero1.getTelefono());
		pasajeroRepository.save(pasajero);
		
		return true;
		
	}
	
	@Override
	public List<Pasajero> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return pasajeroRepository.findAll(sort);
	}

	@Override
	public List<Pasajero> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Pasajero> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<Pasajero> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pasajero getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Pasajero getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Pasajero> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> S save(S entity) {
		// TODO Auto-generated method stub
		return pasajeroRepository.save(entity);
	}

	@Override
	public Optional<Pasajero> findById(Integer id) {
		return pasajeroRepository.findById(id);
	}

	@Override
	public boolean existsById(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		pasajeroRepository.deleteById(id);
	}

	@Override
	public void delete(Pasajero entity) {
		// TODO Auto-generated method stub
		pasajeroRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends Pasajero> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends Pasajero> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends Pasajero> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends Pasajero> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

//	@Override
//	public void registrar(String nombre) {
//
//		repo.registrar(nombre);
//
//	}
	

}
