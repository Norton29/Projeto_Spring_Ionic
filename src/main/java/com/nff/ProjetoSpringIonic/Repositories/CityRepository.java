package com.nff.ProjetoSpringIonic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nff.ProjetoSpringIonic.domain.City;

@Repository
public interface CityRepository extends JpaRepository<City, Integer> {

}
