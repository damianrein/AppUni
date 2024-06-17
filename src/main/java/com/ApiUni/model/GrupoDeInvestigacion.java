package com.ApiUni.model;

import java.util.List;

import jakarta.persistence.Entity;

@Entity
public class GrupoDeInvestigacion {

	private Long id;
	private List<Investigador> investigadores;
}
