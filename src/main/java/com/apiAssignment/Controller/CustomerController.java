package com.apiAssignment.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;
import com.apiAssignment.entities.Shipment;
import com.apiAssignment.service.ApiService;

@RestController
public class CustomerController {
	
	@Autowired
	ApiService service;
	
	//adding customer and its details
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return this.service.addCustomer(customer);
	}
	
	//Getting all customers
	@GetMapping("/getallCustomer")
	public List<Customer> getAllCustomer(){
		
		return this.service.getAllCustomer();
	}
	
	//Getting a single customer
//	@GetMapping("/getCustomer/{customerId}")
//	public List <Customer> getCustomer(@PathVariable String customerId) {
//		
//		return this.service.getCustomer(Long.parseLong(customerId));
//	}
	
	
	
	
	
}
