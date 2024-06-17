package com.ApiUni.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Facultad {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String nombre;
	@OneToMany
	private Sede sedes;
}
