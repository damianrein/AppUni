package com.ApiUni.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ApiUni.model.Premio;
import com.ApiUni.repository.IPremioRepository;

@Service
public class PremioService {

	private IPremioRepository repo;
	
	public List<Premio>findByYear(int year) {
		return repo.findByFechaYear(year);
	}
}
