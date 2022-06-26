package com.nff.ProjetoSpringIonic.domain.DTO;

import com.nff.ProjetoSpringIonic.domain.City;

public class CityDTO {
	
	private String name;

	
	public CityDTO(City city) {
		name = city.getName();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
}
