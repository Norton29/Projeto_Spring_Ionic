package com.nff.ProjetoSpringIonic.Service;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nff.ProjetoSpringIonic.Repositories.ProductRepository;
import com.nff.ProjetoSpringIonic.Service.Exception.ObjectNotFoundException;
import com.nff.ProjetoSpringIonic.domain.Product;

@Service
public class ProductService {

	@Autowired	
	private ProductRepository productRepository;
	
	public Product find(Integer id) {
		Optional<Product> obj = productRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id + ", Tipo: " + Product.class.getName()));
	}
	
	public Product insert(Product product) {
		return productRepository.save(product);
	}
	
	
}
