package com.nff.ProjetoSpringIonic.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.nff.ProjetoSpringIonic.domain.State;

@Repository
public interface StateRepository extends JpaRepository<State, Integer> {

	@Query(value = "SELECT A.name FROM state A JOIN city B on A.id = B.state_id WHERE B.id = @parametro ", nativeQuery = true)
	Optional<State> findState(@Param("parametro")Integer id);
	
	
	//SELECT A.name FROM state A INNER JOIN city B ON A.id = B.state_id;
}
