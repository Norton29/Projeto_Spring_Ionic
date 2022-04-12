package com.nff.ProjetoSpringIonic.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.domain.Categories;

@RestController
@RequestMapping(value = "/categorias")
public class CategoryController {

	@GetMapping
	public List<Categories> listar() {
		
		Categories cat1 = new Categories(1, "Informatica");
		Categories cat2 = new Categories(1, "Livros");		
		List<Categories> list = new ArrayList<>();
		list.add(cat1);
		list.add(cat2);		
		return list;
	}
}
