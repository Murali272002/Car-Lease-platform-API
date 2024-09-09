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
    private String carName;
    private String companyName;
    private int noOfSeats;
    private boolean co2Emission;

    public CarEntity(){
    }

    public CarEntity(UUID id, String carName, String companyName, int noOfSeats, boolean co2Emission){
        this.id = id;
        this.carName = carName;
        this.companyName = companyName;
        this.noOfSeats = noOfSeats;
        this.co2Emission = co2Emission;
    }

    public UUID getId(){
        return id;
    }
    public void setId(UUID id){
        this.id = id;
    }
    public String getCarName(){
        return carName;
    }
    public void setCarName(String carName){
        this.carName = carName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public void setNoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }
    public boolean getCo2Emission(){
        return co2Emission;
    }
    public void setCo2Emission(boolean co2Emission){
        this.co2Emission = co2Emission;
    }
    @Override
    public String toString(){
        return "CarEntity{" +
                "id=" + id +
                ", carName=" + carName +
                ", companyName=" + companyName +
                ", noOfSeats=" + noOfSeats +
                ",co2Emission=" + co2Emission +
                '}';
    }

}
