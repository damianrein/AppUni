package com.ApiUni.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Titulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@NotBlank
	private String titulo;
	private LocalDate fechaDeObtencion;
	
	public Titulo(int id, @NotBlank String titulo, LocalDate fechaDeObtencion) {
		this.id = id;
		this.titulo = titulo;
		this.fechaDeObtencion = fechaDeObtencion;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public LocalDate getFechaDeObtencion() {
		return fechaDeObtencion;
	}
	public void setFechaDeObtencion(LocalDate fechaDeObtencion) {
		this.fechaDeObtencion = fechaDeObtencion;
	}
	public int getId() {
		return id;
	}
}
