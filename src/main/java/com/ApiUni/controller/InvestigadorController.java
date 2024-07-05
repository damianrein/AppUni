package com.ApiUni.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApiUni.model.Investigador;
import com.ApiUni.service.InvestigadorService;

@RestController
@RequestMapping("/v2")
public class InvestigadorController {

	private InvestigadorService service;

	public InvestigadorController(InvestigadorService service) {
		this.service = service;
	}
	
	@GetMapping("/{titulo}")
	public ResponseEntity<List<Investigador>> getWithTituloEquals(@RequestParam String titulo){
		return ResponseEntity.ok(service.findByTituloIsEquals(titulo));
	}
	
	@GetMapping("/ig/{titulo}")
	public ResponseEntity<List<Investigador>> getByTitulo(@RequestParam String titulo){
		return ResponseEntity.ok(service.findByTitulo(titulo));
	}
}
