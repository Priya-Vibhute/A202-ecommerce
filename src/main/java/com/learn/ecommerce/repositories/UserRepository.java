package com.learn.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learn.ecommerce.entities.User;

public interface UserRepository extends JpaRepository<User, String> {

}
