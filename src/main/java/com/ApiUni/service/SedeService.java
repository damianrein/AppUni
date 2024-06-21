package com.ApiUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApiUni.model.Sede;
import com.ApiUni.repository.ISedeRepository;

@Service
public class SedeService {

	private ISedeRepository repo;
	
	public List<Sede> findSedesWithOutGroup(){
		return repo.findByLaboratorioGruposActivoFalse();
	}
}
