package com.nff.ProjetoSpringIonic.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nff.ProjetoSpringIonic.Repositories.CategoryRepository;
import com.nff.ProjetoSpringIonic.Service.Exception.ObjectNotFoundException;
import com.nff.ProjetoSpringIonic.domain.Categories;

@Service
public class CategoriesService {

	@Autowired	
	private CategoryRepository categoryRepository;
	
	public Categories find(Integer id) {
		Optional<Categories> obj = categoryRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException( "Objeto não encontrado! Id: " + id + ", Tipo: " + Categories.class.getName())); 
	}
	
	public Categories insert(Categories cat) {
		return categoryRepository.save(cat);
	}
	
	
}
