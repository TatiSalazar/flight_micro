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
@Table(name = "Pasaje")
public class Pasaje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	public int id;
	
	@Column(name="clase")
	public String clase;
	
	@Column(name="asiento")
	public String asiento;
	
	@Column(name="valor")
	public float valor;
	
	@ManyToOne
	@JoinColumn(name="pasajero", nullable=false)
	private Pasajero pasajero;
	

	@ManyToOne
	@JoinColumn(name="vuelo", nullable=false)
	private Vuelo vuelo;


	/**
	 * @param id id del pasaje
	 * @param clase clase
	 * @param asiento numero del asiento
	 * @param valor valor del ticket
	 * @param pasajero id del pasajero
	 * @param vuelo id del vuelo
	 */
	public Pasaje(int id, String clase, String asiento, float valor, Pasajero pasajero, Vuelo vuelo) {
		super();
		this.id = id;
		this.clase = clase;
		this.asiento = asiento;
		this.valor = valor;
		this.pasajero = pasajero;
		this.vuelo = vuelo;
	}


	public Pasaje() {
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
	 * @return the clase
	 */
	public String getClase() {
		return clase;
	}


	/**
	 * @param clase the clase to set
	 */
	public void setClase(String clase) {
		this.clase = clase;
	}


	/**
	 * @return the asiento
	 */
	public String getAsiento() {
		return asiento;
	}


	/**
	 * @param asiento the asiento to set
	 */
	public void setAsiento(String asiento) {
		this.asiento = asiento;
	}


	/**
	 * @return the valor
	 */
	public float getValor() {
		return valor;
	}


	/**
	 * @param valor the valor to set
	 */
	public void setValor(float valor) {
		this.valor = valor;
	}


	/**
	 * @return the pasajero
	 */
	public Pasajero getPasajero() {
		return pasajero;
	}


	/**
	 * @param pasajero the pasajero to set
	 */
	public void setPasajero(Pasajero pasajero) {
		this.pasajero = pasajero;
	}


	/**
	 * @return the vuelo
	 */
	public Vuelo getVuelo() {
		return vuelo;
	}


	/**
	 * @param vuelo the vuelo to set
	 */
	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}


	@Override
	public String toString() {
		return "Pasaje [id=" + id + ", clase=" + clase + ", asiento=" + asiento + ", valor=" + valor + ", pasajero="
				+ pasajero + ", vuelo=" + vuelo + "]";
	}
	
	
	
	

}
