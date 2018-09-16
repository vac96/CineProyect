package sv.com.cine.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.cine.models.entities.Customer;

public interface ICustomerDao extends CrudRepository<Customer, Long> {

}
