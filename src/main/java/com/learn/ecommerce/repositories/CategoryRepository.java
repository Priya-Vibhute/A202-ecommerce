package com.learn.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.learn.ecommerce.entities.Category;
import com.learn.ecommerce.projections.CategoryProjection;

@CrossOrigin
@RepositoryRestResource(path = "category",excerptProjection = CategoryProjection.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {

	
}
