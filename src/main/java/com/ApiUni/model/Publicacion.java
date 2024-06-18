package com.ApiUni.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Publicacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NotBlank
	private String nombre;
	@NotBlank
	private Date fecha;
	@ManyToOne
	private TipoDePublicacion tipo;
	@NotBlank
	private String link;
	
	public Publicacion() {}
	
	public Publicacion(Long id, @NotBlank String nombre, @NotBlank Date fecha, TipoDePublicacion tipo,
			@NotBlank String link) {
		this.id = id;
		this.nombre = nombre;
		this.fecha = fecha;
		this.tipo = tipo;
		this.link = link;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public TipoDePublicacion getTipo() {
		return tipo;
	}
	public void setTipo(TipoDePublicacion tipo) {
		this.tipo = tipo;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Long getId() {
		return id;
	}
}
