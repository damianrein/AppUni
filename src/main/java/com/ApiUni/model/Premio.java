package com.ApiUni.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Premio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Date fecha;
	private TipoDePremio tipo;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
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
