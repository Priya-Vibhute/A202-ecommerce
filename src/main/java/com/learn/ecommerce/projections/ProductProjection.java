package com.learn.ecommerce.projections;

public interface ProductProjection {
	
	int getProductId();
	String getProductName();
	int getProductPrice();
	
	default double getDiscount()
	{
		return this.getProductPrice()*0.8;
	}
	
	
	

}
