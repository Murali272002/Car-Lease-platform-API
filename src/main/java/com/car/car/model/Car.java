package com.car.car.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.UUID;

@JsonDeserialize(builder = Car.Builder.class)
public class Car {

    private UUID id;
    private String carName;
    private String companyName;
    private int noOfSeats;
    private boolean co2Emission;

    private Car(){
    }

    public UUID getId(){
        return id;
    }
    public String getCarName(){
        return carName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public boolean getCo2Emission(){
        return co2Emission;
    }

    @JsonPOJOBuilder(withPrefix = "")
    public static class Builder{

        private Car car;

        public Builder(){
            car = new Car();
        }
        public Builder id(UUID id){
            car.id = id;
            return this;
        }
        public Builder carName(String carName){
            car.carName = carName;
            return this;
        }
        public Builder companyName(String companyName){
            car.companyName = companyName;
            return this;
        }
        public Builder noOfSeats(int noOfSeats){
            car.noOfSeats = noOfSeats;
            return this;
        }
        public Builder co2Emission(boolean co2Emission){
            car.co2Emission = co2Emission;
            return this;
        }
        public Car build(){
            return car;
        }
    }

    @Override
    public String toString(){
        return "Car{" +
                "id=" + id +
                ", carName=" + carName + '\'' +
                ", companyName=" + companyName + '\'' +
                ", noOfSeats=" + noOfSeats + '\'' +
                ", co2Emission=" + co2Emission + '\'' +
                '}';
    }

}
