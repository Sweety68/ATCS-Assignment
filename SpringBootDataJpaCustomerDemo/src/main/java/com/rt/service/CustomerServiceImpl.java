package com.rt.service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rt.dao.CustomerDao;
import com.rt.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public Customer addCustomer(Customer customer) {
		return dao.save(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return dao.save(customer);
	}

	@Override
	public void deleteCustomer(int cId) {
		
		 dao.deleteById(cId);
	}

	@Override
	public Optional<Customer> getCustomer(int cId) {
		
		return dao.findById(cId);
	}

	@Override
	public Iterable<Customer> getAllCustomers() {
		
		return dao.findAll();
	}

}
