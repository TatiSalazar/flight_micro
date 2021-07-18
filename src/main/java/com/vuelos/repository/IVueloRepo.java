package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.vuelos.entity.Vuelo;

public interface IVueloRepo extends JpaRepository<Vuelo, Integer> {

}
