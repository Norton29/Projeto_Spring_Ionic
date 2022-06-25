package com.nff.ProjetoSpringIonic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nff.ProjetoSpringIonic.Service.ProductService;
import com.nff.ProjetoSpringIonic.domain.Product;

@RestController
@RequestMapping(value = "/product")
public class ProductController{

	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> find(@PathVariable Integer id) {
		Product product = productService.find(id);
		return ResponseEntity.ok().body(product);		
		
	}
		
	@PostMapping(value = "/insert")
	public ResponseEntity<Product> insert(@RequestBody Product pro ){
		Product product = productService.insert(pro); 
		return ResponseEntity.ok().body(product);
				
	}
}
