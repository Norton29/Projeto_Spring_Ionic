package com.nff.ProjetoSpringIonic;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nff.ProjetoSpringIonic.Repositories.CategoryRepository;
import com.nff.ProjetoSpringIonic.domain.Categories;

@SpringBootApplication
public class ProjetoSpringIonicApplication implements CommandLineRunner{

	@Autowired
	private CategoryRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjetoSpringIonicApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Categories cat1 = new Categories(null,"Informática");
		Categories cat2 = new Categories(null,"Escritório");
		
		repo.saveAll(Arrays.asList(cat1, cat2));
	}

}
