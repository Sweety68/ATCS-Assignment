package com.ia;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.ia.entity.Customer;
import com.ia.service.CustomerService;


@SpringBootTest
class SpringBootcustomerDemoApplicationTests {

	@Autowired
	CustomerService service;
	
//	@Test
//	void testAddCustomer() {
//		Customer cust1 = new Customer(111,"sweety",1111,"jaipur");
//		Customer c1=service.addCustomer(cust1);
//		assertEquals(cust1.getcName(),"sweety");
//		
//	}

//	@Test
//	void testupdateCustomer() {
//		Customer cust1 = new Customer(111,"sweetyjain",1111,"jaipur");
//		Customer c1=service.updateCustomer(cust1);
//		assertEquals(cust1.getcName(),"sweetyjain");
//		
//	}
	
//	@Test
//	void testGetAllCustomers() {
//		List <Customer> customers = service.getAllCustomers();
//		assertTrue(customers.size()>0,"sweetyjain");
//		
//	}
	
	@Test
	void testDeleteEmployee() {
		String ctmr = service.deleteCustomer(111);
		assertEquals(ctmr,"customer deleted");
		
	}
}
