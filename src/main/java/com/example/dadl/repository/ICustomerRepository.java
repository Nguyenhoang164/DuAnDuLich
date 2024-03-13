package com.example.dadl.repository;

import com.example.dadl.model.Customer.Customer;
import org.springframework.data.repository.CrudRepository;

public interface ICustomerRepository extends CrudRepository<Customer , Integer> {
}
