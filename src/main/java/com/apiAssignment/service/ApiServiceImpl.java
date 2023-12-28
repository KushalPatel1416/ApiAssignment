package com.apiAssignment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apiAssignment.dao.ApiDao;
import com.apiAssignment.dao.ProductDao;
import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;

@Service
public class ApiServiceImpl implements ApiService{
	
	@Autowired
	ApiDao dao;
	@Autowired
	ProductDao productdao;
	
	@Override
	public Customer addCustomer(Customer customer) {
		return dao.save(customer);
	}
	
	public Product addProduct(Product product) {
		return productdao.save(product);
	}

}
