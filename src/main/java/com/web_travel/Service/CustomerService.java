package com.web_travel.Service;

import com.web_travel.Domain.Customer;
import com.web_travel.Repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Optional<Customer> findOne(Long id) {
        return customerRepository.findById(id);
    }

    public Customer saveOne(Customer customer) {
        return customerRepository.save(customer);
    }
}
