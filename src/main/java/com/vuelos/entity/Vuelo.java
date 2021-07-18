package com.vuelos.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "Vuelo")
public class Vuelo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	public int id;
	
	@Column(name="capacidad")
	public int capacidad;
	
	@Column(name="numeroVuelo")
	public String numeroVuelo;
	
	@ManyToOne
	@JoinColumn(name="compania", nullable=false)
	private Compania compania;
	

	@ManyToOne
	@JoinColumn(name="itinerario", nullable=false)
	private Itinerario itinerario;
	
	@ManyToOne
	@JoinColumn(name="avion", nullable=false)
	private Avion avion;

	/**
	 * @param capacidad capacidad del vuelo
	 * @param numeroVuelo numero del vuelo
	 * @param compania id compania
	 * @param itinerario id itinerario
	 * @param avion id avion
	 */
	public Vuelo(int capacidad, String numeroVuelo, Compania compania, Itinerario itinerario, Avion avion) {
		super();
		this.capacidad = capacidad;
		this.numeroVuelo = numeroVuelo;
		this.compania = compania;
		this.itinerario = itinerario;
		this.avion = avion;
	}
	
	public Vuelo() {
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
	 * @return the numeroVuelo
	 */
	public String getNumeroVuelo() {
		return numeroVuelo;
	}

	/**
	 * @param numeroVuelo the numeroVuelo to set
	 */
	public void setNumeroVuelo(String numeroVuelo) {
		this.numeroVuelo = numeroVuelo;
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
	 * @return the itinerario
	 */
	public Itinerario getItinerario() {
		return itinerario;
	}

	/**
	 * @param itinerario the itinerario to set
	 */
	public void setItinerario(Itinerario itinerario) {
		this.itinerario = itinerario;
	}

	/**
	 * @return the avion
	 */
	public Avion getAvion() {
		return avion;
	}

	/**
	 * @param avion the avion to set
	 */
	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	@Override
	public String toString() {
		return "Vuelo [id=" + id + ", capacidad=" + capacidad + ", numeroVuelo=" + numeroVuelo + ", compania="
				+ compania + ", itinerario=" + itinerario + ", avion=" + avion + "]";
	}
	
	
	
}
