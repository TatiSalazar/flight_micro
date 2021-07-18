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
@Table(name = "Itinerario")
public class Itinerario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="fecha_salida")
	private String fechaSalida;
	
	@Column(name="fecha_llegada")
	private String fechaLlegada;
	
	@ManyToOne
	@JoinColumn(name="destinoOrigen", nullable=false)
	private DestinoOrigen destinoOrigen;


	@OneToMany (mappedBy="itinerario")
	private Set<Vuelo> vuelo;


	/**
	 * @param fechaSalida
	 * @param fechaLlegada
	 * @param destinoOrigen
	 * @param vuelo
	 */
	public Itinerario(String fechaSalida, String fechaLlegada, DestinoOrigen destinoOrigen, Set<Vuelo> vuelo) {
		super();
		this.fechaSalida = fechaSalida;
		this.fechaLlegada = fechaLlegada;
		this.destinoOrigen = destinoOrigen;
		this.vuelo = vuelo;
	}

	

	public Itinerario() {
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
	 * @return the fechaSalida
	 */
	public String getFechaSalida() {
		return fechaSalida;
	}


	/**
	 * @param fechaSalida the fechaSalida to set
	 */
	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}


	/**
	 * @return the fechaLlegada
	 */
	public String getFechaLlegada() {
		return fechaLlegada;
	}


	/**
	 * @param fechaLlegada the fechaLlegada to set
	 */
	public void setFechaLlegada(String fechaLlegada) {
		this.fechaLlegada = fechaLlegada;
	}


	/**
	 * @return the destinoOrigen
	 */
	public DestinoOrigen getDestinoOrigen() {
		return destinoOrigen;
	}


	/**
	 * @param destinoOrigen the destinoOrigen to set
	 */
	public void setDestinoOrigen(DestinoOrigen destinoOrigen) {
		this.destinoOrigen = destinoOrigen;
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
		return "Itinerario [id=" + id + ", fechaSalida=" + fechaSalida + ", fechaLlegada=" + fechaLlegada
				+ ", destinoOrigen=" + destinoOrigen + ", vuelo=" + vuelo + "]";
	}

	


	
	
}
	
	