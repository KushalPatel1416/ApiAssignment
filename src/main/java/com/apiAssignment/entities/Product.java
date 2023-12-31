package com.apiAssignment.entities;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class Product {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long purchaseOrderId;

    private String productName;
    private int quantity;
    private long pricing;
    private long mrp;
    
    @ManyToOne(cascade = CascadeType.PERSIST,fetch = FetchType.EAGER)
    @JsonBackReference
    @JoinColumn(name="customer_id")
    Customer customer;  
    
    
//    @OneToMany(mappedBy = "product")
//    //@JsonManagedReference
//    private List<Shipment> shipment;

	public long getPurchaseOrderId() {
		return purchaseOrderId;
	}

	public void setPurchaseOrderId(long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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

	public long getPricing() {
		return pricing;
	}

	public void setPricing(long pricing) {
		this.pricing = pricing;
	}

	public long getMrp() {
		return mrp;
	}

	public void setMrp(long mrp) {
		this.mrp = mrp;
	}
    
    
    
}
