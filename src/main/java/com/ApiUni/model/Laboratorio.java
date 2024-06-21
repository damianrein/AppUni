package com.ApiUni.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Laboratorio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@OneToOne
	@JoinColumn(name = "id_sede", referencedColumnName = "id")
	private Sede sede;
	private Denominacion denominacion;
	@OneToMany
	@JoinColumn(name="id_grupo_investigacion", referencedColumnName = "id")
	private List<GrupoDeInvestigacion> grupos;
	
	public Laboratorio() {}
	
	public Laboratorio(Long id, Sede sede, Denominacion denominacion, List<GrupoDeInvestigacion> grupos) {
		this.id = id;
		this.sede = sede;
		this.denominacion = denominacion;
		this.grupos = grupos;
	}

	public Sede getSede() {
		return sede;
	}
	public void setSede(Sede sede) {
		this.sede = sede;
	}
	public Denominacion getDenominacion() {
		return denominacion;
	}
	public void setDenominacion(Denominacion denominacion) {
		this.denominacion = denominacion;
	}
	public List<GrupoDeInvestigacion> getGrupos() {
		return grupos;
	}
	public void setGrupos(List<GrupoDeInvestigacion> grupos) {
		this.grupos = grupos;
	}
	public void setGrupos(GrupoDeInvestigacion grupo) {
		this.grupos.add(grupo);
	}
	public Long getId() {
		return id;
	}
}
