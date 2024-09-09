package com.car.car.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CustomerEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column
    private UUID id;
    private String name;
    private String street;
    private int zipCode;
    private String place;
    private String eMail;
    private int phoneNumber;

    public CustomerEntity(){
    }
    public CustomerEntity(UUID id,String name,String street, int zipCode, String place, String eMail,int phoneNumber){
            this.id = id;
            this.name = name;
            this.street = street;
            this.zipCode = zipCode;
            this.place = place;
            this.eMail = eMail;
            this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", zipCode=" + zipCode +
                ", place='" + place + '\'' +
                ", eMail='" + eMail + '\'' +
                ", phoneNumber=" + phoneNumber +
                '}';
    }

}
