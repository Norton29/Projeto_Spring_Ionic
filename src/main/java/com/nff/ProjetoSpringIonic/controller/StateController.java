package com.nff.ProjetoSpringIonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.Service.StateService;
import com.nff.ProjetoSpringIonic.domain.State;

@RestController
@RequestMapping(value = "/state")
public class StateController{

	@Autowired
	private StateService stateService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<State> find(@PathVariable Integer id) {
		State state = stateService.find(id);
		return ResponseEntity.ok().body(state);		
		
	}
		
	@PostMapping(value = "/insert")
	public ResponseEntity<State> insert(@RequestBody State sta ){
		State state = stateService.insert(sta); 
		return ResponseEntity.ok().body(state);
				
	}
}
