package com.ApiUni.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Investigador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nombre;
	private String apellido;
	private Date nacimiento;
	private Date altaUniversidad;
	private boolean activo;
	@ManyToMany
	private Investigacion investigaciones;
	@Max(value = 5)
	@Min(value = 1)
	private byte categoria;
	@OneToOne
	@JoinColumn(name = "id_legajo", referencedColumnName = "id")
	private Legajo legajo;
	
	public Investigador() {}
	
	public Investigador(Long id, String nombre, String apellido, Date nacimiento, Date altaUniversidad, boolean activo,
			Investigacion investigaciones, byte categoria, Legajo legajo) {
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.nacimiento = nacimiento;
		this.altaUniversidad = altaUniversidad;
		this.activo = activo;
		this.investigaciones = investigaciones;
		this.categoria = categoria;
		this.legajo = legajo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Date getNacimiento() {
		return nacimiento;
	}

	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	public Date getAltaUniversidad() {
		return altaUniversidad;
	}

	public void setAltaUniversidad(Date altaUniversidad) {
		this.altaUniversidad = altaUniversidad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public Investigacion getInvestigaciones() {
		return investigaciones;
	}

	public void setInvestigaciones(Investigacion investigaciones) {
		this.investigaciones = investigaciones;
	}

	public byte getCategoria() {
		return categoria;
	}

	public void setCategoria(byte categoria) {
		this.categoria = categoria;
	}

	public Legajo getLegajo() {
		return legajo;
	}

	public void setLegajo(Legajo legajo) {
		this.legajo = legajo;
	}

	public Long getId() {
		return id;
	}
	
}
