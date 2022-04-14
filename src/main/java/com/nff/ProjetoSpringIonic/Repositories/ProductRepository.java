package com.nff.ProjetoSpringIonic.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nff.ProjetoSpringIonic.domain.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
