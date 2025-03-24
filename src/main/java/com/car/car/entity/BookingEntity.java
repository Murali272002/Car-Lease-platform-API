package com.car.car.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.UUID;

@Entity
public class BookingEntity {

    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name = "uuid2", strategy = "uuid2")
    @Column
    private UUID bookingId;
    private UUID customerId;
    private UUID carId;
    private LocalDate bookingDate;
    private int noOfDays;
    private LocalDate rentStartDate;
    private LocalDate rentEndDate;
    private double paidAmount;
    private double balanceAmount;

    public LocalDate getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(LocalDate bookingDate) {
        this.bookingDate = bookingDate;
    }

    public LocalDate getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(LocalDate rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public double getBalanceAmount() {
        return balanceAmount;
    }

    public void setBalanceAmount(double balanceAmount) {
        this.balanceAmount = balanceAmount;
    }

    public BookingEntity(){

    }
    public BookingEntity(UUID bookingId,UUID customerId, UUID carId,LocalDate bookingDate,int noOfDays, LocalDate rentStartingDate,LocalDate rentEndDate, double amountPaid,double balanceAmount) {
        this.bookingId = bookingId;
        this.customerId = customerId;
        this.carId = carId;
        this.bookingDate = bookingDate;
        this.noOfDays = noOfDays;
        this.rentStartDate = rentStartingDate;
        this.rentEndDate = rentEndDate;
        this.paidAmount = amountPaid;
        this.balanceAmount = balanceAmount;
    }

    public UUID getCarId() {
        return carId;
    }

    public void setCarId(UUID carId) {
        this.carId = carId;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public int getNoOfDays() {
        return noOfDays;
    }

    public void setNoOfDays(int noOfDays) {
        this.noOfDays = noOfDays;
    }

    public LocalDate getRentStartDate() {
        return rentStartDate;
    }

    public void setRentStartDate(LocalDate rentStartDate) {
        this.rentStartDate = rentStartDate;
    }

    public double getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(double paidAmount) {
        this.paidAmount = paidAmount;
    }
    public UUID getBookingId() {
        return bookingId;
    }

    public void setBookingId(UUID bookingId) {
        this.bookingId = bookingId;
    }

}
