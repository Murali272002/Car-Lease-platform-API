package com.car.car.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.util.UUID;

@JsonDeserialize(builder = Car.Builder.class)
public class Car {

    private UUID id;
    private String model;
    private String brand;
    private int noOfSeats;
    private boolean availability;
    private int prizePerDay;

    private Car(){
    }

    public UUID getId(){
        return id;
    }
    public String getModel(){
        return model;
    }
    public String getBrand(){
        return brand;
    }
    public int getNoOfSeats(){
        return noOfSeats;
    }
    public boolean getAvailability(){
        return availability;
    }
    public int getPrizePerDay(){
        return prizePerDay;
    }
    public void setAvailability(boolean availability){
        this.availability = availability;
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
        public Builder model(String carName){
            car.model = carName;
            return this;
        }
        public Builder brand(String companyName){
            car.brand = companyName;
            return this;
        }
        public Builder noOfSeats(int noOfSeats){
            car.noOfSeats = noOfSeats;
            return this;
        }
        public Builder availability(boolean availability){
            car.availability = availability;
            return this;
        }
        public Builder prizePerDay(int prizePerDay){
            car.prizePerDay = prizePerDay;
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
                ", model=" + model + '\'' +
                ", brand=" + brand + '\'' +
                ", noOfSeats=" + noOfSeats + '\'' +
                ", availability=" + availability + '\'' +
                ", prizePerDay=" + prizePerDay + '\'' +
                '}';
    }

}
