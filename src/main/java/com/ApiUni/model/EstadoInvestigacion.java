package com.ApiUni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class EstadoInvestigacion {

	@Id
	@GeneratedValue
	private Long id;
	private String state;
	
	public EstadoInvestigacion(Long id, String state) {
		this.id = id;
		this.state = state;
	}
	
	public Long getId() {
		return id;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
}
