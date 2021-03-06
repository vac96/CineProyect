package sv.com.cine.models.services;

import java.util.List;

import sv.com.cine.models.entities.Customer;

public interface ICustomerService {
	
	public List<Customer> findAll();
	
	public void save(Customer customer);
	
	public Customer findOne(Long id);
	
	public void delete(Long id);

}
