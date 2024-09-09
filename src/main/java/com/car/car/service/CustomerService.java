package com.car.car.service;

import com.car.car.entity.CustomerEntity;
import com.car.car.mapper.CustomerMapper;
import com.car.car.model.Customer;
import com.car.car.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public String getName(){
        return "Muralidharan.N";
    }

    public Customer addCustomer(Customer customer){
        CustomerEntity customerEntity = CustomerMapper.TO_ENTITY.apply(customer);
           customerRepository.save(customerEntity);
           return CustomerMapper.TO_MODEL.apply(customerEntity);
    }

    public List<Customer> getCustomers(){
    List<CustomerEntity> customerEntities = customerRepository.findAll();
        return customerEntities.stream().map(customerEntity -> CustomerMapper.TO_MODEL.apply(customerEntity)).collect(Collectors.toList());
    }
}
