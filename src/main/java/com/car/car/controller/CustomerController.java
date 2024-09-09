package com.car.car.controller;

import com.car.car.model.Customer;
import com.car.car.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/getname")
    public String getName(){
        return customerService.getName();
    }

    @PostMapping("/customer")
    public Customer addCustomer(@RequestBody Customer customer){
       return customerService.addCustomer(customer);
    }

    @GetMapping("/customers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
}
