package com.ApiUni.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiUni.model.Investigacion;
import com.ApiUni.service.InvestigacionService;

@RestController
@RequestMapping("/inv")
public class InvestigacionController {

	private InvestigacionService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Investigacion>> getByState(Integer state){
		return ResponseEntity.ok(service.findByStateInvestigation(state));
	}
}
