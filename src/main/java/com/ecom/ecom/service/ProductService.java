package com.ecom.ecom.service;

import org.springframework.web.bind.annotation.GetMapping;

import com.ecom.ecom.entity.Product;
import com.ecom.ecom.repository.ProductRepository;

public class ProductService {

	private final ProductRepository productRepository;
	
	public ProductService(ProductRepository productRepository) {
		this.productRepository=productRepository;
	}
	
	@GetMapping("/createProduct")
	public Product createProduct() {
		return productRepository.save(null);
	}
}
