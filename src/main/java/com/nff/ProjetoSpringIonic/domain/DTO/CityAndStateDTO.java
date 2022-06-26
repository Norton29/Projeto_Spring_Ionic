package com.nff.ProjetoSpringIonic.domain.DTO;

public class CityAndStateDTO {

	private Class<? extends CityDTO> cityDTO;
	private Class<? extends StateDTO> stateDTO;
	
	public CityAndStateDTO(CityDTO cityDTO, StateDTO stateDTO) {
		this.cityDTO = cityDTO.getClass();
		this.stateDTO = stateDTO.getClass();
	}

	public Class<? extends CityDTO> getCityDTO() {
		return cityDTO;
	}

	public void setCityDTO(Class<? extends CityDTO> cityDTO) {
		this.cityDTO = cityDTO;
	}

	public Class<? extends StateDTO> getStateDTO() {
		return stateDTO;
	}

	public void setStateDTO(Class<? extends StateDTO> stateDTO) {
		this.stateDTO = stateDTO;
	}
	
	
}
