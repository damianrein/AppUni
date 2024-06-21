package com.ApiUni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ApiUni.model.Sede;
import com.ApiUni.service.SedeService;

@RestController
@RequestMapping("/sedes")
public class SedeController {

	private SedeService service;
	
	public SedeController(@Autowired SedeService service) {
		this.service = service;
	}

	@GetMapping("/noGruop")
	public ResponseEntity<List<Sede>> findSedeWithoutGroup(){
		return ResponseEntity.ok(service.findSedesWithOutGroup());
	}
}
