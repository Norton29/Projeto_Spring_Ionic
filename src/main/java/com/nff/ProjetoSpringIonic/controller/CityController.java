package com.nff.ProjetoSpringIonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.Service.CityService;
import com.nff.ProjetoSpringIonic.Service.StateService;
import com.nff.ProjetoSpringIonic.domain.City;
import com.nff.ProjetoSpringIonic.domain.State;
import com.nff.ProjetoSpringIonic.domain.DTO.CityAndStateDTO;
import com.nff.ProjetoSpringIonic.domain.DTO.CityDTO;
import com.nff.ProjetoSpringIonic.domain.DTO.StateDTO;

@RestController
@RequestMapping(value = "/city")
public class CityController{

	@Autowired
	private CityService cityService;
	
	@Autowired
	private StateService stateService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<CityAndStateDTO> find(@PathVariable Integer id) {
		City city = cityService.find(id);
		State state = stateService.findState(id);
		CityDTO cityDTO = new CityDTO(city);
		StateDTO stateDTO = new StateDTO(state);
		CityAndStateDTO cityAndState = new CityAndStateDTO(cityDTO, stateDTO);
 		return ResponseEntity.ok().body(cityAndState);		
		
	}
		
	@PostMapping(value = "/insert")
	public ResponseEntity<City> insert(@RequestBody City cit ){
		City city = cityService.insert(cit); 
		return ResponseEntity.ok().body(city);
				
	}
}
