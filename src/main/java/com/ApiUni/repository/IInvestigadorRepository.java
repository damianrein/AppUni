package com.ApiUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.ApiUni.model.Investigador;

public interface IInvestigadorRepository extends JpaRepository<Investigador, Long> {

	@Query("")
	List<Investigador> findByInactivity();
	
	List<Investigador> findByFacultad();
}
