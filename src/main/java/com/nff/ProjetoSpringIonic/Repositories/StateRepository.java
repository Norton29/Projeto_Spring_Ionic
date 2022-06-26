package com.nff.ProjetoSpringIonic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.nff.ProjetoSpringIonic.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	@Query(value = "SELECT name FROM state as id INNERJOIN city = @state_id" , nativeQuery = true)
	State findState(@Param("id"));
	
}
