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
@Table(name = "DestinoOrigen")
public class DestinoOrigen {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="nombreAeropuertOrigen", length=50)
	private String nombreAeropuertOrigen;
	
	@Column(name="nombreCiudadOrigen", length=50)
	private String nombreCiudadOrigen;
	
	@Column(name="nombreAeropuertoDestino", length=50)
	private String nombreAeropuertoDestino;
	
	@Column(name="nombreCiudadDestino", length=50)
	private String nombreCiudadDestino;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "destinoOrigen")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Itinerario> itinerario;

	/**
	 * @param nombreAeropuertOrigen nombre del aeropuerto de origen
	 * @param nombreCiudadOrigen nombre de la ciudad de origen
	 * @param nombreAeropuertoDestino nombre del aeropuerto destino
	 * @param nombreCiudadDestino nombre de la ciudad destino
	 * @param itinerario lista de id de los itinerarios
	 */
	public DestinoOrigen(String nombreAeropuertOrigen, String nombreCiudadOrigen, String nombreAeropuertoDestino,
			String nombreCiudadDestino, Set<Itinerario> itinerario) {
		super();
		this.nombreAeropuertOrigen = nombreAeropuertOrigen;
		this.nombreCiudadOrigen = nombreCiudadOrigen;
		this.nombreAeropuertoDestino = nombreAeropuertoDestino;
		this.nombreCiudadDestino = nombreCiudadDestino;
		this.itinerario = itinerario;
	}

	public DestinoOrigen() {
		
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
	 * @return the nombreAeropuertOrigen
	 */
	public String getNombreAeropuertOrigen() {
		return nombreAeropuertOrigen;
	}

	/**
	 * @param nombreAeropuertOrigen the nombreAeropuertOrigen to set
	 */
	public void setNombreAeropuertOrigen(String nombreAeropuertOrigen) {
		this.nombreAeropuertOrigen = nombreAeropuertOrigen;
	}

	/**
	 * @return the nombreCiudadOrigen
	 */
	public String getNombreCiudadOrigen() {
		return nombreCiudadOrigen;
	}

	/**
	 * @param nombreCiudadOrigen the nombreCiudadOrigen to set
	 */
	public void setNombreCiudadOrigen(String nombreCiudadOrigen) {
		this.nombreCiudadOrigen = nombreCiudadOrigen;
	}

	/**
	 * @return the nombreAeropuertoDestino
	 */
	public String getNombreAeropuertoDestino() {
		return nombreAeropuertoDestino;
	}

	/**
	 * @param nombreAeropuertoDestino the nombreAeropuertoDestino to set
	 */
	public void setNombreAeropuertoDestino(String nombreAeropuertoDestino) {
		this.nombreAeropuertoDestino = nombreAeropuertoDestino;
	}

	/**
	 * @return the nombreCiudadDestino
	 */
	public String getNombreCiudadDestino() {
		return nombreCiudadDestino;
	}

	/**
	 * @param nombreCiudadDestino the nombreCiudadDestino to set
	 */
	public void setNombreCiudadDestino(String nombreCiudadDestino) {
		this.nombreCiudadDestino = nombreCiudadDestino;
	}

	/**
	 * @return the itinerario
	 */
	public Set<Itinerario> getItinerario() {
		return itinerario;
	}

	/**
	 * @param itinerario the itinerario to set
	 */
	public void setItinerario(Set<Itinerario> itinerario) {
		this.itinerario = itinerario;
	}

	@Override
	public String toString() {
		return "DestinoOrigen [id=" + id + ", nombreAeropuertOrigen=" + nombreAeropuertOrigen + ", nombreCiudadOrigen="
				+ nombreCiudadOrigen + ", nombreAeropuertoDestino=" + nombreAeropuertoDestino + ", nombreCiudadDestino="
				+ nombreCiudadDestino + ", itinerario=" + itinerario + "]";
	}
	
	
	
	
	
}
