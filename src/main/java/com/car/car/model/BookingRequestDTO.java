package com.car.car.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

//@JsonDeserialize(builder = BookingRequestDTO.Builder.class)
public class BookingRequestDTO {

    //  private UUID bookingId;
    private UUID customerId;
    private UUID carId;
  //  private LocalDate bookingDate;
    private int noOfDays;
    private LocalDate rentStartDate;
  //  private LocalDate rentEndDate;
    private double paidAmount;
  //  private double balanceAmount;

    public BookingRequestDTO(){
    }

//    public LocalDate getRentEndDate() {
//        return rentEndDate;
//    }
//    public UUID getBookingId(){
//        return bookingId;
//    }
    public UUID getCustomerId() {
        return customerId;
    }

    public UUID getCarId() {
        return carId;
    }

//    public double getBalanceAmount() {
//        return balanceAmount;
//    }
//
//    public LocalDate getBookingDate() {
//        return bookingDate;
//    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }
    public double getPaidAmount(){
        return paidAmount;
    }

//    @JsonPOJOBuilder(withPrefix = "")
//    public static class Builder{
//        private BookingRequestDTO booking;
//
////        public Builder bookingId(UUID bookingId){
////            booking.bookingId = bookingId;
////            return this;
////        }
//        public Builder customerId(UUID customerId){
//            booking.customerId = customerId;
//            return this;
//        }
//        public Builder carId(UUID carId){
//            booking.carId = carId;
//            return this;
//        }
////        public Builder bookingDate(LocalDate bookingDate){
////            booking.bookingDate = bookingDate;
////            return this;
////        }
//        public Builder noOfDays(int noOfDays){
//            booking.noOfDays = noOfDays;
//            return this;
//        }
//        public Builder rentStartDate(LocalDate rentStartDate){
//            booking.rentStartDate = rentStartDate;
//            return this;
//        }
////        public Builder rentEndDate(LocalDate rentEndDate){
////            booking.rentEndDate = rentEndDate;
////            return this;
////        }
//        public Builder paidAmount(double paidAmount){
//            booking.paidAmount = paidAmount;
//            return this;
//        }
////        public Builder balanceAmount(double balanceAmount){
////            booking.balanceAmount = balanceAmount;
////            return this;
////        }
//        public BookingRequestDTO build(){
//            return booking;
//        }
//    }

    @Override
    public String toString() {
        return "BookingRequestDTO{" +
                "customerId=" + customerId +
                ", carId=" + carId +
                ", noOfDays=" + noOfDays +
                ", rentStartDate=" + rentStartDate +
                ", paidAmount=" + paidAmount +
                '}';
    }

}
