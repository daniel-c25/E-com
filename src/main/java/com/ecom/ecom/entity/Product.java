package com.ecom.ecom.entity;

import java.math.BigDecimal;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String productName;
	private String description;
	private BigDecimal price;
	private Integer inStock;
	private String imageUrl;
	
	@ManyToOne
	private Category category;
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public Integer getInStock() {
		return inStock;
	}
	public void setInStock(Integer inStock) {
		this.inStock = inStock;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public Category getCategory() {
		return category;
	}
	public void setCategory(Category category) {
		this.category = category;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", description=" + description
				+ ", price=" + price + ", inStock=" + inStock + ", imageUrl=" + imageUrl + ", category=" + category
				+ "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(category, description, imageUrl, inStock, price, id, productName);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(category, other.category) && Objects.equals(description, other.description)
				&& Objects.equals(imageUrl, other.imageUrl) && Objects.equals(inStock, other.inStock)
				&& Objects.equals(price, other.price) && Objects.equals(id, other.id)
				&& Objects.equals(productName, other.productName);
	}
	
}
