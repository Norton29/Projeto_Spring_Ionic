package com.nff.ProjetoSpringIonic.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nff.ProjetoSpringIonic.Repositories.CityRepository;
import com.nff.ProjetoSpringIonic.Service.Exception.ObjectNotFoundException;
import com.nff.ProjetoSpringIonic.domain.City;

@Service
public class CityService {

	@Autowired	
	private CityRepository cityRepository;
	
	public City find(Integer id) {
		Optional<City> city = cityRepository.findById(id);
		return city.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + City.class.getName()));
	}
	
	public City insert(City city) {
		return cityRepository.save(city);
	}
	
	
}
