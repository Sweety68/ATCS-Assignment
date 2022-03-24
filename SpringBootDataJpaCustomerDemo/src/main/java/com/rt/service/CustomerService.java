package com.rt.service;

import java.util.List;
import java.util.Optional;

import com.rt.entity.Customer;

public interface CustomerService {
	
       Customer addCustomer(Customer customer);
       Customer updateCustomer(Customer customer);
       void deleteCustomer(int cId);
       Optional<Customer> getCustomer(int cId);
       Iterable<Customer> getAllCustomers();
	
	
	
}
