package com.ApiUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.Sede;

public interface ISedeRepository extends JpaRepository<Sede, Long>{

	List<Sede> findByLaboratorioGruposActivoFalse();
}
