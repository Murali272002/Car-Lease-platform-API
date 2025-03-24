package com.car.car.controller;

import com.car.car.model.BookingRequestDTO;
import com.car.car.model.Car;
import com.car.car.service.RentalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/rental")
public class RentalController {

    @Autowired
    RentalService rentalService;

    @GetMapping("/get-cars")
        public List<Car> getAvailableCars(){
            return rentalService.getAvailableCars();
        }

    @PostMapping("/rent-car/booking")
    public String rentCar(@RequestBody BookingRequestDTO bookingRequestDTO){
        return rentalService.rentCar(bookingRequestDTO);
    }

    @PostMapping("/return-car/carId/{carId}")
    public String returnCar(@PathVariable UUID carId){
        return rentalService.returnCar(carId);
    }
}
