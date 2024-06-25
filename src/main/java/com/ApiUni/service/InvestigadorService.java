package com.ApiUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApiUni.model.Investigador;
import com.ApiUni.repository.IInvestigadorRepository;

@Service
public class InvestigadorService {

	private IInvestigadorRepository repo;

	public InvestigadorService(IInvestigadorRepository repo) {
		this.repo = repo;
	}
	
	public List<Investigador> findByTitulo(String titulo) {
		return repo.findByTituloTituloIgnoreCase(titulo);
	}
	
	public List<Investigador> findByTituloIsEquals(String titulo){
		return repo.findByTituloTituloEquals(titulo);
	}
}
