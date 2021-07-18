package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.entity.Aeropuerto;


public interface IAeropuertoRepo extends JpaRepository<Aeropuerto, Integer> {

}
