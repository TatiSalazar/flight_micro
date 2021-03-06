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
@Table(name = "Pasajero")
public class Pasajero {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator= "native")
	@GenericGenerator(name = "native", strategy = "native")
	private int id;
	
	@Column(name="nombre", length=50)
	private String nombre;
	
	@Column(name="documento", length=50)
	private String documento;
	
	@Column(name="email", length=50)
	private String email;
	
	@Column(name="telefono", length=50)
	private String telefono;

	@OneToMany(fetch = FetchType.LAZY,mappedBy = "pasajero")
	@JsonIgnore
	@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
	private Set<Pasaje> pasaje;

	/**
	 * @param nombre nombre del pasajero
	 * @param documento numero de documento de identidad del pasajero
	 * @param email email del pasajero
	 * @param telefono numero de telefono del pasajero
	 * @param pasaje id de los pasajes
	 */
	public Pasajero(int id, String nombre, String documento, String email, String telefono, Set<Pasaje> pasaje) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.documento = documento;
		this.email = email;
		this.telefono = telefono;
		this.pasaje = pasaje;
	}

	public Pasajero() {
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
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}

	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the pasaje
	 */
	public Set<Pasaje> getPasaje() {
		return pasaje;
	}

	/**
	 * @param pasaje the pasaje to set
	 */
	public void setPasaje(Set<Pasaje> pasaje) {
		this.pasaje = pasaje;
	}

	@Override
	public String toString() {
		return "Pasajero [id=" + id + ", nombre=" + nombre + ", documento=" + documento + ", email=" + email
				+ ", telefono=" + telefono + ", pasaje=" + pasaje + "]";
	}
	
	
	
	
	
}
