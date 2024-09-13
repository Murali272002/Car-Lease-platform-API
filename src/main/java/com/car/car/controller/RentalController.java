package com.car.car.controller;

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

    @PostMapping("/rent-car/customerId/{customerId}/carId/{carId}/days/{days}")
    public String rentCar(@PathVariable UUID customerId,@PathVariable UUID carId,@PathVariable int days){
        return rentalService.rentCar(customerId,carId,days);
    }

    @PostMapping("/return-car/carId/{carId}")
    public String returnCar(@PathVariable UUID carId){
        return rentalService.returnCar(carId);
    }
}
