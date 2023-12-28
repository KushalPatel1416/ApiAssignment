package com.apiAssignment.entities;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long productId;

    private String productName;
    private int quantity;
    private double pricing;
    private double mrp;

    @OneToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getPricing() {
		return pricing;
	}

	public void setPricing(double pricing) {
		this.pricing = pricing;
	}

	public double getMrp() {
		return mrp;
	}

	public void setMrp(double mrp) {
		this.mrp = mrp;
	}
    
    
    
}
