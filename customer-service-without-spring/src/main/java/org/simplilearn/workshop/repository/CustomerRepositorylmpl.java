package org.simplilearn.workshop.repository;
import java.util.ArrayList;

import java.util.List;

import org.simplilearn.workshop.model.Customer;

public class CustomerRepositorylmpl implements CustomerRepository {
	private static List<Customer> customers = new ArrayList<Customer>();
	static {
		customers.add(new Customer(101L, "vinodh", "vinodh@simplilearn.com", "4567891234"));
		customers.add(new Customer(102L, "clarence", "clarence@simplilearn.com", "3178903289"));
		customers.add(new Customer(103L, "kavana", "kavana@simplilearn.com", "5678123490"));

	}

	public List<Customer> findAll() {
		return customers;
	}
}
