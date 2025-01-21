package com.learn.ecommerce.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int categoryId;
	
	private String categoryName;
	
	@OneToMany(mappedBy = "category",cascade = 
		{CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH})
	
	private List<Product> products;

}
