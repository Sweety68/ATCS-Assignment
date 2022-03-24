package com.rt.dao;

import org.springframework.data.repository.CrudRepository;

import com.rt.entity.Customer;

public interface CustomerDao extends CrudRepository<Customer,Integer> {

	
	
}
