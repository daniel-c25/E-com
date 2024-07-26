package com.ecom.ecom.entity;

import java.util.Date;
import java.util.Objects;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "_order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "customer_id")
	private User customerId;
	
	private Date orderDate;
	
	@OneToMany
	private Set<OrderItem> orderItems;
	
	@Enumerated(EnumType.STRING)
	private OrderStatus orderStatus;
	
	public User getCustomerId() {
		return customerId;
	}
	public void setCustomerId(User customerId) {
		this.customerId = customerId;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public OrderStatus getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(OrderStatus orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}
	public Long getId() {
		return id;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", customerId=" + customerId + ", orderDate=" + orderDate + ", orderItems="
				+ orderItems + ", orderStatus=" + orderStatus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerId, id, orderDate, orderItems, orderStatus);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(customerId, other.customerId) && Objects.equals(id, other.id)
				&& Objects.equals(orderDate, other.orderDate) && Objects.equals(orderItems, other.orderItems)
				&& orderStatus == other.orderStatus;
	}
	
	
}
