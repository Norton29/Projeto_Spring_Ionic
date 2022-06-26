package com.nff.ProjetoSpringIonic.domain.DTO;

import com.nff.ProjetoSpringIonic.domain.State;

public class StateDTO {
	
	private String name;
	
	
	public StateDTO(State state) {
		name = state.getName();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
}
