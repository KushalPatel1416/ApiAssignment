package com.apiAssignment.service;

import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;

public interface ApiService{
	
	public Customer addCustomer(Customer customer);
	
	public Product addProduct(Product product);
}
