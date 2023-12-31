package com.apiAssignment.service;

import java.util.List;

import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;
import com.apiAssignment.entities.Shipment;

public interface ApiService{
	
	public Customer addCustomer(Customer customer);
	
	public List<Customer> getAllCustomer();
	
	public Product addProduct(Product product);
	
	public Shipment addShipment(Shipment shipment);

	public List<Product> getAllProduct();

	public List<Shipment> getAllShipment();

	//public List<Customer> getCustomer(long customerId);
	
	
	
}
