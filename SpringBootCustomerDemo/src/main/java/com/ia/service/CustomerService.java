package com.ia.service;

import java.util.List;

import java.util.List;

import com.ia.entity.Customer;

public interface CustomerService {
	
       Customer addCustomer(Customer customer);
       Customer updateCustomer(Customer customer);
       String deleteCustomer(int cId);
       Customer getCustomer(int cId);
       List <Customer> getAllCustomers();
	
	
	
}
