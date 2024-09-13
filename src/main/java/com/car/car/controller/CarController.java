package com.car.car.controller;

import com.car.car.model.Car;
import com.car.car.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car/api")
public class CarController {

    @Autowired
    CarService carService;

    @GetMapping("/getname")
    public String getName(){
        return "Muralidharan.n!!!";
    }
    @PostMapping("/car")
    public Car addCar(@RequestBody Car car){
        return carService.addCar(car);
    }

    @GetMapping("/cars")
    public List<Car> getCars(){
        return carService.getCars();
    }
}
