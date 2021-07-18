package com.vuelos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vuelos.entity.Compania;


public interface ICompaniaRepo extends JpaRepository<Compania, Integer> {

}
