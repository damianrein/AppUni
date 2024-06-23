package com.ApiUni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Sede {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String localidad;
	private String calle;
	private short numero;
	@ManyToOne
	private Facultad facultad;
	@OneToOne
	private Laboratorio laboratorio;
	
	public Sede() {}
	
	public Sede(Long id, String localidad, String calle, short numero, Facultad facultad, Laboratorio laboratorio) {
		this.id = id;
		this.localidad = localidad;
		this.calle = calle;
		this.numero = numero;
		this.facultad = facultad;
		this.laboratorio = laboratorio;
	}
	public Facultad getFacultad() {
		return facultad;
	}
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}
	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public Long getId() {
		return id;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public short getNumero() {
		return numero;
	}
	public void setNumero(short numero) {
		this.numero = numero;
	}	
}
