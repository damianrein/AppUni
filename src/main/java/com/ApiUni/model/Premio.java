package com.ApiUni.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Premio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private LocalDate fecha;
	private TipoDePremio tipo;
	
	public LocalDate getFecha() {
		return fecha;
	}
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	public TipoDePremio getTipo() {
		return tipo;
	}
	public void setTipo(TipoDePremio tipo) {
		this.tipo = tipo;
	}
	public Long getId() {
		return id;
	}
}
