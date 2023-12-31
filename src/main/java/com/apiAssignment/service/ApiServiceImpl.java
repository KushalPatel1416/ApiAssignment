package com.apiAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiAssignment.dao.ApiDao;
import com.apiAssignment.dao.ProductDao;
import com.apiAssignment.dao.ShipmentDao;
import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;
import com.apiAssignment.entities.Shipment;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	ApiDao dao;
	@Autowired
	ProductDao productdao;
	@Autowired
	ShipmentDao shipmentdao;
	
	
	public Customer addCustomer(Customer customer) {
		return dao.save(customer);
	}
	
	
	public List<Customer> getAllCustomer() {
		
		return dao.findAll();
	}
	
	
//	public List<Customer> getCustomer(long customerId) {
//		
//		return (List<Customer>) dao.getOne(customerId);
//	}

	
	//Product
	
	
	public Product addProduct(Product product) {
		return productdao.save(product);
	}
	
	
	public List<Product> getAllProduct() {
		
		return productdao.findAll();
	}
	
	
	
	//Shipment
	
	public Shipment addShipment(Shipment shipment) {
		return shipmentdao.save(shipment);
	}


	@Override
	public List<Shipment> getAllShipment() {
		return shipmentdao.findAll();
	}


	

	



	
}
