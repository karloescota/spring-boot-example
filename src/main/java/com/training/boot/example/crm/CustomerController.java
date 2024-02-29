package com.training.boot.example.crm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @Autowired
    private CustomerRepository customers;

    @GetMapping
    List<Customer> listCustomers() {
        return customers.findAll();
    }

    @GetMapping("/{id}")
    Optional<Customer> getCustomer(@PathVariable Integer id) {
        return customers.findById(id);
    }

    @PostMapping
    Customer createCustomer(@RequestBody Customer newCustomer) {
        return customers.save(newCustomer);
    }

    @PutMapping("/{id}")
    Customer updateCustomer(@RequestBody Customer newCustomer, @PathVariable Integer id) {
        return customers.findById(id)
                .map(customer -> {
                    customer.setFirstName(newCustomer.getFirstName());
                    customer.setLastName(newCustomer.getLastName());
                    return customers.save(customer);
                })
                .orElseGet(() -> newCustomer); // ? should be not found
    }

    @DeleteMapping("/{id}")
    void deleteCustomer(@PathVariable Integer id) {
        customers.deleteById(id);
    }
}
