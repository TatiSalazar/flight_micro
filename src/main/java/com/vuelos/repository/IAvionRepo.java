package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.entity.Avion;


public interface IAvionRepo extends JpaRepository<Avion, Integer> {

}
