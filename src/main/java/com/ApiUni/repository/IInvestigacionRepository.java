package com.ApiUni.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ApiUni.model.Investigacion;

public interface IInvestigacionRepository extends JpaRepository<Investigacion, Long>{
	
	List<Investigacion> findByState(Integer state);
	
	List<String> findInvestigacionTopicByFinishAfter(LocalDate finish);
}