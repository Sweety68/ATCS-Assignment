package com.rt.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rt.entity.Customer;
import com.rt.service.CustomerService;


@RestController
@RequestMapping("/customer")                  //  http://localhost:5678/customer
public class CustomerController {
	
	@Autowired
	CustomerService service;
	
	//post-insert,put-update,get-get,delete-remove
	
	@PostMapping("/addCustomer")               //  http://localhost:5678/customer/addCustomer
	public Customer addCustomer(@RequestBody Customer cust) {
		
		return service.addCustomer(cust);
		
	}
	
	@PutMapping("/updateCustomer")            //  http://localhost:5678/customer/updateCustomer
	public Customer updateCustomer(@RequestBody Customer cust) {
		
		return service.updateCustomer(cust);
		
	}

	@GetMapping("/getCustomer/{cid}")        //  http://localhost:4321/customer/getCustomer/cid
	public Optional<Customer> getCustomer(@PathVariable("eid") int cId) {
		
		return service.getCustomer(cId);
		
	}
	
	@GetMapping("/getAllCustomers")          //  http://localhost:4321/customer/getAllCustomers
	public Iterable<Customer> getAllCustomers() {
		
		return service.getAllCustomers();
		
	}
	
	@DeleteMapping("/deleteCustomer/(cid)")      //  http://localhost:4321/customer/deleteCustomer/eid
	public void deleteCustomer(@PathVariable("cid") int cId) {
		
		 service.deleteCustomer(cId);
		
	}
}
