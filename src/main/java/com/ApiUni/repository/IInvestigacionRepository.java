package com.ApiUni.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.Investigacion;

public interface IInvestigacionRepository extends JpaRepository<Long, Investigacion>{
	
	List<Investigacion> findByState(Integer state);
}