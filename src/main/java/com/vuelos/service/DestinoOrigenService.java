package com.vuelos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.vuelos.entity.DestinoOrigen;
import com.vuelos.repository.IDestinoOrigenRepo;

@Service
public class DestinoOrigenService implements IDestinoOrigenRepo {
	
	@Autowired
	private IDestinoOrigenRepo destinoOrigenRepository;

	@Override
	public List<DestinoOrigen> findAll() {
		// TODO Auto-generated method stub
		return destinoOrigenRepository.findAll();
	}

	@Override
	public List<DestinoOrigen> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return destinoOrigenRepository.findAll(sort);
	}

	@Override
	public List<DestinoOrigen> findAllById(Iterable<Integer> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void flush() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends DestinoOrigen> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> List<S> saveAllAndFlush(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAllInBatch(Iterable<DestinoOrigen> entities) {
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
	public DestinoOrigen getOne(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DestinoOrigen getById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<DestinoOrigen> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<DestinoOrigen> findById(Integer id) {
		// TODO Auto-generated method stub
		return null;
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
		
	}

	@Override
	public void delete(DestinoOrigen entity) {
		// TODO Auto-generated method stub
		destinoOrigenRepository.delete(entity);
		
	}

	@Override
	public void deleteAllById(Iterable<? extends Integer> ids) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll(Iterable<? extends DestinoOrigen> entities) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public <S extends DestinoOrigen> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public <S extends DestinoOrigen> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public <S extends DestinoOrigen> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

}
