package com.nff.ProjetoSpringIonic.domain.DTO;

import com.nff.ProjetoSpringIonic.domain.City;
import com.nff.ProjetoSpringIonic.domain.State;

public class CityDTO {
	
	private String name;
	private String state;
	
	public CityDTO(City city, State state) {
		name = city.getName();
		this.state = state.getName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
	
}
