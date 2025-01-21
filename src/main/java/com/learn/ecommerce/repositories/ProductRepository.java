package com.learn.ecommerce.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.ecommerce.entities.Product;
import com.learn.ecommerce.projections.ProductProjection;

@RepositoryRestResource(excerptProjection = ProductProjection.class)
public interface ProductRepository extends JpaRepository<Product, Integer>{
	
	List<Product> findByProductName(String productName);
	List<Product> findByProductNameStartingWith(String start);
	List<Product> findByProductNameContaining(String searchQuery);
	List<Product> findByOrderByProductPriceAsc();
	List<Product> findByOrderByProductPriceDesc();
	List<Product> findByProductPriceBetween(int sp,int ep);


}
