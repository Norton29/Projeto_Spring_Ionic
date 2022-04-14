package com.nff.ProjetoSpringIonic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.Service.CategoriesService;
import com.nff.ProjetoSpringIonic.domain.Categories;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(value = "/categorias")
@RequiredArgsConstructor
public class CategoryController{

	private final CategoriesService service;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Categories> find(@PathVariable Integer id) {
		Categories cat = service.find(id);
		return ResponseEntity.ok().body(cat);
		
		
	}
}
