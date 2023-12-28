package com.apiAssignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apiAssignment.entities.Customer;

public interface ApiDao extends JpaRepository<Customer, Long> {
		

}


