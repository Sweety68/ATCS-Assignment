package com.ia.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.ia.entity.Customer;

@Repository
public class CustomerDaoImpl implements CustomerDao {

	@PersistenceContext
	EntityManager entity;
	
	@Override
	public Customer addCustomer(Customer customer) {
		entity.persist(customer);
		return entity.find(Customer.class, customer.getcId());
	}

	@Override
	public Customer updateCustomer(Customer customer) {
	
		return entity.merge(customer);
	}

	@Override
	public String deleteCustomer(int cId) {
		Customer c = entity.find(Customer.class,cId);
		if(c!=null) {
			return "find customer successfully";
		}
		else {
			return "customer not found";
		}
		
	}

	@Override
	public Customer getCustomer(int cId) {
		
		return entity.find(Customer.class,cId);
	}

	@Override
	public List<Customer> getAllCustomers() {
		TypedQuery<Customer> result = entity.createQuery("select c from customer c",Customer.class);
		return result.getResultList();
	}

}
