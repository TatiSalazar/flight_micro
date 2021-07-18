package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.entity.Itinerario;


public interface IItinerarioRepo extends JpaRepository<Itinerario, Integer> {

}
