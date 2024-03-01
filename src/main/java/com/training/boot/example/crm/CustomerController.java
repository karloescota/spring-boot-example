package com.training.boot.example.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepo;

    @Autowired
    private CRM crm;

    @GetMapping
    List<Customer> listCustomers() {
        return crm.listCustomers(); // note: sample using Service
    }

    @GetMapping("/{id}")
    Optional<Customer> getCustomer(@PathVariable Integer id) {
        return customerRepo.findById(id); // note: sample using Repo
    }

    @PostMapping
    Customer createCustomer(@RequestBody Customer customer) {
        return customerRepo.save(customer);
    }

    @PutMapping("/{id}")
    Customer updateCustomer(@RequestBody Customer customer, @PathVariable Integer id) {
        return crm.updateCustomer(id, customer);
    }

    @DeleteMapping("/{id}")
    void deleteCustomer(@PathVariable Integer id) {
        customerRepo.deleteById(id);
    }
}
