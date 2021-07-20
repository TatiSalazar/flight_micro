package com.vuelos.entity;

import java.util.Set;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "Compania")
public class Compania {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="nombre_compania", length=50)
	private String nombreCompania;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "compania")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Avion> aviones;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "compania")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Vuelo> vuelo;

	/**
	 * @param nombreCompania
	 * @param aviones
	 * @param vuelo
	 */
	public Compania(String nombreCompania, Set<Avion> aviones, Set<Vuelo> vuelo) {
		super();
		this.nombreCompania = nombreCompania;
		this.aviones = aviones;
		this.vuelo = vuelo;
	}

	public Compania() {
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombreCompania
	 */
	public String getNombreCompania() {
		return nombreCompania;
	}

	/**
	 * @param nombreCompania the nombreCompania to set
	 */
	public void setNombreCompania(String nombreCompania) {
		this.nombreCompania = nombreCompania;
	}

	/**
	 * @return the aviones
	 */
	public Set<Avion> getAviones() {
		return aviones;
	}

	/**
	 * @param aviones the aviones to set
	 */
	public void setAviones(Set<Avion> aviones) {
		this.aviones = aviones;
	}

	/**
	 * @return the vuelo
	 */
	public Set<Vuelo> getVuelo() {
		return vuelo;
	}

	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Set<Vuelo> vuelo) {
		this.vuelo = vuelo;
	}

	@Override
	public String toString() {
		return "Compania [id=" + id + ", nombreCompania=" + nombreCompania + ", aviones=" + aviones + ", vuelo=" + vuelo
				+ "]";
	}

	
	
	
}
