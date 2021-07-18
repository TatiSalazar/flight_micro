package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vuelos.entity.Pasajero;

//@Service
//@Repository
public interface IPasajeroRepo extends JpaRepository<Pasajero, Integer>{



	// void registrar(String nombre);
}
