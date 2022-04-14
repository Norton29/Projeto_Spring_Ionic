package com.nff.ProjetoSpringIonic.Service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nff.ProjetoSpringIonic.Repositories.CategoryRepository;
import com.nff.ProjetoSpringIonic.domain.Categories;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoriesService {

	private final CategoryRepository repo;
	
	public Categories find(Integer id) {
		Optional<Categories> obj = repo.findById(id);
		return obj.orElse(null);
	}
	
	
}
