package com.car.car.mapper;

import com.car.car.entity.CustomerEntity;
import com.car.car.model.Customer;

import java.util.function.Function;

public class CustomerMapper {

    public static Function<CustomerEntity,Customer> TO_MODEL = customerEntity -> {
        Customer customer = new Customer.Builder()
                .id(customerEntity.getId())
                .name(customerEntity.getName())
                .street(customerEntity.getStreet())
                .place(customerEntity.getPlace())
                .zipCode(customerEntity.getZipCode())
                .eMail(customerEntity.geteMail())
                .phoneNumber(customerEntity.getPhoneNumber())
                .build();
        return customer;
    };

    public static Function<Customer, CustomerEntity> TO_ENTITY = (customer) -> new CustomerEntity(customer.getId(),customer.getName(), customer.getStreet(), customer.getZipCode(), customer.getPlace(), customer.geteMail(), customer.getPhoneNumber());
}
