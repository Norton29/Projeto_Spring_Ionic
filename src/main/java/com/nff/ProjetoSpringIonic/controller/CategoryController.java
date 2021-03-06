package com.nff.ProjetoSpringIonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.Service.CategoriesService;
import com.nff.ProjetoSpringIonic.domain.Categories;

@RestController
@RequestMapping(value = "/categorias")
public class CategoryController{

	@Autowired
	private CategoriesService categoriesService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categories> find(@PathVariable Integer id) {
			Categories cat = categoriesService.find(id);
			return ResponseEntity.ok().body(cat);			
	}
		
	@PostMapping(value = "/insert")
	public ResponseEntity<Categories> insert(@RequestBody Categories cat ){
		Categories categories = categoriesService.insert(cat); 
		return ResponseEntity.ok().body(categories);
				
	}
}
