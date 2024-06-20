package com.ApiUni.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiUni.model.Premio;
import com.ApiUni.service.PremioService;

@RestController
@RequestMapping("/pr")
public class PremioController {

	private PremioService service;
	
	@GetMapping("/{year}")
	public ResponseEntity<List<Premio>> findAllByYear(int year){
		return ResponseEntity.ok(service.findByYear(year));
	}
}
