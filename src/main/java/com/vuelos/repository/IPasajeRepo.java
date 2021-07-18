package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.entity.Pasaje;

public interface IPasajeRepo extends JpaRepository<Pasaje, Integer> {

}
