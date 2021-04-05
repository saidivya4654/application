package org.simplilearn.workshop;

import java.util.List;

import org.simplilearn.workshop.model.Customer;
import org.simplilearn.workshop.service.CustomerService;
import org.simplilearn.workshop.service.CustomerServicelmpl;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsoleApplication {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerService customerService = new CustomerServicelmpl();
		List<Customer> loadedCustomers = customerService.retrieveAllCustomers();
		for (Customer element : loadedCustomers) {
			System.out.println(element.getName());
		}
		
	}
}
