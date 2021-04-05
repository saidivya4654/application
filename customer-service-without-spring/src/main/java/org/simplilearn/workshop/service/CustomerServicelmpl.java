package org.simplilearn.workshop.service;
    import org.simplilearn.workshop.model.Customer;
	import java.util.List;
	import org.simplilearn.workshop.repository.CustomerRepository;
	import org.simplilearn.workshop.repository.CustomerRepositorylmpl;

	public class CustomerServicelmpl implements CustomerService{
		
		private CustomerRepository customerRepository =new CustomerRepositorylmpl();
		public List<Customer> retrieveAllCustomers(){
			return customerRepository.findAll();
		}
}
