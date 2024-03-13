package com.example.dadl.service.impl;

import com.example.dadl.model.Customer.Customer;
import com.example.dadl.repository.ICustomerRepository;
import com.example.dadl.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;
    @Override
    public Iterable<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
       customerRepository.save(customer);
    }

    @Override
    public void update(Customer customer) {
        Optional<Customer>customerFind = customerRepository.findById(customer.getId());
        Customer customer1 = (Customer) customerFind.get();
        customer1.setId(customer.getId());
        customerRepository.save(customer1);

    }

    @Override
    public void delete(Customer customer) {
           customerRepository.delete(customer);
      }
}
