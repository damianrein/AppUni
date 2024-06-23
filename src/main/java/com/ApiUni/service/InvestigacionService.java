package com.ApiUni.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ApiUni.model.Investigacion;
import com.ApiUni.repository.IInvestigacionRepository;

@Service
public class InvestigacionService {

	private IInvestigacionRepository repo;
	
	public List<Investigacion> findByStateInvestigation(Integer state){
		return repo.findByState(state);
	}
	
	public List<String> findTopicOfTheLast(LocalDate date){
		return repo.findInvestigacionTopicByFinishAfter(date);
	}
}
