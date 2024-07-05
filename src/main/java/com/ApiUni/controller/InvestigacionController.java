package com.ApiUni.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ApiUni.model.Investigacion;
import com.ApiUni.service.InvestigacionService;

@RestController
@RequestMapping("/v1")
public class InvestigacionController {

	private InvestigacionService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Investigacion>> getByState(Integer state){
		return ResponseEntity.ok(service.findByStateInvestigation(state));
	}
	
	@GetMapping("/{date}")
	public ResponseEntity<List<String>> getTopicAfter(@RequestParam LocalDate date){
		return ResponseEntity.ok(service.findTopicOfTheLast(date));
	}
}
