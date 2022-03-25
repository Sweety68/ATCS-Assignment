package com.ia.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ia.dao.CustomerDao;
import com.ia.entity.Customer;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {
	
	@Autowired
	CustomerDao dao;

	@Override
	public Customer addCustomer(Customer customer) {
		return dao.addCustomer(customer);
	}

	@Override
	public Customer updateCustomer(Customer customer) {
		
		return dao.updateCustomer(customer);
	}

	@Override
	public String deleteCustomer(int cId) {
		
		return dao.deleteCustomer(cId);
	}

	@Override
	public Customer getCustomer(int cId) {
		// TODO Auto-generated method stub
		return dao.getCustomer(cId);
	}

	@Override
	public List <Customer> getAllCustomers() {
		
		return dao.getAllCustomers();
	}

}
