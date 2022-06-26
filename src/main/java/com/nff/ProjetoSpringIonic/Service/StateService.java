package com.nff.ProjetoSpringIonic.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nff.ProjetoSpringIonic.Repositories.StateRepository;
import com.nff.ProjetoSpringIonic.Service.Exception.ObjectNotFoundException;
import com.nff.ProjetoSpringIonic.domain.State;

@Service
public class StateService {

	@Autowired	
	private StateRepository stateRepository;
	
	public State find(Integer id) {
		Optional<State> state = stateRepository.findById(id);
		return state.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + State.class.getName()));
	}
	
	public State findState(Integer id) {
		Optional<State> state = stateRepository.findState(id);
		return state.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + State.class.getName()));
	}
	
	public State insert(State state) {
		return stateRepository.save(state);
	}
	
	
}
