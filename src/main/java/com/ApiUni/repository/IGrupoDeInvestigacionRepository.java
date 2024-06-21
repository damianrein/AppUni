package com.ApiUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.GrupoDeInvestigacion;

public interface IGrupoDeInvestigacionRepository extends JpaRepository<GrupoDeInvestigacion, Long>{

	List<GrupoDeInvestigacion> findByActivo(boolean activo);
}
