package com.apiAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiAssignment.entities.Product;

public interface ProductDao extends JpaRepository<Product,Long>{
	
	
}
