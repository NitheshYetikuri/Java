package com.furniturestore.entity;

import lombok.Data;

@Data
public class OrderProductQuantity {
	
	private Integer productId;
	private Integer quantity;
	public OrderProductQuantity() {
		super();
	}

}
