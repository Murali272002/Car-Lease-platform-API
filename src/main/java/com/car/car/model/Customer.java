package com.car.car.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.UUID;

@JsonDeserialize(builder = Customer.Builder.class)
public class Customer {

    private UUID id;
    private String name;
    private String street;
    private int zipCode;
    private String place;
    private String eMail;
    private int phoneNumber;

    private Customer(){
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getStreet() {
        return street;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getPlace() {
        return place;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString(){
        return "Customer{" +
                "id=" + id +
                ",name='" + name + '\'' +
                ",street='" + street + '\'' +
                ",zipCode='" + zipCode + '\'' +
                ",place='" + place + '\'' +
                ",eMail='" + eMail + '\'' +
                ",phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder{

        private Customer customer;

        public Builder(){
            customer = new Customer();
        }

        public Builder id(UUID id){
            customer.id = id;
            return this;
        }

        public Builder name(String name){
            customer.name = name;
            return this;
        }

        public Builder street(String street){
            customer.street = street;
            return this;
        }

        public Builder zipCode(int zipCode){
            customer.zipCode = zipCode;
            return this;
        }

        public Builder place(String place){
            customer.place = place;
            return this;
        }

        public Builder eMail(String eMail){
            customer.eMail = eMail;
            return this;
        }

        public Builder phoneNumber(int phoneNumber){
            customer.phoneNumber = phoneNumber;
            return this;
        }

        public Customer build(){
            return customer;
        }
    }

}
