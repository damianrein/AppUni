package com.ApiUni.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class GrupoDeInvestigacion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Laboratorio laboratorio;
	@OneToMany
	private List<Investigador> investigadores;
	private boolean activo;
	
	public GrupoDeInvestigacion(Long id, Laboratorio laboratorio, List<Investigador> investigadores, boolean activo) {
		this.id = id;
		this.laboratorio = laboratorio;
		this.investigadores = investigadores;
		this.setActivo(activo);
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}
	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}
	public List<Investigador> getInvestigadores() {
		return investigadores;
	}
	public void setInvestigadores(List<Investigador> investigadores) {
		this.investigadores = investigadores;
	}
	public void setInvestigadores(Investigador investigador) {
		this.investigadores.add(investigador);
	}
	public Long getId() {
		return id;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}
}
