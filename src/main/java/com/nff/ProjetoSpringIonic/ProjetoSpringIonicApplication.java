package com.nff.ProjetoSpringIonic;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nff.ProjetoSpringIonic.Repositories.CategoryRepository;
import com.nff.ProjetoSpringIonic.Repositories.ProductRepository;
import com.nff.ProjetoSpringIonic.domain.Categories;
import com.nff.ProjetoSpringIonic.domain.Product;

@SpringBootApplication
public class ProjetoSpringIonicApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository repo;
	
	@Autowired
	private ProductRepository repoProduct;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringIonicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categories cat1 = new Categories(null,"Informática");
		Categories cat2 = new Categories(null,"Escritório");
		
		Product p1 =new Product(null, "Computador", 2000.00);
		Product p2 =new Product(null, "Impressora", 800.00);
		Product p3 =new Product(null, "Mouse", 20.00);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2, p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		repo.saveAll(Arrays.asList(cat1, cat2));
		repoProduct.saveAll(Arrays.asList(p1,p2,p3));
	}

}
