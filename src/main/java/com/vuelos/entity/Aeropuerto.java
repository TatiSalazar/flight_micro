package com.vuelos.entity;

import java.util.Set;

import javax.persistence.CascadeType;
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
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "Aeropuerto")
public class Aeropuerto {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="numero_pistas")
	private int numeroPistas;
	
	@Column(name="aeropuerto_activo", length=2)
	private String aeropuertoActivo;

	@Column(name="ciudad", length=50)
	private String ciudad;
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "aeropuerto")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Avion> aviones;

	/**
	 * @param nombre nombre del aeropuerto
	 * @param numeroPistas numero de pistas del aeropuerto
	 * @param aeropuertoActivo aeropuerto activo
	 * @param ciudad id de la ciudad donde se encuentra ubicado el aeropuerto
	 * @param aviones id de aviones
	 */
	public Aeropuerto(String nombre, int numeroPistas, String aeropuertoActivo, String ciudad, Set<Avion> aviones) {
		super();
		this.nombre = nombre;
		this.numeroPistas = numeroPistas;
		this.aeropuertoActivo = aeropuertoActivo;
		this.ciudad = ciudad;
		this.aviones = aviones;
	}
	
	public Aeropuerto() {
		
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
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the numeroPistas
	 */
	public int getNumeroPistas() {
		return numeroPistas;
	}

	/**
	 * @param numeroPistas the numeroPistas to set
	 */
	public void setNumeroPistas(int numeroPistas) {
		this.numeroPistas = numeroPistas;
	}

	/**
	 * @return the aeropuertoActivo
	 */
	public String getAeropuertoActivo() {
		return aeropuertoActivo;
	}

	/**
	 * @param aeropuertoActivo the aeropuertoActivo to set
	 */
	public void setAeropuertoActivo(String aeropuertoActivo) {
		this.aeropuertoActivo = aeropuertoActivo;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
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

	@Override
	public String toString() {
		return "Aeropuerto [id=" + id + ", nombre=" + nombre + ", numeroPistas=" + numeroPistas + ", aeropuertoActivo="
				+ aeropuertoActivo + ", ciudad=" + ciudad + ", aviones=" + aviones + "]";
	}

	
	
	
	
	
	
}
