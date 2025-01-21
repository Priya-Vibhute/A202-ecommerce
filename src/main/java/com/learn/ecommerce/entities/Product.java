package com.learn.ecommerce.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(nullable = false)
	private String productName;
	
	@Column(nullable = false)
    private String productDescription;
	
	@Column(nullable = false)
    private int productPrice;
	
	@ManyToOne
	private Category category;
	
	
	
}
