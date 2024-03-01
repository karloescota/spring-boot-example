package com.training.boot.example.crm;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CRM {
    @Autowired
    private CustomerRepository customerRepo;

    public List<Customer> listCustomers() {
        return customerRepo.findAll();
    }

    public Customer updateCustomer(Integer id, Customer customer) {
        return customerRepo.findById(id)
                .map(c -> {
                    // update method here

                    c.setFirstName(customer.getFirstName());
                    c.setLastName(customer.getLastName());

                    return customerRepo.save(c);
                })
                .orElseGet(() -> customer);
    }
}
