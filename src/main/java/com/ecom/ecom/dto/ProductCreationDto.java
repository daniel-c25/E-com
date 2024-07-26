package com.ecom.ecom.dto;

import java.math.BigDecimal;

import com.ecom.ecom.entity.Category;
public class ProductCreationDto {
	
	private Long id;
	private String productName;
	private String description;
	private BigDecimal price;
	private Integer inStock;
	private String imageUrl;
	private Category category;
	
}
