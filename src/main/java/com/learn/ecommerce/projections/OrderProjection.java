package com.learn.ecommerce.projections;

import java.time.LocalDateTime;

public interface OrderProjection {
	
	String getOrderId();
	LocalDateTime getCreatedAt();
	LocalDateTime getUpdatedAt();

}
