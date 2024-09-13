package com.car.car.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class CarEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column
    private UUID id;
    private String model;
    private String brand;
    private int noOfSeats;
    private boolean availability;
    private int prizePerDay;


    public CarEntity(){
    }

    public CarEntity(UUID id, String carName, String companyName, int noOfSeats,boolean availability, int prizePerDay){
        this.id = id;
        this.model = carName;
        this.brand = companyName;
        this.noOfSeats = noOfSeats;
        this.availability = availability;
        this.prizePerDay = prizePerDay;
    }

    public UUID getId(){
        return id;
    }
    public void setId(UUID id){
        this.id = id;
    }
    public String getModel(){
        return model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getBrand(){
        return brand;
    }
    public void setBrand(String brand){
        this.brand = brand;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    public boolean getAvailability(){
        return availability;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
    }
    public int getPrizePerDay(){
        return prizePerDay;
    }
    public void setPrizePerDay(int prizePerDay){
        this.prizePerDay = prizePerDay;
    }
    @Override
    public String toString(){
        return "CarEntity{" +
                "id=" + id +
                ", model=" + model +
                ", brand=" + brand +
                ", noOfSeats=" + noOfSeats +
                ", availability=" + availability +
                ",prizePerDay=" + prizePerDay +
                '}';
    }

}
