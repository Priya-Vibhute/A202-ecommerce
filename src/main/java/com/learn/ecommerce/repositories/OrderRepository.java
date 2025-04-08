package com.learn.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.learn.ecommerce.entities.Order;
import com.learn.ecommerce.projections.OrderProjection;

@RepositoryRestResource(excerptProjection = OrderProjection.class)
public interface OrderRepository extends JpaRepository<Order, String> {

}
