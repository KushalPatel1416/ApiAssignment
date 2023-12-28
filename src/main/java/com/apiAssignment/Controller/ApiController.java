package com.apiAssignment.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.apiAssignment.entities.Customer;
import com.apiAssignment.entities.Product;
import com.apiAssignment.service.ApiService;

@RestController
public class ApiController {
	
	@Autowired
	ApiService service;
	
	@GetMapping("/home")
	public String gethome() {
		
		return "This is home page";
	}
	
	//adding customer and its details
	@PostMapping("/addcustomer")
	public Customer addCustomer(@RequestBody Customer customer) {
		
		return this.service.addCustomer(customer);
	}
	
	//adding product
	@PostMapping("/addproduct")
	public Product addProduct(@RequestBody Product product) {
		
		return this.service.addProduct(product);
		
	}
	
	
}
