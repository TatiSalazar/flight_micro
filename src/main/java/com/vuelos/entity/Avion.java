package com.vuelos.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Avion")
public class Avion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="modelo", length=50)
	private String modelo;
	
	@Column(name="capacidad")
	private int capacidad;

	@ManyToOne
	@JoinColumn(name="aeropuerto", nullable=false)
	private Aeropuerto aeropuerto;
	
	@ManyToOne
	@JoinColumn(name="compania", nullable=false)
	private Compania compania;
	
	@OneToMany (mappedBy="avion")
	private Set<Vuelo> vuelo;

	/**
	 * @param modelo modelo del avion
	 * @param capacidad capacidad del avion
	 * @param aeropuerto id del aeropuerto
	 * @param compania id de la compania
	 * @param vuelo id vuelo
	 */
	public Avion(String modelo, int capacidad, Aeropuerto aeropuerto, Compania compania, Set<Vuelo> vuelo) {
		super();
		this.modelo = modelo;
		this.capacidad = capacidad;
		this.aeropuerto = aeropuerto;
		this.compania = compania;
		this.vuelo = vuelo;
	}
	

	public Avion() {
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
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the aeropuerto
	 */
	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	/**
	 * @param aeropuerto the aeropuerto to set
	 */
	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	/**
	 * @return the compania
	 */
	public Compania getCompania() {
		return compania;
	}

	/**
	 * @param compania the compania to set
	 */
	public void setCompania(Compania compania) {
		this.compania = compania;
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
		return "Avion [id=" + id + ", modelo=" + modelo + ", capacidad=" + capacidad + ", aeropuerto=" + aeropuerto
				+ ", compania=" + compania + ", vuelo=" + vuelo + "]";
	}
	
	
}


	